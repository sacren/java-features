# Welcome to Java Features!

## What is Java Features?

Java Features attempts to manifest the most essential language features of Java
programming language by code examples in the hope that some code might be good
enough to spawn an independent project by itself.  Java Features depends upon
IcedTea JDK and other OSS projects like Maven.

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

### From now on all is set up for collaboration.
