package one.digitalinnovation.digionebank

class Manager(
    name: String,
    id: String,
    salary: Double,
    val password: String
) : Employee(name= name, id = id, salary = salary), Logged {
    override fun bonusCalculation(): Double = salary * 0.4

    override fun login(): Boolean = "password123" == password
}