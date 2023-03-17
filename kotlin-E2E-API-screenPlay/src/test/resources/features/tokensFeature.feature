@transfers
@accessToken @onBoarding

Feature: Security Credentials

  ** As a ** YEPEX's user
  ** I want to ** manage all different tokens for each Kind of client.
  ** So that I can *** perform consumes to API's of YEPEX

  @toClientCdeOk
  Scenario Outline: Validate generation of Token CDE successful
    Given <clientName> is a YEPEX's user


    Examples:
      | clientName |
      | Sebastian  |

