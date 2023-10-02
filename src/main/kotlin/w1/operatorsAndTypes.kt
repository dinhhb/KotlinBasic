package w1

fun main() {
    val i: Int = 6
    val b1 = i.toByte()
    println(b1)

    val b2: Byte = 1 // OK, literals are checked statically
    println(b2)

//    val i1: Int = b2
//    val i2: String = b2
//    val i3: Double = b2

    val i4: Int = b2.toInt()
    println(i4)
    val i5: String = b2.toString()
    println(i5)
    val i6: Double = b2.toDouble()
    println(i6)

    val oneMillion = 1_000_000
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010
    println(oneMillion)
    println(socialSecurityNumber)
    println(hexBytes)
    println(bytes)

//    var fish = 1
//    fish = 2
//    val aquarium = 1
//    aquarium = 2

    var fish: Int = 12
    var lake: Double = 2.5
}