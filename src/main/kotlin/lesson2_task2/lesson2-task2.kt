package org.example.lesson2_task2
const val number_of_permanent_employees = 50
const val salary_of_a_permanent_employee = 30000

const val number_of_interns_employees = 30
const val salary_of_a_permanent_intern = 20000

const val total_employees = number_of_interns_employees + number_of_permanent_employees

fun main() {
    val totalSalaryOfemployees = number_of_permanent_employees * salary_of_a_permanent_employee
    println("Расходы на выплату зарплаты постоянных сотрудников: $totalSalaryOfemployees")

    val totalSalaryOfInterns = number_of_interns_employees * salary_of_a_permanent_intern
    val totalSalary = totalSalaryOfemployees + totalSalaryOfInterns
    println("Общие расходы по ЗП после прихода стажеров: $totalSalary")

    val averageSalary = totalSalary/total_employees
    println("Среднюю ЗП одного сотрудника после устройства стажеров: $averageSalary")
}