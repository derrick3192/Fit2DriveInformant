package fit2drive.data.entities.feedback;


import java.util.Date;

import javax.persistence.Entity;

import fit2drive.data.entities.F2DEntity;
import fit2drive.data.entities.school.School;
import fit2drive.data.members.likelyhood.LikelyHood;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Entity
@Data
@EqualsAndHashCode(callSuper=false)
public class Feedback extends F2DEntity{
	
	public Feedback(){}
	
	School school;
	
	Date data;
	
	int age;
	
	boolean male;
	
	boolean female;
	
	boolean canRememberFacilitator;
	
	String facilitator;
	
	LikelyHood howMuchWillStratergiesBeUsed;

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
