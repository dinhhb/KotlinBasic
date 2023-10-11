package w3.example.myapp

fun main(){
    val scientific = hashMapOf("guppy" to "poecilia reticulata", "catfish" to "corydoras", "zebra fish" to "danio rerio" )
    println(scientific.get("guppy"))

    println(scientific.getOrDefault("swordtail", "sorry, I don't know"))
    println(scientific.getOrElse("swordtail") {"sorry, I don't know"})
}