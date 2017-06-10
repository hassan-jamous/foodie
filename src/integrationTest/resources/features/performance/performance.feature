@foodie

Feature: performance

  @performance @soapui
  Scenario: Git offers performance
    Given a valid user is supplied
    And  git offer performance test runs for "60" seconds and "160" threads
    When test is finished
    Then git offer should handle more than "8" transactions per second
    And  git offer error rate is less than "5" percent

