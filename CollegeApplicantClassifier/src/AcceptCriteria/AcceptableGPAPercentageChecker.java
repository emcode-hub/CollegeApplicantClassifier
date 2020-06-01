package AcceptCriteria;

import Core.Applicant;

public class AcceptableGPAPercentageChecker {
	final private double minAcceptablePercentage = 90;

	public boolean passedCheck(Applicant applicant) {
		return applicant.getGpaPercentage() >= minAcceptablePercentage;
	}
	
}
