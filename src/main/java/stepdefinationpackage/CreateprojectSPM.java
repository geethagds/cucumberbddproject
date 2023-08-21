package stepdefinationpackage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pagespackage.Createpagexpaths;

public class CreateprojectSPM extends Createpagexpaths {
    @Given("^User click on createproject button$")
    public void user_click_on_createproject_button() throws Throwable {
    	createproject();
    }
    @When("^User enter project name$")
    public void user_enter_project_name() throws Throwable {
    	pname("name");
    }

    @And("^User click on create button$")
    public void user_click_on_create_button() throws Throwable {
    	createbutton();
    }

}
