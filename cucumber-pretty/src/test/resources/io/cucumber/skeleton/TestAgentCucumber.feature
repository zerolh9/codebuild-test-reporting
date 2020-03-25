Feature: Cucumber tests for agent

  Dummy tests to generate cucumber reports for agent


  @UndefinedTest
  Scenario: Generate reports for undefined test steps
    Given I print out lines saying This is a undefined test
    Given I write an undefined step
    When I run the test with the undefined step
    Then I should have a skip test step
    And The test is marked as skipped

  @UndefinedTest
  Scenario Outline: Generate reports for undefined test steps with scenario outline
    Given I write an undefined step to <operation>
    When I <operation> with the undefined step
    Then I should have a skip test step
    And The test is marked as skipped
    Examples:
    | operation                        |
    | run undefined dummy test         |
    | run another undefined dummy test |

  @PendingTest
  Scenario: Generate reports for pending test steps
    Given I write an pending step
    When I run the test with the pending step
    Then I should have a pending test step
    And The test is marked as pending

  @PendingTest
  Scenario Outline: Generate reports for pending test steps with scenario outline
    Given I print out lines saying This is a pending test
    Given I write an pending step to <operation>
    When I <operation> with the pending step
    Then I should have a pending test step
    And The test is marked as pending
    Examples:
      | operation                      |
      | run pending dummy test         |
      | run another pending dummy test |

  @FailedTest
  Scenario: Generate reports for failed test steps
  Given I print out lines saying This is a failed test
  When I write a failed step
  Then This step should be skipped
  And This step should be skipped

  @ErrorTest
  Scenario: Generate reports for error test steps
    Given I print out lines saying This is an error test
    When I write an error step
    Then This step should be skipped
    And This step should be skipped

  @ThrowErrorTest
  Scenario: Generate reports for throw error test steps
    Given I print out lines saying This is a throw error test
    When I write a throw error step
    Then This step should be skipped
    And This step should be skipped

  @SucceededTest
  Scenario: Generate reports for succeeded test steps
    Given I print out lines saying This is a succeeded test
    When I write a succeeded step
    Then This step should succeed
    And This step should succeed

  @MixedStepsTest
  Scenario: Generate reports for mixed test steps
    Given I print out lines saying This is a mixed step test
    When I write an undefined step
    And I write an pending step
    And I write a succeeded step
    Then This step should succeed


