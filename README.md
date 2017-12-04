
# My Simple Sonar Rules

[![Build Status](https://travis-ci.org/veraee/fsRelaxSonarRules.svg?branch=master)](https://travis-ci.org/veraee/fsRelaxSonarRules)

_Hint for IDE_:
Run `mvn test-compile` once before first test,
so that the dependencies of the java classes in "src/test/files" ("_UT dependencies_") are fetched
and placed in "target".

_IntelliJ IDEA:_
Run/Debug Configurations -> Before launch: Run Maven Goal: 'mvn test-compile'

Order of build:
1. Run Maven Goal
2. Build

_Make plugin jar:_
mvn clean install
cp target/fsRelaxSonarRules-main-1.0-SNAPSHOT.jar _SONAR_/sonarqube-6.6/extensions/plugins/

