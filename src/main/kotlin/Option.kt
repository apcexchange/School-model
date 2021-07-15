class Option() {

// this are my menu class, to decongest my main fun
    fun welcomeOption() {
        val nonAcademicStaff = NonAcademicStaff()
        val teacher = Teacher()
        var select = true
        while (select) {
            println("please Select a login Option below \n1.  Staff  \n2.   Applicant \n3.   Student  \n0.   quit App")
            when (Integer.valueOf(readLine()!!.toInt())) {
                1 -> {
                    var option = true
                    while (option) {
                        println("Kindly select the category of Staff")
                        println("1. principal      \n2. non Academic Staff    \n3.  Teacher   \n0. Go back")
                        when (Integer.valueOf(readLine()!!.toInt())) {
                            1 -> {
                                var  selection = true
                                while (selection){
                                println("Select \n1)to view Principal details \n2)to view list of Applicant \n3)to hire applicant \n4)to expel student \n select 0 to go back")
                                when (Integer.valueOf(readLine())) {
                                    1 -> Principal.principalDetails()
                                    2 -> Principal.showAdmittedApplicant()
                                    3 -> Principal.admitApplicant(Applicant.applicantList)

                                    4 -> {
                                        println("list of student in school is")
                                        println(Student.studentList)
                                        println("Enter Student firstName of student to expel")
                                        var studentName = readLine().toString()
                                        Principal.expelStudent(studentName)
                                    }
                                    0-> selection = false
                                }
                                }
                            }
                            2 -> {
                                nonAcademicStaff.duties()
                            }
                            3->{
                                teacher.teacherDetails()
                                teacher.teach()
                            }
                            0-> option = false
                        }

                    }
                }
                2 -> {

                    Applicant.applicantDetails()

                }
                3 ->{
                    Student.studentDetails()
                    Student.classes()
                    Student.courses()

                }
                0 -> select = false
            }
        }
    }
}

