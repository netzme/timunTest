Feature: Test

  Background:
    Given I have a MainActivity

  Scenario:
    Fill nickname with noval and password is empty, login button is disable

    When I enter nickname is "noval"
    And password is empty
    Then login button is disable

  Scenario:
    Nickname is empty and fill password with passwd, login button is disable

    When I fill password field with "passwd"
    And nickname is empty
    Then login button is disable


  Scenario:
    Fill nickname with noval and password with passwd, login button is enable

    When I enter nickname is "noval"
    And I fill password field with "passwd"
    Then login button is enable

  Scenario:
    Fill nickname with noval and password with passwd and clear nickname again, login button is disable

    When I enter nickname is "noval"
    And I fill password field with "passwd"
    And I clear nickname
    Then login button is disable