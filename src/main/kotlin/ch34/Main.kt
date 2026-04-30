package ch34

open class Animal { // 기본적으로 final이므로 open 필요
    open fun makeSound() {
        println("Some generic animal sound")
    }
}

class Dog : Animal() {
    override fun makeSound() {
        println("Bark! Bark!")
    }
}

fun main() {
    val dog = Dog()
    dog.makeSound() // 출력: Bark! Bark!
}