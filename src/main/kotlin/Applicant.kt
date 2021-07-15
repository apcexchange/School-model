class Applicant:Person() {
    companion object {
        override fun toString(): String {
            return super.toString()
        }

        //  applicant submit their details
        var applicantList: ArrayList<Applicant> = ArrayList()
        fun applicantDetails() {
            var applicant1 = Applicant()
            println("Enter your full firstName")
            applicant1.firstName = readLine().toString()
            println("Enter your full lastName")
            applicant1.lastName = readLine().toString()
            println("Enter your age")
            applicant1.age = readLine()!!.toInt()
            println("chose your gender")
            applicant1.sex = readLine()!!.toString()
            println("your application has been successfully submitted")
            applicantList.add(applicant1)
        }

    }
}