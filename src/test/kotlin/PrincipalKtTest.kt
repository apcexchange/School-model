import org.junit.Test
import kotlin.test.assertEquals

internal class PrincipalKtTest {

    @Test
    fun admitApplicantTest_returnIfApplicantIsAdmitted() {
        val applicant1 = Applicant()
        applicant1.firstName = "Johnson"
        applicant1.age = 34

        Applicant.applicantList.add(applicant1)
        assertEquals(
            "congratulations Johnson have been admitted into this colledge",
            Principal.admitApplicant(Applicant.applicantList)
        )
    }

    @Test
    fun admitApplicantTest_returnIfApplicantIsAdmitted2() {
        val applicant2 = Applicant()
        applicant2.firstName = "John"
        applicant2.age = 15

        Applicant.applicantList.add(applicant2)
        //  Applicant.applicantList.add(applicant2)
        assertEquals(
            "John is too young to be admitted into this colledge",
            Principal.admitApplicant(Applicant.applicantList)
        )
    }

}