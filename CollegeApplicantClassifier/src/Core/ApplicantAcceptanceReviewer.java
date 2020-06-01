package Core;

import AcceptCriteria.AcceptableAgeChecker;
import AcceptCriteria.AcceptableGPAPercentageChecker;
import AcceptCriteria.AcceptableScoresForSATorACT;

public class ApplicantAcceptanceReviewer {
	public boolean getResult(Applicant applicant) {
		final boolean isInstantReject = new ApplicantRejectionReviewer().getResult(applicant);
		final boolean passedAgeTest = new AcceptableAgeChecker().passedCheck(applicant);
		final boolean passedGpaPercentageTest = new AcceptableGPAPercentageChecker().passedCheck(applicant);
		final boolean passedSatOrActTest = new AcceptableScoresForSATorACT().passedCheck(applicant);
		
		return !isInstantReject && passedAgeTest 
				&& passedGpaPercentageTest && passedSatOrActTest;
	}

}
