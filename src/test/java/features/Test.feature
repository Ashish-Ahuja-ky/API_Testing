Feature: Verify Response data for RCB Team

Scenario: Verify that RCB team has only 4 foreign players
  Given Test json is given in "ResponseDataRcb.json"
  When Read the data of json "ResponseDataRcb"
  Then Verify that RCB team has only 4 foreign players
  
