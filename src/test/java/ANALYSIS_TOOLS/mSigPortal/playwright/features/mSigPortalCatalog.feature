Feature:These are the scenarios for the mSigPortal Catalog application

  @satya1 @Smoke @Regression @playwright
  Scenario: Verify User is able to download plot data under catalogue card
    Given User navigates to the mSigPortal Website
    When User clicks on the catalogue card on the mSigPortal website
    Then User clicks on the environmental mutagenesis category
    Then User clicks on the aromatic amines and then selects etiology
    Then User clicks on the download plotly data button under the category

  @satya1 @Smoke @Regression @playwright
  Scenario: Verify User calculates the mutational profile data and then check for the downloading the plot for the result
    Given User navigates to the mSigPortal Website
    When User clicks on the catalogue card on the mSigPortal website
    Then User clicks on the reference signature under catalogue
    Then User clicks on the RS profile tab and calculates to visualize the mutational signature profile
    Then Verify that mutational profile plot is shown
    Then User downloads the plot data through the Download Plotly Data button

  @satya1 @Smoke @Regression @playwright
  Scenario: Verify new plot can be added and calculation is also working
    Given User navigates to the mSigPortal Website
    When User clicks on the catalogue card on the mSigPortal website
    Then User clicks on the reference signature under catalogue
    Then User clicks on the RS profile tab and calculates to visualize the mutational signature profile
    Then Verify that mutational profile plot is shown
    Then User downloads the plot data through the Download Plotly Data button
    Then User adds a new plot and calculates the data for the selected resource
    Then Verfy the new plot displayed and download the data
    Then User clicks on the remove plot

  @satya1 @Smoke @Regression @playwright
  Scenario: Verify new plot can be added and calculation is also working
    Given User navigates to the mSigPortal Website
    When User clicks on the catalogue card on the mSigPortal website
    Then User clicks on the download under catalogue
    Then User clicks on the download matrixes for all available mutational signatures