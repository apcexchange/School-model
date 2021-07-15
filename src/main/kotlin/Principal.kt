
class Principal() : Staff() {

// i overrode the inherited properties from super class Staff
    override var firstName: String = "peter"
    override var lastName: String = "odogwu"
    override var age: Int = 45

    companion object {
        var firstName: String = "peter"
        var lastName: String = "odogwu"
        var age: Int = 45

//        this method displays the principal details when called
        fun principalDetails() {
            println("below are the details of the principal")
            println("first Name: $firstName \nlastName: $lastName  \nage: $age years old")
        }

//
        val hiredApplicant: ArrayList<Applicant> = ArrayList()

        fun admit(names: ArrayList<Applicant>) {
            for (i in names) {
                if (i.age > 18) {
                    hiredApplicant.add(i)
                }
            }
        }


//        this methode removes student from the studentlist
        fun expelStudent(studentName: String){
            for(i in Student.studentList){
                if(studentName == i.firstName){
                    Student.studentList.remove(studentName)
                    println("${studentName} has been removed from school")
                }
            }
        }

        fun showAdmitedApplicant(element: ArrayList<Applicant>) {
            for (i in element) {
                println(i)
            }
        }

//        this method checks if the applicant age is greater than 18, else the applicant is not admitted
        fun admitApplicant(array:ArrayList<Applicant>):String {
            for(i in array) {
                if (i.age < 18) {
                    return "${i.firstName} is too young to be admitted into this colledge"
                } else {
                    return "congratulations ${i.firstName} have been admitted into this colledge"
                }
            }
        return ""
        }

        fun showAdmittedApplicant() {
            println(Applicant.applicantList)


        }



    }
}
