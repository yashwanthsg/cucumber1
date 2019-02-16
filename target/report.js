$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/AbiBus.feature");
formatter.feature({
  "name": "",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "To test the abhibus website",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The user is in home page",
  "keyword": "Given "
});
formatter.step({
  "name": "The user filling the fields \"\u003cfrom\u003e\", \"\u003cto\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "The user submits the search",
  "keyword": "And "
});
formatter.step({
  "name": "The availabity results got",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "from",
        "to"
      ]
    },
    {
      "cells": [
        "Chennai",
        "Madurai"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To test the abhibus website",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user is in home page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSteps.the_user_is_in_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user filling the fields \"Chennai\", \"Madurai\"",
  "keyword": "When "
});
formatter.match({
  "location": "ActionPageSteps.the_user_filling_the_fields(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user submits the search",
  "keyword": "And "
});
formatter.match({
  "location": "ActionPageSteps.the_user_submits_the_search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The availabity results got",
  "keyword": "Then "
});
formatter.match({
  "location": "AccessPageSteps.the_availabity_results_got()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});