# Welcome to Java Features!

## What is Java Features?

Java Features is my personal project to explore JDK git source hosted on GitHub
while I delve deep into Java.  I use AdoptOpenJDK and Apache Maven to build,
run and test the package.  It's an ongoing project that will continue to evolve
for a long time to come.  Review and comment are always appreciated.

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
        $ java -cp target/java-features-1.0.jar TestBall
        $ java -cp target/java-features-1.0.jar TestPension
        $ java -cp target/java-features-1.0.jar TestCylinder
        ...

### Explore JDK source and have lots of fun.
