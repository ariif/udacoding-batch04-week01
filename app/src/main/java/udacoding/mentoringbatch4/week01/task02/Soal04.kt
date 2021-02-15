package udacoding.mentoringbatch4.week01.task02

class Soal04 {

fun main(args: Array<String>) {


    val kota = arrayOf("jakarta", "jakarta", "Padang", "Solo",
            "Padang", "Bandung", "Padang", "Malang", "Bali")
    println(kota.groupingBy { it }.eachCount())

 }
}