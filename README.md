# Welcome to Java Features!

## What is Java Features?

Java Features attempts to manifest the most essential language features of Java
programming language by code examples.  Java Features embraces AdoptOpenJDK
project.  Maven is essential in building Java Features.

## Prerequisite

1. Verify prebuilt OpenJDK 11 (LTS) is installed:

        $ java-config -L

2. Verify Apache Maven 3.3.3 and above is installed:

        $ mvn --version

## Setup and build

1. Install java-features:

        $ git clone git://github.com/sacren/java-features.git java-features
        $ cd java-features

2. Build and test:

        $ mvn clean package
        $ java -cp target/java-features-1.0.jar TestPatternIn2D
        $ java -cp target/java-features-1.0.jar TestShape
        ...

### From now on all is set up for collaboration.
