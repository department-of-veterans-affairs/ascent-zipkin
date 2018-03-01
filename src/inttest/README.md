# README #

This document provides the details of **Ascent zipkin Acceptance test** .

## Acceptance test for Ascent Zipkin ##
Acceptance test are created to make sure the core services in ascent gateway are working as expected.

Project uses Java - Maven platform, the REST-Assured jars for core API validations. It also uses selenium webdriver for UI validation.

## Project Structure ##

src/inttest/gov/va/ascent/features - This is where you will create the cucumber feature files that contain the Feature and Scenarios for the zipkin service you are testing.

src/inttest/java/gov/va/ascent/zipkin/steps- The implementation steps related to the feature and scenarios mentioned in the cucumber file for the API needs to be created in this location.

src/inttest/java/gov/va/ascent/zipkin/pages-  The object repository for each page is specified here. For each components or page there should be a corresponding page class. This Page class will find the Web Elements of that web page and contains Page methods which perform operations on those Web Elements.

src/inttest/java/gov/va/ascent/zipkin/runner - Cucumber runner class that contains all feature file entries that needs to be executed at runtime. The annotations provided in the cucumber runner class will assist in bridging the features to step definitions.

src/inttest/resources/logback-test.xml - Logback Console Appender pattern and loggers defined for this project

src/inttest/resources/config/vetservices-ci.properties – CI configuration properties such as URL are specified here.

src/inttest/resources/config/vetservices-stage.properties – STAGE configuration properties such as URL are specified here.

## Execution ##
**Command Line:** Use this command(s) to execute the zipkin acceptance test. 

Default Local: mvn -Ddockerfile.skip=true integration-test -Pinttest

Note: By default, mvn verify –Pinttest executes the test in headless browser

mvn verify -Pinttest -Dbrowser=BrowserName

Here BrowserName  can be “HtmlUnit” or “CHROME”

If you want to execute the test in chrome browser. Use this below command. 

mvn clean verify -Pinttest -Dbrowser=CHROME -DwebdriverPath=”Path of the chrome driver”

Use below sample commands to execute for different environment:

CI:mvn -Ddockerfile.skip=true integration-test -Pinttest -Dbrowser=HtmlUnit -Dtest.env=ci -DX-Vault-Token=<>  -DbaseURL=https://ci.internal.vetservices.gov:8700 -Dvault.url=https://vault.internal.vetservices.gov:8200/v1/secret/application

STAGE: mvn -Ddockerfile.skip=true integration-test -Pinttest -Dbrowser=HtmlUnit -Dtest.env=stage -DX-Vault-Token=<>  -DbaseURL=https://stage.internal.vetservices.gov:8700 -Dvault.url=https://vault.internal.vetservices.gov:8200/v1/secret/application

The parameter X-Vault-Token is not valid for local environment. It is passed thru pipeline. 



