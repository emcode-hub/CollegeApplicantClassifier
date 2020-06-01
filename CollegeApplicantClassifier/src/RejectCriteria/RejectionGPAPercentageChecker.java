package RejectCriteria;

import Core.Applicant;

public class RejectionGPAPercentageChecker implements RejectCheckerInterface{
	private Applicant applicantInTest;
	final private double minAllowedGPA_Percentage = 70;
	
	@Override
	public boolean passedCheck(Applicant applicant) {
		applicantInTest = applicant;
		if(applicantInTest.getGpaPercentage() < minAllowedGPA_Percentage) {
			appendMessage();
			return false;
		}
		return true;
	}
	
	@Override
	public void appendMessage() {
		applicantInTest.appendToRejectMessage("\nGPA percentage is unacceptable");
	}
}
