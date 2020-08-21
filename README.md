# codebuild-test-reporting


## surefire
Common test plugin for Junit. Run the following command to generate the reports.

`mvn test -f surefire/pom.xml -fn`   

Related doc: https://maven.apache.org/surefire/maven-surefire-report-plugin/


## cucumber
Cucumber uses reporter plugins to produce reports. We now supports `pretty`, `junit`, and `json` plugins.  

To run cucumber with `pretty` plugin, run  

`mvn test -Dcucumber.options="--plugin pretty" -f cucumber-pretty/pom.xml -fn`


To run cucumber with `junit` plugin, run   

`mvn test -Dcucumber.options="--plugin junit:target/cucumber-junit-report.xml" -f cucumber-junit/pom.xml -fn`


To run cucubmer with `json` plugin, run  

`mvn test -Dcucumber.options="--plugin json:target/cucumber-json-report.json" -f cucumber-json/pom.xml -fn`


Note for `json` plugin, you need to specify the file format type as `CucumberJson` so CodeBuild knows you want to process json format reports.



Related doc: https://cucumber.io/docs/cucumber/reporting/


## testNG
TestNG generates two sets of report files, one is in standard Junit format named with `TEST-*.xml`, the other is in its own reporter format. We support the Junit format, and are in dev for supporting the testNG reporter format.

To generate the reports, run 

`mvn test -f testNG/pom.xml -fn`

Related doc: https://testng.org/doc/documentation-main.html#annotations





