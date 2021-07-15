class Teacher {

// i collect teachers data and save them in an ArrayList
    var teacherList: ArrayList<Applicant> = ArrayList()
    fun teacherDetails() {
        var teacher1 = Applicant()
        println("Enter your full firstName")
        teacher1.firstName = readLine().toString()
        println("Enter your full lastName")
        teacher1.lastName = readLine().toString()
        println("Enter your age")
        teacher1.age = readLine()!!.toInt()
        println(" Iam  ${teacher1.firstName} ${teacher1.lastName}")
        teacherList.add(teacher1)
    }

    fun teach() {
        println("im teacher in this department and i teach a course")
    }
}