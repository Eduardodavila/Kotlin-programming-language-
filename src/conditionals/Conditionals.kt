package conditionals

fun main(args: Array<String>) {

    val age: Int = 29


    if (age < 18) {

        println("You cannot register!")

    } else if (age < 21) {

        println("Well, maybe you can register!")

    } else if (age < 30) {

        println("You should be able to register!")

    } else {

        println("You're good to go!")
    }
    println("The end.")

}