package Core;

public final class CollegeApplicantClassifier{
	private final String result;
	private ApplicantRejectionReviewer appRejectionReviewer = new ApplicantRejectionReviewer();
	private ApplicantAcceptanceReviewer appAcceptanceReviewer = new ApplicantAcceptanceReviewer();
	
	CollegeApplicantClassifier(Applicant applicant){
			result = classifyApplicant(applicant);
	}
	
	private String classifyApplicant(Applicant applicantToTest) {
		if(appRejectionReviewer.getResult(applicantToTest)) {
			return "Instant reject due to the following reasons:" + 
					applicantToTest.getRejectMessage();
		}
		else if (appAcceptanceReviewer.getResult(applicantToTest)) {
			return "Instant accept!";
		}
		else {
			return "Further review needed";
		}
	}
	
	public String getResult() {
		return result;
	}
	
}
