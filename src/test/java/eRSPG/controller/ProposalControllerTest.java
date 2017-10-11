package eRSPG.controller;

<<<<<<< HEAD
import eRSPG.model.AwardType;
import eRSPG.model.form.AwardTypeForm;
import eRSPG.model.form.DepartmentForm;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.view.InternalResourceView;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

public class ProposalControllerTest {

    @Test
    public void testAwardTypeForm() throws Exception
    {

        ProposalController controller = new ProposalController()
        {
            @ModelAttribute
            public DepartmentForm mockModel1()
            {
                DepartmentForm deptForm = new DepartmentForm();
                deptForm.setSemesterID(1);
                return deptForm;
            }

            @ModelAttribute
            public AwardTypeForm mockModel2()
            {
                AwardTypeForm awardTypeForm = new AwardTypeForm();
                return awardTypeForm;
            }

        };
        MockMvc mockMvc = standaloneSetup(controller)
                .setSingleView(new InternalResourceView("/WEB-INF/views/projectIndex.jsp"))
                .build();

        mockMvc.perform(get("/proposal/awardType"))
            .andExpect(view().name("projectIndex"))
            .andExpect(model().attributeExists("semester"))
            .andExpect(model().attribute("semester", "Spring"));


    }

=======
import com.google.common.collect.ImmutableList;
import eRSPG.Repository.ProposalDAO;
import eRSPG.model.Proposal;
import org.testng.annotations.Test;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.testng.Assert.*;

public class ProposalControllerTest {
    private ProposalController proposalController = new ProposalController();
    private ProposalDAO proposalDAOMock;

//    @Test
//    public void list_proposal_user_empty() {
//        proposalDAOMock = mock(ProposalDAO.class);
//        proposalController.proposalDao = proposalDAOMock;
//        when(proposalDAOMock.findAllProposals()).thenReturn(ImmutableList.of(new Proposal(),new Proposal()));
//        List<Proposal> proposals = proposalController.proposalList("");
//        assert proposals.size() == 2;
//    }
//
//    @Test
//    public void list_proposal_user_null() {
//        proposalDAOMock = mock(ProposalDAO.class);
//        proposalController.proposalDao = proposalDAOMock;
//        when(proposalDAOMock.findAllProposals()).thenReturn(ImmutableList.of(new Proposal(),new Proposal()));
//        List<Proposal> proposals = proposalController.proposalList(null);
//        assert proposals.size() == 2;
//    }
//
//    @Test
//    public void list_proposal_user() {
//        proposalDAOMock = mock(ProposalDAO.class);
//        proposalController.proposalDao = proposalDAOMock;
//        final String TEST_USER = "testUser";
//        when(proposalDAOMock.findProposalByUserId(TEST_USER)).thenReturn(ImmutableList.of(new Proposal(), new Proposal(), new Proposal()));
//        List<Proposal> proposals = proposalController.proposalList(TEST_USER);
//        assert proposals.size() == 3;
//    }
>>>>>>> 7db137a85456bb944d28ccdfe939c62437eb0d76
}