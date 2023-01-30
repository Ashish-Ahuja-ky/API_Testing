Feature: Verify Response data for RCB Team

Scenario: Verify that RCB team has only 4 foreign players
  Given Test json is given in "ResponseDataRcb"
  When Read the data of json "ResponseDataRcb"
  Then Verify that RCB team has only 4 foreign players

Scenario: Verify that there is alteast 1 wicket keeper
  Given Test json is given in "ResponseDataRcb"
  When Read the data of json "ResponseDataRcb"
  Then Verify that RCB team has atleast 1 wicket keeper

