
# My Simple Sonar Rules

[![Build Status](https://travis-ci.org/veraee/fsRelaxSonarRules.svg?branch=master)](https://travis-ci.org/veraee/fsRelaxSonarRules)  <a href="https://sonarcloud.io/dashboard?id=de.e5n.oss.fsRelaxSonarRules%3AfsRelaxSonarRules-main">
                                                                                                                                      <img src="https://sonarcloud.io/api/badges/gate?key=de.e5n.oss.fsRelaxSonarRules%3AfsRelaxSonarRules-main"/></a>


## Rules

**RelaxedUndocumentedApi**: A modified copy of the original "sonar-java UndocumentedApi S1176" as of 20171201,
some rules are more _relaxed_ than in the original:
- If there is only one constructor in the class, you do not need to document the class and the 
  constructor but only either of them - prefer to document the class.
  Objective: The description for both is almost always the same, as there is nothing to say about
  the constructor which is not also useful to be mentioned in the class's javadoc. 
- No need to document parameters, return type and thrown Exceptions: 
  If parameters are well-typed and well-named and the
  method is well-designed (not too many parameters, ...), the documentation of the parameters is
  only noise in 99%.
  And in 90% this is also the case for the return type - the method name should document the return 
  type sufficiently.
  And in 80% this is also the case for the Exception - the Exception class name should document the
  exceptional case sufficiently.
- The _usual_ signatures of Exception constructors need not to be documented, as this is only noise.
   ```
    Exception()
    Exception(String message)
    Exception(String message, Throwable cause)
    Exception(Throwable cause)
   ```
   
**CommonsOldCommonsCurrent**: Prefer to use current version of the Apache Commons library:
- Prefer collections4 over collections
- Prefer lang3 over lang
    
## Build hints
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
- mvn clean install
- cp target/fsRelaxSonarRules-main-1.0-SNAPSHOT.jar _SONAR_/sonarqube-6.6/extensions/plugins/

## Release notes

PENDING: Initial release.
 