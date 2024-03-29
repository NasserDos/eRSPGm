package eRSPG.model.form;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;


public class AwardTypeForm {
	
	@NotNull(message="Please select a project type")
	private int projectTypeID;
	
	@NotEmpty(message="Please select at least one award type")
	private List<Integer> awardTypes;

	

	public int getProjectTypeID() {
		return projectTypeID;
	}

	public void setProjectTypeID(int projectTypeID) {
		this.projectTypeID = projectTypeID;
	}

	public List<Integer> getAwardTypes() {
		return awardTypes;
	}

	public void setAwardTypes(List<Integer> awardTypes) {
		this.awardTypes = awardTypes;
	}
	
	

}
