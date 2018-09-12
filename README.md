# Welcome to Java Features!

## What is Java Features?

Java Features is a set of code examples in Java programming language that
facilitates the basic language features in preparation for the participation in
real world development of projects using Java.

## Prerequisite

1. IcedTea JDK must be installed of version 3.8.0:

        $ java-config -L

2. Apache Maven must be installed of version 3.3.3 or later:

        $ mvn --version

## Setup and build

1. Install java-features:

        $ git clone git://github.com/sacren/java-features.git java-features
        $ cd java-features

2. Build and test:

        $ mvn clean package
        $ java -cp target/java-features-1.0.jar PrintPattern
        $ java -cp target/java-features-1.0.jar LeapYears
        ...

### From now on you shall contribute to make it better...
