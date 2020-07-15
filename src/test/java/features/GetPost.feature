Feature:
  Verify different Get operations using REST-assured

  Scenario: Verify one author  of the post
    Given I performm GET operation for "/post"
    And I perform GET for the post number "1"
    Then  I should see the author name as "paris"


  Scenario: Verify collection of authors in the post
    Given I performm GET operation for "/post"
    Then I should see the author name


  Scenario: Verify parameter of Get
    Given I performm GET operation for "/post"
    Then I should see verify GET parameter
