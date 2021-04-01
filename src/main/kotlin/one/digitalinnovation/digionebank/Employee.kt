package one.digitalinnovation.digionebank

//abstract class that to induces to create a member
abstract class Employee(
    name: String,
    id: String,
    val salary : Double
) : Person(name, id) {
    protected abstract fun bonusCalculation(): Double;
    //override of object class that print the data about classes
    override fun toString(): String = """
        Name: $name
        Id: $id
        Salary: $salary
        Bonus: ${bonusCalculation()}
    """.trimIndent()


}