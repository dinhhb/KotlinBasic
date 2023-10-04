package w2

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}


fun main(){
    val waterFilter: (Int) -> Int = { dirty : Int -> dirty / 2}
    println(updateDirty(30, waterFilter))

    fun increaseDirty( start: Int ) = start + 1

    println(updateDirty(15, ::increaseDirty))

    var dirtyLevel = 19
    dirtyLevel = updateDirty(dirtyLevel) { dirtyLevel -> dirtyLevel + 23}
    println(dirtyLevel)
}