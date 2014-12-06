package fit2drive.data.entities.signup;

import java.util.Date;

import javax.persistence.Entity;

import fit2drive.data.entities.F2DEntity;
import fit2drive.data.entities.employee.Employee;
import fit2drive.data.entities.workshop.Workshop;


@Entity
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

	public Employee getFacilitator() {
		return facilitator;
	}

	public void setFacilitator(Employee facilitator) {
		this.facilitator = facilitator;
	}

	public Workshop getWorkshop() {
		return workshop;
	}

	public void setWorkshop(Workshop workshop) {
		this.workshop = workshop;
	}

	public Date getDataApplied() {
		return dataApplied;
	}

	public void setDataApplied(Date dataApplied) {
		this.dataApplied = dataApplied;
	}


}
