# Welcome to Java Features!

## What is Java Features?

Java Features is my personal project where I explore JDK source to delve deep
into Java.  I use AdoptOpenJDK and Apache Maven to build, run and test the
package.  I work on it daily as Java and JDK evolve.

## Prerequisite

1. Verify prebuilt OpenJDK 11 (LTS) is installed:

        $ java -version

2. Verify Apache Maven 3.6.2 and above is installed:

        $ mvn --version

## Set up and build

1. Install java-features:

        $ git clone git://github.com/sacren/java-features.git java-features
        $ cd java-features

2. Build and run:

        $ mvn clean package
        $ java -cp target/java-features-1.0.jar TestDuo
        $ java -cp target/java-features-1.0.jar TestTrio
        $ java -cp target/java-features-1.0.jar TestQuad
        $ java -cp target/java-features-1.0.jar TestBall
        $ java -cp target/java-features-1.0.jar TestPension
        $ java -cp target/java-features-1.0.jar TestCylinder
        ...

### Explore JDK source.  Discover new features.  Have lots of fun.
