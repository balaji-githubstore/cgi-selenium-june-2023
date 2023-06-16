package com.cgi.steps;

import org.openqa.selenium.By;

import com.cgi.base.AutomationWrapper;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeSteps {
	private AutomationWrapper wrapper;

	public EmployeeSteps(AutomationWrapper wrapper) {
		this.wrapper = wrapper;
	}

	@When("I click on PIM menu")
	public void i_click_on_pim_menu() {
		wrapper.driver.findElement(By.xpath("//*[text()='PIM']")).click();
	}

	@When("I click on Add Employee")
	public void i_click_on_add_employee() {

	}

	@When("I fill the new employee details")
	public void i_fill_the_new_employee_details(io.cucumber.datatable.DataTable dataTable) {

	}

	@When("I click on save")
	public void i_click_on_save() {

	}

	@Then("I should get the message as {string}")
	public void i_should_get_the_message_as(String string) {

	}
}
