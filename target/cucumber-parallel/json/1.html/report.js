$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/SeleniumWorkspace/cucumber-scenarios-parallel/cucumber-scenarios-parallel-example-master/src/test/resources/features/First/Feature1.feature");
formatter.feature({
  "name": "Test case Execution in Amazon",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@FirstFeature"
    }
  ]
});
formatter.scenario({
  "name": "Scenario 1 Open url in Amazon First Feature",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FirstFeature"
    },
    {
      "name": "@smoketest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "i open the url \"https://www.amazon.in/\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.StepdefinitionTest.i_open_the_url(String) in file:/C:/SeleniumWorkspace/cucumber-scenarios-parallel/cucumber-scenarios-parallel-example-master/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Scenario 2 Open url in Amazon First Feature",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FirstFeature"
    },
    {
      "name": "@smoketest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "i open the url \"https://www.amazon.in/\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.StepdefinitionTest.i_open_the_url(String) in file:/C:/SeleniumWorkspace/cucumber-scenarios-parallel/cucumber-scenarios-parallel-example-master/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
});