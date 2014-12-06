package fit2drive.data.entities.workshop;

import java.util.Date;

import javax.persistence.Entity;

import fit2drive.data.entities.F2DEntity;
import fit2drive.data.entities.employee.Employee;
import fit2drive.data.entities.school.School;

@Entity
public class Workshop extends F2DEntity{
	
	public Workshop(){}
	
	Employee presentor1;
	
	Employee presentor2;
	
	School school;
	
	int noOfExpectedStudents;
	
	Date dateOfWorkshop;

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

	public Employee getPresentor1() {
		return presentor1;
	}

	public void setPresentor1(Employee presentor1) {
		this.presentor1 = presentor1;
	}

	public Employee getPresentor2() {
		return presentor2;
	}

	public void setPresentor2(Employee presentor2) {
		this.presentor2 = presentor2;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public int getNoOfExpectedStudents() {
		return noOfExpectedStudents;
	}

	public void setNoOfExpectedStudents(int noOfExpectedStudents) {
		this.noOfExpectedStudents = noOfExpectedStudents;
	}

	public Date getDateOfWorkshop() {
		return dateOfWorkshop;
	}

	public void setDateOfWorkshop(Date dateOfWorkshop) {
		this.dateOfWorkshop = dateOfWorkshop;
	}


}
