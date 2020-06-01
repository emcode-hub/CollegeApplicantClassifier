package AcceptCriteria;

import Core.Applicant;

public class AcceptableAgeChecker{
	private Applicant applicantInTest;

	public boolean passedCheck(Applicant applicant) {
		applicantInTest = applicant;
		final boolean applicantIsInState = new AcceptableInStateChecker().passedCheck(applicant); 
		
		if((applicantIsInState && HasAcceptableInStateAge()) 
				|| HasAcceptableOutOfStateAge()){
			return true;
		}
		return false;
	}
	
	private boolean HasAcceptableInStateAge() {
		final int minInStateAcceptableAge = 17;
		final int maxInStateAcceptableAge = 26;
		
		return applicantInTest.getApplicantAge() >= minInStateAcceptableAge 
				&& applicantInTest.getApplicantAge() < maxInStateAcceptableAge;
	}
	
	private boolean HasAcceptableOutOfStateAge() {
		final int maxOutOfStateAcceptableAge = 80;
		
		return applicantInTest.getApplicantAge() > maxOutOfStateAcceptableAge;
	}
}

