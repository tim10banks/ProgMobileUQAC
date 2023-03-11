fun main() {
    
    val border = "*"
    val repeat = 23

    val age = 24
    val layers = 5
    
    printBorder(border, repeat)
    println("Happy Birthday, Corentin!")
    printBorder(border, repeat)

    printCakeCandles(age)
    printCakeTop(age)
    printCakeBottom(age, layers)
    
}

fun printBorder(border: String, repeat: Int){
    repeat(23) {
        print("${border}")
    }
    println()
}

fun printCakeCandles(age: Int) {
    print (" ")
    repeat(age) {
          print(",")
    }
    println()

    print(" ")
    repeat(age) {
        print("|")
    }
    println()
}

fun printCakeTop(age: Int) {
    repeat(age + 2) {
        print("=")
    }
    println()
}

fun printCakeBottom(age: Int, layers: Int) {
    repeat(layers) {
        repeat(age + 2) {
            print("@")
        }
        println()
    }
}