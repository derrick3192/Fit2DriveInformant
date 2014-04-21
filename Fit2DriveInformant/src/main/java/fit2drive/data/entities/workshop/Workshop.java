package fit2drive.data.entities.workshop;

import java.util.Date;

import javax.persistence.Entity;

import fit2drive.data.entities.F2DEntity;
import fit2drive.data.entities.employee.Employee;
import fit2drive.data.entities.school.School;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
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


}
