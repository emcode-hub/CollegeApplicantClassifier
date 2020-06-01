package RejectCriteria;

import Core.Applicant;

public interface RejectCheckerInterface {
	public boolean passedCheck(Applicant applicant);
	public void appendMessage();
}
