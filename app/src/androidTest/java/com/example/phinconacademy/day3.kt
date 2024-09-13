package com.example.phinconacademy

fun main() {
    val Employee = Employee("anas", "12", 10000000)


}

class Employee(private val name: String, private val id: String, salary: Int) {
    private var _salary = salary

    fun addSalary(amount: Int) {
        _salary += amount

    }

    fun getSalary(): Int {
        return _salary
    }
}
