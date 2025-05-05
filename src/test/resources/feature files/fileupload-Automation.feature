@WorkBook3
Feature: Upload file from device and download after compressing it

  As User
    I want to upload a pdf file
    so that i can compress and download it

Scenario:
  Given User is on smallPDF compress pdf page
  When User uploads file to compress
  Then User should be able to compress and download