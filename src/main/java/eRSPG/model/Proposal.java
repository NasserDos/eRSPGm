package eRSPG.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="proposal")
public class Proposal {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="proposalID")
	private int proposalId;



	@Column(name="proposalTitle")
	private String proposalTitle;
	
	@Column(name="semesterID")
	private int semesterId;
	
	@Column(name="proposalYear")
	private int proposalYear ;

	@Column(name="projectTypeID")
	private int projectTypeId;
	
	@Column(name="proposalSubmissionDate")
	private LocalDateTime submissionDate;
	
	@Column(name="projectDirector")
	private String projectDirector;
	
	@Column(name="departmentID")
	private int departmentId;

	@Column(name="proposalEmail")
	private String proposalEmail;
	
	@Column(name="proposalMailCode")
	private String proposalMailCode;
	
	@Column(name="proposalExtension")
	private String proposalExtension;
	
	@Column(name="proposalReqStudentAssistance")
	private boolean proposalReqStdAsst;
	
	@Column(name="proposalComplete")
	private boolean proposalComplete;
	
	@Column(name="updatedDate")
	private LocalDateTime updatedDate;
	
	@Column(name="proposalParticipants")
	private String proposalParticipants;

	@Column(name="userID")
	private int userId;

	public String getProposalParticipants() {
		return proposalParticipants;
	}

	public void setProposalParticipants(String proposalParticipants) {
		this.proposalParticipants = proposalParticipants;
	}

	public Proposal() {
		
	}

	public int getProposalId() {
		return proposalId;
	}

	public void setProposalId(int proposalId) {
		this.proposalId = proposalId;
	}

	public String getProposalTitle() {
		return proposalTitle;
	}

	public void setProposalTitle(String proposalTitle) {
		this.proposalTitle = proposalTitle;
	}

	public int getSemesterId() {
		return semesterId;
	}

	public void setSemesterId(int semesterId) {
		this.semesterId = semesterId;
	}

	public int getProposalYear() {
		return proposalYear;
	}

	public void setProposalYear(int proposalYear) {
		this.proposalYear = proposalYear;
	}

	public int getProjectTypeId() {
		return projectTypeId;
	}

	public void setProjectTypeId(int projectTypeId) {
		this.projectTypeId = projectTypeId;
	}

	public LocalDateTime getSubmissionDate() {
		return submissionDate;
	}

	public void setSubmissionDate(LocalDateTime submissionDate) {
		this.submissionDate = submissionDate;
	}

	public String getProjectDirector() {
		return projectDirector;
	}

	public void setProjectDirector(String projectDirector) {
		this.projectDirector = projectDirector;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getProposalEmail() {
		return proposalEmail;
	}

	public void setProposalEmail(String proposalEmail) {
		this.proposalEmail = proposalEmail;
	}

	public String getProposalMailCode() {
		return proposalMailCode;
	}

	public void setProposalMailCode(String proposalMailCode) {
		this.proposalMailCode = proposalMailCode;
	}

	public String getProposalExtension() {
		return proposalExtension;
	}

	public void setProposalExtension(String proposalExtension) {
		this.proposalExtension = proposalExtension;
	}

	public boolean isProposalReqStdAsst() {
		return proposalReqStdAsst;
	}

	public void setProposalReqStdAsst(boolean proposalReqStdAsst) {
		this.proposalReqStdAsst = proposalReqStdAsst;
	}

	public boolean isProposalComplete() {
		return proposalComplete;
	}

	public void setProposalComplete(boolean proposalComplete) {
		this.proposalComplete = proposalComplete;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
}

