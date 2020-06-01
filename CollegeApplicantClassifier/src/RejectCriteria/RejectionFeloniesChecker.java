package RejectCriteria;

import Core.Applicant;

public class RejectionFeloniesChecker implements RejectCheckerInterface{
	private Applicant applicantInTest;
	final private int allowedFeloniesInPastFiveYears = 0;

	@Override
	public boolean passedCheck(Applicant applicant) {
		applicantInTest = applicant;
		if(applicantInTest.getFelonies() > allowedFeloniesInPastFiveYears) {
			appendMessage();
			return false;
		}
		return true;
	}
	
	@Override
	public void appendMessage() {
		applicantInTest.appendToRejectMessage("\nNumber of felonies is unacceptable");
	}
}
