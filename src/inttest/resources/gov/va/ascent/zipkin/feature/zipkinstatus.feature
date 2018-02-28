Feature: Log in to zipkin service to check the service is up 

@zipkinstatus
  Scenario Outline: Log in to zipkin service to check the status 
      Given I pass the header information for zipkin service
      | Pragma       | no-cache        |
      When user makes a request to zipkin "<ServiceURL>"
      Then the response code must be for zipkin service 200
  Examples: 
      | ServiceURL          |
      |/actuator/health     |
     