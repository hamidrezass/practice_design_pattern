package com.example.designpaternpractise.structural.decorator


fun main() {
    val salaryRecords = "Name,Salary John Smith,100000 Steven Jobs,912000"
    val encoded: DataSourceDecorator = CompressionDecorator(
        EncryptionDecorator(
            FileDataSource("out/OutputDemo.txt")
        )
    )
    encoded.writeData(salaryRecords)
    val plain: DataSource = FileDataSource("out/OutputDemo.txt")

    println("- Input ----------------")
    println(salaryRecords)
    println("- Encoded --------------")
    println(plain.readData())
    println("- Decoded --------------")
    println(encoded.readData())
}

interface DataSource {
    fun writeData(data: String)
    fun readData(): String
}

class FileDataSource(var name: String) : DataSource {
    override fun writeData(data: String) {
        print(" write into 0000 : $name")
    }

    override fun readData(): String {
        print(" read from 1111 $name")
        return " wow read file return 222222 $name"
    }

}

open class DataSourceDecorator(var wrappper: DataSource) : DataSource {
    override fun writeData(data: String) {
        wrappper.writeData(data);
    }

    override fun readData(): String {
        return wrappper.readData()
    }

}

class EncryptionDecorator( dataSource: DataSource) : DataSourceDecorator(dataSource) {

    override fun writeData(data: String) {
        super.writeData(encode(data))
    }

    override fun readData(): String {
        return decode(super.readData())
    }

    private fun encode(data: String): String {
        return " encodec 33333 $data"
    }

    private fun decode(value: String): String {
        return " decoded 444444 $value"
    }
}


class CompressionDecorator( dataSource: DataSource) : DataSourceDecorator(dataSource) {
    override fun writeData(data: String) {
        super.writeData(compress(data))
    }

    override fun readData(): String {
        return decompress(super.readData())
    }

    private fun compress(data: String): String {
        return " compress 555555 $data"
    }

    private fun decompress(value: String): String {
        return " decompress 666666 $value"
    }


}