package com.example.designpaternpractise.structural.adapter

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val targetInterface: CreditCart = BankCustomer()
    targetInterface.giveBankDetails()
    System.out.print(targetInterface.getCreditCard())
}

public interface CreditCart {
    fun giveBankDetails()
    fun getCreditCard(): String
}

open class BankDetails {
    lateinit var bankName: String
    var accHolderName: String? = null
    var accNumber: Long = 0
} // End of the Ban

class BankCustomer : BankDetails(), CreditCart {
    override fun giveBankDetails() {
        try {
            val br = BufferedReader(InputStreamReader(System.`in`))
            print("Enter the account holder name :")
            val customername: String = br.readLine()
            print("\n")
            print("Enter the account number:")
            val accno: Long = br.readLine().toLong()
            print("\n")
            print("Enter the bank name :")
            val bankname: String = br.readLine()
            accHolderName = customername
            accNumber = accno
            bankName = bankname
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    override fun getCreditCard(): String {
        return ("the account number $accNumber of $accHolderName in $bankName " +
                "bank is valid and authenticated for issuing the credit card.")


    }

}