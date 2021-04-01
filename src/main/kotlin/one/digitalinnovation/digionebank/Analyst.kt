package one.digitalinnovation.digionebank



class Analyst(
    name: String,
    id: String,
    salary:Double
):Employee( name, id, salary) {
    override fun bonusCalculation() = (salary * 0.1)

}