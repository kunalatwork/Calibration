$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature/Calibration.feature");
formatter.feature({
  "line": 1,
  "name": "Add new Calibration",
  "description": "",
  "id": "add-new-calibration",
  "keyword": "Feature"
});
formatter.before({
  "duration": 70467101800,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Verify all fields with valid Data",
  "description": "",
  "id": "add-new-calibration;verify-all-fields-with-valid-data",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "Open browser and enter url",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Check Login with valid username \u0026 password",
  "keyword": "Then "
});
formatter.step({
  "line": 5,
  "name": "fill all required fields",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "click on save button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "check Welcome contect page and fill data",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Check Background info",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Fill Pre Call Data",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Choose Correct Answers",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Fill FeedBack and Best Practice If required.",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Add Recommendations",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinations.open_browser_and_enter_url()"
});
formatter.result({
  "duration": 14552235800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinations.check_Login_with_valid_username_password()"
});
formatter.result({
  "duration": 2077529300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinations.fill_all_required_fields()"
});
formatter.result({
  "duration": 42805536800,
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate option with text: \nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.0.0-beta-3\u0027, revision: \u00275d108f9a67\u0027\nSystem info: host: \u0027LAKHAN\u0027, ip: \u0027192.168.1.5\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_211\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.Select.selectByVisibleText(Select.java:151)\r\n\tat StepDefination.StepDefinations.fill_all_required_fields(StepDefinations.java:152)\r\n\tat ✽.Then fill all required fields(Feature/Calibration.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinations.click_on_save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinations.check_Welcome_contect_page_and_fill_data()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinations.check_Background_info()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinations.fill_Pre_Call_Data()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinations.choose_Correct_Answers()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinations.fill_FeedBack_and_Best_Practice_If_required()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinations.add_Recommendations()"
});
formatter.result({
  "status": "skipped"
});
formatter.before({
  "duration": 13862831400,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Verify Calibation Event with Valid Data",
  "description": "",
  "id": "add-new-calibration;verify-calibation-event-with-valid-data",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "Enter valid Event name and Select Client",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Select Calibration and fill Calibration window",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Select user and click on save button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinations.enter_valid_Event_name_and_Select_Client()"
});
formatter.result({
  "duration": 34600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinations.select_Calibration_and_fill_Calibration_window()"
});
formatter.result({
  "duration": 27300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinations.select_user_and_click_on_save_button()"
});
formatter.result({
  "duration": 31000,
  "status": "passed"
});
});