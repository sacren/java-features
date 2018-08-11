# Welcome to Java Tutorial!

## What is Java Tutorial?

Java Tutorial is a set of code examples in Java programming language, which
covers the basic language features for those who want to acquire a good
understanding from the beginning.  It indends to serve as a helping stone for
those who want to participate in real world development of projects in Java.

## Prerequisite

1. IcedTea JDK must be installed of version 3.8.0:

        $ java-config -L

2. Apache Maven must be installed of version 3.3.3 or later:

        $ mvn --version

## Setup and build

1. Install java-tutorial:

        $ git clone git://github.com/sacren/java-tutorial.git java-tutorial
        $ cd java-tutoril

2. Build and test:

        $ mvn clean package
        $ java -cp target/java-tutorial-1.0-SNAPSHOT.jar PrintCheckerPattern
        $ java -cp target/java-tutorial-1.0-SNAPSHOT.jar LeapYears
        ...

### From now on you shall contribute to make it better...
