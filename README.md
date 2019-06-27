# Welcome to Java Features!

## What is Java Features?

Java Features explores many features of Java SE and OpenJDK LTS through
application examples.  Java Features embraces AdoptOpenJDK project.  Apache
Maven is employed for build and test automation.

## Prerequisite

1. Verify prebuilt OpenJDK 11 (LTS) is installed:

        $ java-config --java-version

2. Verify Apache Maven 3.6.1 and above is installed:

        $ mvn --version

## Setup and build

1. Install java-features:

        $ git clone git://github.com/sacren/java-features.git java-features
        $ cd java-features

2. Build and run:

        $ mvn clean package
        $ java -cp target/java-features-1.0.jar TestShape
        $ java -cp target/java-features-1.0.jar TestBall
        ...

### Explore Java SE and have fun.
