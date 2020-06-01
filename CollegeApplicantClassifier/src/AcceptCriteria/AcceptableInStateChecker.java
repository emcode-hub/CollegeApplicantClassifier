package AcceptCriteria;

import Core.Applicant;

enum AcceptableStates {
	CA
}

public class AcceptableInStateChecker{
	public boolean passedCheck(Applicant applicant) {
		for(AcceptableStates acceptableState : AcceptableStates.values()) {
			if(applicant.getApplicantState().toUpperCase()
					.compareTo(acceptableState.toString()) == 0) {
				return true;
			}
		}
		return false;
	}
}

