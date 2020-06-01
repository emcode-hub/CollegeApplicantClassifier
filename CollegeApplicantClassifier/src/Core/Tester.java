package Core;

public class Tester{

	public static void main(String[] args) {
		String firstName = "Arthas";
		String lastName = "Menethil";
		int age = 25;
		String state = "CA";
		double gpa = 3.6;
		double gpaScale = 4.0;
		int satScore = 1921;
		int actScore = 28;
		int felonies = 0;
		
		Applicant applicantToTest = new Applicant(firstName, lastName, age, state, 
				gpa, gpaScale, satScore, actScore, felonies);

		CollegeApplicantClassifier classifier = new CollegeApplicantClassifier(applicantToTest);
		
		System.out.println(classifier.getResult());
		}
	
}
