class Student(): Person(){

/*    i wrap these entire class in a companion object to make the function static, thereby giving me the access to use it use in
    other classes without instantiating the objects of the class   */
companion object {
    var studentList: ArrayList<Applicant> = ArrayList()
    fun studentDetails() {
        var student1 = Applicant()
        println("Enter your full firstName")
        student1.firstName = readLine().toString()
        println("Enter your lastName")
        student1.lastName = readLine().toString()
        println("Enter your age")
        student1.age = readLine()!!.toInt()
        println("welcome back ${student1.firstName}")
        studentList.add(student1)
    }

    //  class method
    fun classes(){
        println("you are in android class")
    }

    // course method
    fun courses(){
        println("you are eligible take a courses ")
    }
}




}

