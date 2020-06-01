package AcceptCriteria;

import Core.Applicant;

public class AcceptableScoresForSATorACT{

	public boolean passedCheck(Applicant applicant) {
		if(hasAcceptableSatScore(applicant) && hasAcceptableActScore(applicant)) {
			return true;
		}
		else if(hasAcceptableSatScore(applicant) && !hasAcceptableActScore(applicant)) {
			return true;			
		}
		else if(!hasAcceptableSatScore(applicant) && hasAcceptableActScore(applicant)) {
			return true;			
		}
		else {
			return false;
		}
	}

	private boolean hasAcceptableSatScore(Applicant applicant) {
		final int minSATScore = 1920;
		return applicant.getSATScore() > minSATScore;
	}

	private boolean hasAcceptableActScore(Applicant applicant) {
		final int minACTScore = 27;
		return applicant.getACTScore() > minACTScore;
	}
}
