Feature: Verify the navigation bar in the zipkin home page 
@zipkindhomepagenav
  Scenario: Verify the navigation bar links in the zipkin home page
      Given A user logins to zipkin homepage
      When the user is in zipkin dashboard page
      Then verify the links in the navigation menu
       And verify the other links in the form
      