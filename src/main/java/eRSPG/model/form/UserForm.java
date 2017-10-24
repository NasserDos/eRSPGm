package eRSPG.model.form;

import javax.validation.constraints.NotNull;

import eRSPG.model.Proposal;
import org.hibernate.validator.constraints.*;

public class UserForm extends BaseForm{

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull
    private String userEmail;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail() {
        this.userEmail = userEmail;
    }
}