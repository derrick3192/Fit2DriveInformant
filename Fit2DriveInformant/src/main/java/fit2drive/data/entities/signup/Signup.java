package fit2drive.data.entities.signup;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import fit2drive.data.entities.F2DEntity;
import fit2drive.data.entities.employee.Employee;
import fit2drive.data.entities.workshop.Workshop;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Entity
@Table(name="Signup") 
@Data
@EqualsAndHashCode(callSuper=false)
public class Signup extends F2DEntity {
	
	public Signup(){}
	
	/** <code>Facilitator</code> which applied. **/
	Employee facilitator;
	
	/** Workshop chosen. **/
	Workshop workshop;
	
	/** Date applied **/
	Date dataApplied;


}
