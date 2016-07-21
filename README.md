# Corball Demo
Corball demo - The test automation demo. You will need a Saucelabs account if you want to enjoy this demo.

Corball also support local WebDriver/Appium executions and it is based on the Corball Core (https://github.com/Acenhauer/corball-demo)

# WebDriver Demo
You can execute an automated google search using the following command:

    mvn -Dtest=WebDriverTest -Dbrowser=chrome -Dhub=http://127.0.0.1:4444/wd/hub test

Corball supports Saucelabs, you can trigger your changing the Hub url

    mvn -Dtest=WebDriverTest -Dbrowser=chrome -Dhub=http://saucelabs_user@saucelabs_apikey:80/wd/hub test

Corball supports Internet Explorer, Firefox, Opera, Safari and Chrome.
