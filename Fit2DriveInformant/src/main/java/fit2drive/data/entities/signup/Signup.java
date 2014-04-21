package fit2drive.data.entities.signup;

import java.util.Date;

import javax.persistence.Entity;

import fit2drive.data.entities.F2DEntity;
import fit2drive.data.entities.employee.Employee;
import fit2drive.data.entities.workshop.Workshop;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Entity
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
