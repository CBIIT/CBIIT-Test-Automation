Feature: CRS Submission Form

Description: This test submits a screener, impersonates DOC planning contact then submits for CRS

@Progression
Scenario: Submitting a screener for NCI Staff Member and submitting a screener to CRS

When NCI Staff Member submits a screener
Then We use NERD Users on NERD native view
And We find the corresponding user to impersonate
When We go back to NERD UI and see what DOC planning contact sees
Then We submit to CRS