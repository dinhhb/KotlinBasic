package w3.example.myapp

fun main(){
    val list = listOf(1, 5, 3, 4)
    val list2 = listOf("a", "bbb", "cc")
//    println(list2.sum())
//    println(list2.sumBy { it.length })
    for (s in list2.listIterator()){
        println("$s ")
    }
}
