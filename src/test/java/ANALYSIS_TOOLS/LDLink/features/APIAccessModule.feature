Feature: These are the scenarios that cover the API functionality of LDLink

  @NEEDSREVIEW @matakevin @selenium
  Scenario: POST Request for LDLinks LDExpress API Module
    When the POST requests for LDExpress is sent
    Then the 200 status is returned for LDExpress

  @Smoke @matakevin @selenium
  Scenario: GET Request for LDLinks LDHap API Module
    When the GET requests for LDHap is sent
    Then the 200 status is returned for LDHap

  @NEEDSREVIEW @matakevin @selenium
  Scenario: GET Request for LDLinks LDMatrix API Module
    When the GET requests for LDMatrix is sent
    Then the 200 status is returned for LDMatrix GET call

  @NEEDSREVIEW @matakevin @selenium
  Scenario: POST Request for LDLinks LDMatrix API Module
    When the POST requests for LDMatrix is sent
    Then the 201 status is returned for LDMatrix POST call

  @Smoke @matakevin @selenium
  Scenario: GET Request for LDLinks LDPair API Module
    When the GET requests for LDPair is sent
    Then the 200 status is returned for LDPair GET call

  @NEEDSREVIEW @matakevin @selenium
  Scenario: POST Request for LDLinks LDPair API Module
    When the POST requests for LDPair is sent
    Then the 201 status is returned for LDPair POST call

  @NEEDSREVIEW @matakevin @selenium
  Scenario: GET Request for LDLinks LDPop API Module
    When the GET requests for LDPop is sent
    Then the 200 status is returned for LDPop

  @NEEDSREVIEW @matakevin @selenium
  Scenario: GET Request for LDLinks LDProxy API Module
    When the GET requests for LDProxy is sent
    Then the 200 status is returned for LDProxy

  @NEEDSREVIEW @matakevin @selenium
  Scenario: POST Request for LDLinks SNPChip API Module
    When the POST requests for SNPChip is sent
    Then the 201 status is returned for SNPChip

  @NEEDSREVIEW @matakevin @selenium
  Scenario: POST Request for LDLinks SNPClip API Module
    When the POST requests for SNPClip is sent
    Then the 201 status is returned for SNPClip