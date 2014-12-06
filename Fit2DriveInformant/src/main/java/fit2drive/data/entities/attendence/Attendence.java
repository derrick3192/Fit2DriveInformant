package fit2drive.data.entities.attendence;

import javax.persistence.Entity;

import fit2drive.data.entities.F2DEntity;

@Entity
public class Attendence extends F2DEntity {
	
	public Attendence(){}
	
	/** Did the <code>Facilitator</code> leave negative cancelation? **/
	boolean isNegativeCancelation;
	
	/** Did the <code>Facilitator</code> call in sick/busy? **/
	boolean isCanceled;
	
	/** Did the <code>Facilitator</code> work this **/
	boolean isWorked;
	
	/** The number of students the <code>Facilitator</code> had **/
	int noStudents;
	
	/** The number of positive feedbacks this <code>Facilitator</code> had **/
	int noOfPositives;


	public boolean isNegativeCancelation() {
		return isNegativeCancelation;
	}

	public void setNegativeCancelation(boolean isNegativeCancelation) {
		this.isNegativeCancelation = isNegativeCancelation;
	}

	public boolean isCanceled() {
		return isCanceled;
	}

	public void setCanceled(boolean isCanceled) {
		this.isCanceled = isCanceled;
	}

	public boolean isWorked() {
		return isWorked;
	}

	public void setWorked(boolean isWorked) {
		this.isWorked = isWorked;
	}

	public int getNoStudents() {
		return noStudents;
	}

	public void setNoStudents(int noStudents) {
		this.noStudents = noStudents;
	}

	public int getNoOfPositives() {
		return noOfPositives;
	}

	public void setNoOfPositives(int noOfPositives) {
		this.noOfPositives = noOfPositives;
	}

	@Override
	public String[] headings() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] asRow() {
		// TODO Auto-generated method stub
		return null;
	}


	
}
