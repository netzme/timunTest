Feature: Convert Temperature

  Background:
    Given Main Activity


  Scenario: Convert Temperature from Fahrenheit to Celcius


    Given Temperature in Fahrenheit
    When   I Was input temperature
    Then I Should get Temperature in Celcius