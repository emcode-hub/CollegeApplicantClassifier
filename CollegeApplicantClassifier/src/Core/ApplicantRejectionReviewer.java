package Core;

import RejectCriteria.RejectionAgeChecker;
import RejectCriteria.RejectionFeloniesChecker;
import RejectCriteria.RejectionGPAPercentageChecker;
import RejectCriteria.RejectionNameCaseChecker;

public class ApplicantRejectionReviewer {	
	public boolean getResult(Applicant applicant) {
		final boolean passedFeloniesTest = new RejectionFeloniesChecker().passedCheck(applicant);
		final boolean passedGpaPercentageTest = new RejectionGPAPercentageChecker().passedCheck(applicant);
		final boolean passedAgeTest = new RejectionAgeChecker().passedCheck(applicant);
		final boolean passedNameCaseTest = new RejectionNameCaseChecker().passedCheck(applicant);
		
		return !passedFeloniesTest || !passedGpaPercentageTest 
				|| !passedAgeTest || !passedNameCaseTest;
	}
}
