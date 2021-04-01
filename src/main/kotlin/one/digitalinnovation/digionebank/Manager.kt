package one.digitalinnovation.digionebank

class Manager(
    name: String,
    id: String,
    salary: Double
) : Employee(name= name, id = id, salary = salary) {
    override fun bonusCalculation(): Double = salary * 0.4
}