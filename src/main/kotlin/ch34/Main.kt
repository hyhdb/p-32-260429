package ch34

open class Animal { // 이제 상속 가능
    open fun makeSound() {
        println("Some generic animal sound")
    }
}

open class Dog : Animal() {
    override fun makeSound() { // 메서드 오버라이딩 가능
        println("Bark! Bark!")
    }
}

class YellowDog : Dog() {
    override fun makeSound() { // override 메서드는 기본적으로 open
        println("Woof! Woof!")
    }
}

fun main() {
    val dog = Dog()
    dog.makeSound() // 출력: Bark! Bark!
}