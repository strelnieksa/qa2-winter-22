Feature: Buy ticket on www.qaguru.lv:8089/tickets
#Tickets reservations


  Scenario: Succesful ticket reservation
    Given Homepage
    When User is opening homepage www.qaguru.lv:8089/tickets

    When User is choosing start location "EZE" and destination "MEL"
    And click on button GO GO GO!

    When User is filling registration data:
      | name   | surname    | discount |
      | Alinax | De May Day | Start1   |











#      | name           | Alinax     |
#      | surname        | De May Day |
#      | discount code  | Start1     |
#      | people count   | 1          |
#      | children count | 0          |
#      | luggage count  | 3          |
#      | flight date    | 14-05-2018 |
##
#    And User press button Get Price

