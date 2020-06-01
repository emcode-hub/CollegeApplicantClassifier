package RejectCriteria;

import Core.Applicant;

public class RejectionAgeChecker implements RejectCheckerInterface{
	private Applicant applicantInTest;
	final private int minValidAge = 0;

	@Override
	public boolean passedCheck(Applicant applicant) {
		applicantInTest = applicant;
		if(applicantInTest.getApplicantAge() < minValidAge) {
			appendMessage();
			return false;
		}
		return true;
	}

	@Override
	public void appendMessage() {
		applicantInTest.appendToRejectMessage("\nAge is unacceptable");
	}
}
