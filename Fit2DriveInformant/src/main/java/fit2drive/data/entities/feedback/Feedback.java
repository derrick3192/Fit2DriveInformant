package fit2drive.data.entities.feedback;


import java.util.Date;

import javax.persistence.Entity;

import fit2drive.data.entities.F2DEntity;
import fit2drive.data.entities.school.School;
import fit2drive.data.members.likelyhood.LikelyHood;

@Entity
public class Feedback extends F2DEntity{
	
	public Feedback(){}
	
	School school;
	
	Date data;
	
	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isMale() {
		return male;
	}

	public void setMale(boolean male) {
		this.male = male;
	}

	public boolean isFemale() {
		return female;
	}

	public void setFemale(boolean female) {
		this.female = female;
	}

	public boolean isCanRememberFacilitator() {
		return canRememberFacilitator;
	}

	public void setCanRememberFacilitator(boolean canRememberFacilitator) {
		this.canRememberFacilitator = canRememberFacilitator;
	}

	public String getFacilitator() {
		return facilitator;
	}

	public void setFacilitator(String facilitator) {
		this.facilitator = facilitator;
	}

	public LikelyHood getHowMuchWillStratergiesBeUsed() {
		return howMuchWillStratergiesBeUsed;
	}

	public void setHowMuchWillStratergiesBeUsed(
			LikelyHood howMuchWillStratergiesBeUsed) {
		this.howMuchWillStratergiesBeUsed = howMuchWillStratergiesBeUsed;
	}

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
