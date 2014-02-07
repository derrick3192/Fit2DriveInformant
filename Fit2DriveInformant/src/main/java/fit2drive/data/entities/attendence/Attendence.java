package fit2drive.data.entities.attendence;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import fit2drive.data.entities.F2DEntity;

@Entity
@Table(name="Attendence") 
@Data
@EqualsAndHashCode(callSuper=false)
public class Attendence extends F2DEntity {
	
	public Attendence(){}
	
	/** Did the <code>Facilitator</code> leave negative cancelation? **/
	boolean negativeCancelation;
	
	/** Did the <code>Facilitator</code> call in sick/busy? **/
	boolean canceled;
	
	/** Did the <code>Facilitator</code> work this **/
	boolean worked;
	
	/** The number of students the <code>Facilitator</code> had **/
	int noStudents;
	
	/** The number of positive feedbacks this <code>Facilitator</code> had **/
	int noOfPositives;


	
}
