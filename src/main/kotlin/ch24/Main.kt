package ch24

class Person(
    var name: String = "",
    var age: Int = 0
) {

    fun addAge() {
        age += 1
    }
    fun printInfo() {
        println("Name: $name, Age: $age")
    }
}

fun main() {

    val person1 = Person()
    person1.name = "Alice"
    person1.age = 25

    person1.printInfo()

    val person2 = Person().apply {
        name = "Alice"
        age = 25
        addAge()
        10
    }

    person2.printInfo()

}