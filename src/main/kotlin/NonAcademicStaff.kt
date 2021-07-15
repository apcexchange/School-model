class NonAcademicStaff():Staff(){
// i overrode the inherited properties from my parent class Staff
    override var firstName: String = "joseph "
    override var lastName: String = "mike"
    override var age: Int = 30

    companion object

    //    methods that shows that duties of the non academic staff
    fun duties() {
        println("my name is $firstName  $lastName, i'm $age years old and work with the principal ")
    }

    var nonTeacher: ArrayList<NonAcademicStaff> = ArrayList()

//         var detail = NonAcademicStaff()


}
