package com.palindrome.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TestPalindrome {
    private String testPalindrome;
    private boolean isPalindrome;

    @Given("Input string {string}")
    public void input_string (String toTest) {
        testPalindrome = toTest;
    }

    @When("check test Palindrome")
    public void iTestItForPalindrome() {
        isPalindrome = testPalindrome.equalsIgnoreCase(new StringBuilder(testPalindrome).reverse().toString());
    }

    @Then("the result {string}")
    public void theResultShouldBe(String result) {
        boolean expectedResult = Boolean.parseBoolean(result);
        if (expectedResult) {
            Assert.assertTrue(isPalindrome);
        } else {
            Assert.assertFalse(isPalindrome);
        }
    }

}
