abstract class Staff(){
//    Staff is an abstract class and its to be inherited by the principal, teachers and non academic staff
    abstract var firstName: String
    abstract var lastName:String
    abstract var age:Int
    override fun toString(): String {
        return "(firstName='$firstName', lastName='$lastName', age=$age)"
    }


}


