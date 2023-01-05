package com.example.designpaternpractise.behavioral.chain.ATM

class Dollar50Dispenser : DispenseChain {

    lateinit var next: DispenseChain

    override fun dispose(currency: Currency) {
        if(currency.amount >= 50){
           val  num = currency.amount/50;
           val  remainder = currency.amount % 50;
            println("Dispensing $num 50$ note");
            if(remainder !=0) next.dispose( Currency(remainder));
        }else{
            next.dispose(currency);
        }
    }
    }