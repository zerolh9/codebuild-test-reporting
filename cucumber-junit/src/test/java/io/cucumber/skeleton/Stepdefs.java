package io.cucumber.skeleton;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import cucumber.api.PendingException;

import java.util.ArrayList;
import java.util.List;


public class Stepdefs {

    @Given("I write an pending step")
    public void i_write_an_pending_step() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I run the test with the pending step")
    public void i_run_the_test_with_the_pending_step() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("I should have a pending test step")
    public void i_should_have_a_pending_test_step() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("The test is marked as pending")
    public void the_test_is_marked_as_pending() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("I write an pending step to run pending dummy test")
    public void i_write_an_pending_step_to_run_pending_dummy_test() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I run pending dummy test with the pending step")
    public void i_run_pending_dummy_test_with_the_pending_step() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("^I print out lines saying (.*?)$")
    public void i_print_out_lines_saying(String input) {
        System.out.println(input);
    }

    @When("^I write a failed step$")
    public void i_write_a_failed_step() throws Throwable {
        assertEquals("a", "b");
    }

    @When("^I write an error step$")
    public void i_write_an_error_step() throws Throwable {
        List<String> myList = new ArrayList<String>();
        assertEquals("a", myList.get(0));
    }

    @When("^I write a throw error step$")
    public void i_write_a_throw_error_step() throws Throwable {
        throw new IllegalArgumentException();
    }

    @When("^I write a succeeded step$")
    public void i_write_a_succeeded_step() throws Throwable {
    }

    @And("^This step should be skipped$")
    public void this_step_should_be_skipped() throws Throwable {
        System.out.println("============================");
        System.out.println("If you are seeing this line in the report, then the setup is incorrect!");
        System.out.println("============================");
    }

    @And("^This step should succeed$")
    public void this_step_should_succeed() throws Throwable {
    }


}
