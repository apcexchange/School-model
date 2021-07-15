// this is an abstract class person, it contains properties that are peculiar to Student class and Applicant class
abstract class Person(){
    var  firstName: String ="life"
    var  lastName:String = "Nwike"
    var age: Int= 18
    var sex:String= "male"
    override fun toString(): String {
        return "(firstName='$firstName', lastName='$lastName', age=$age, sex='$sex')"
    }

}


