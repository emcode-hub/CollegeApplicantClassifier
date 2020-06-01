package RejectCriteria;

import Core.Applicant;

public class RejectionNameCaseChecker implements RejectCheckerInterface{
	private Applicant applicantInTest;

	@Override
	public boolean passedCheck(Applicant applicant) {
		applicantInTest = applicant;
		if((hasFirstLetterCapitalAndOthersLowerCase(applicantInTest.getFirstName())
				&& hasFirstLetterCapitalAndOthersLowerCase(applicantInTest.getLastName()))) {
			return true;
		}
		appendMessage();
		return false;
	}
	
	@Override
	public void appendMessage() {
		applicantInTest.appendToRejectMessage("\nName is not correctly capitalized");
	}
		
	private boolean hasFirstLetterCapitalAndOthersLowerCase(String name) {
		if(Character.isLowerCase(name.charAt(0))) { 
			return false;
		}
		for(int i =1; i< name.length(); i++) {
			if(Character.isUpperCase(name.charAt(i))) { 
				return false;
			}
		}
		return true;
	}
}