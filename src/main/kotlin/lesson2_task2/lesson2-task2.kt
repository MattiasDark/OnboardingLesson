package org.example.lesson2_task2


fun main() {
    val numberOfPermanentEmployees = 50
    val salaryOfaPermanentEmployee = 30000
    val numberOfInternsEmployees = 30
    val salaryOfaPermanent_intern = 20000

    val total_employees = numberOfInternsEmployees + numberOfPermanentEmployees


    val totalSalaryOfemployees = numberOfPermanentEmployees * salaryOfaPermanentEmployee
    println("Расходы на выплату зарплаты постоянных сотрудников: $totalSalaryOfemployees")

    val totalSalaryOfInterns = numberOfInternsEmployees * salaryOfaPermanent_intern
    val totalSalary = totalSalaryOfemployees + totalSalaryOfInterns
    println("Общие расходы по ЗП после прихода стажеров: $totalSalary")

    val averageSalary = totalSalary / total_employees
    println("Среднюю ЗП одного сотрудника после устройства стажеров: $averageSalary")
}