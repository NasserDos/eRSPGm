package eRSPG;

import eRSPG.Repository.*;
import eRSPG.model.AwardType;
import eRSPG.model.EssayAnswer;
import eRSPG.model.ProjectType;
import eRSPG.model.Proposal;
import eRSPG.model.form.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.List;

import eRSPG.Repository.ProposalDAO;

/**
 * Created by iNaS2 on 10/11/2017.
 */
public class UniversalRepo {

    //test methods before using

    public static Proposal rememberProposal(DetailForm detailForm,
                                    AwardTypeForm awardForm,
                                    BodyForm bodyForm,
                                    BudgetForm budgetForm,
                                    DepartmentForm deptForm,
                                    BodyQuestionsForm bodyQuestForm,
                                    BodyDetailsForm bodyDetailsForm,
                                    UserForm userForm,
                                    UploadForm uploadForm)
  {

        LocalDateTime time = LocalDateTime.now();
        Proposal proposal = new Proposal();
        proposal.setProjectDirector(detailForm.getProjectDirector());
        proposal.setProposalComplete(false);
        proposal.setProposalMailCode(detailForm.getProposalMailCode());
        proposal.setProposalExtension(detailForm.getProposalExtension());
        proposal.setProposalEmail(detailForm.getProposalEmail());
        proposal.setProposalReqStdAsst(budgetForm.getStudentAssistants());
        proposal.setProposalTitle(detailForm.getProposalTitle());
        proposal.setSemesterId(deptForm.getSemesterID());
        proposal.setProjectTypeId(awardForm.getProjectTypeID());
        proposal.setDepartmentId(deptForm.getDepartmentID());
        proposal.setProposalYear(deptForm.getYear());
        proposal.setSubmissionDate(time);
        proposal.setUpdatedDate(time);

        return proposal;
    }




    public static void setDept(Proposal proposal, DepartmentForm deptForm){

        deptForm.setDepartmentID(proposal.getDepartmentId());
        deptForm.setYear(proposal.getProposalYear());
        deptForm.setSemesterID(proposal.getSemesterId());

    }

    public static void setDetail(Proposal proposal, DetailForm detailForm) {

        detailForm.setProposalEmail(proposal.getProposalEmail());
        detailForm.setProjectDirector(proposal.getProjectDirector());
        detailForm.setProposalExtension(proposal.getProposalExtension());
        detailForm.setProposalMailCode(proposal.getProposalMailCode());
        detailForm.setProposalTitle(proposal.getProposalTitle());
    }

    public static void setAward(Proposal proposal, AwardTypeForm awardForm) {
        //AwardedDAO awardedDAO;
        //double at = awardedDAO.findAwardedByProposalID()
        //awardForm.setAwardTypes(at);
        awardForm.setProjectTypeID(proposal.getProjectTypeId());
    }

    //this method might not be needed
    public static void setUpload(Proposal proposal, UploadForm uploadForm) {

    }



    public static void setBodyDetail(Proposal proposal, BodyDetailsForm bodyDetailsForm) {
    //set bodydetail form
    }

    public static void setBodyForm(Proposal proposal, BodyForm bodyForm) {
    //set body form
    }

    public static void setBudget(Proposal proposal, BudgetForm budgetForm) {
        //set budget form
    }

    public static void setBodyQAnswers(Proposal proposal, BodyQuestionsForm bodyQuestionsForm) {
        //EssayAnswerDAO essayAnswerDAO;
        //List<EssayAnswer> ea = essayAnswerDAO.findAllEssayAnswerByProposal();
        //set the asnwers
    }
}
