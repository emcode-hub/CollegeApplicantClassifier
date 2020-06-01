package Core;
public final class Applicant {
	private final String firstName;
	private final String lastName;
	private final int applicantAge;
	private final String applicantState;
	private final double gpaPercentage;
	private final int satScore;
	private final int actScore;
	private final int felonies;
	private StringBuffer rejectMessage = new StringBuffer("");
	
	Applicant(String firstName, String lastName, int applicantAge, String applicantState, 
			double GPA, double gpaScale, int satScore, int actScore, int felonies){
		this.firstName = firstName;
		this.lastName = lastName;
		this.applicantAge = applicantAge;
		this.applicantState = applicantState;
		this.gpaPercentage = calculateGpaPercentage(GPA, gpaScale);
		this.satScore = satScore;
		this.actScore = actScore;
		this.felonies = felonies;
	}
		

	private double calculateGpaPercentage(double gpa, double gpaScale) {
		return (gpa/gpaScale)*100;
	}

	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getApplicantAge() {
		return applicantAge;
	}
	public String getApplicantState() {
		return applicantState;
	}
	public double getGpaPercentage() {
		return gpaPercentage;
	}
	public int getSATScore() {
		return satScore;
	}
	public int getACTScore() {
		return actScore;
	}
	public int getFelonies() {
		return felonies;
	}
	public StringBuffer getRejectMessage() {
		return rejectMessage;
	}
	public void appendToRejectMessage(String message) {
		this.rejectMessage.append(message);
	}
}
