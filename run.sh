#!/bin/sh

cd /Users/hjaltisteinar/Documents/Code/Reiknirit/TDD/StringCalculator/

rm -r Classes/*

javac src/main/java/is/hjalti/stringcalc/Calculator.java -d Classes/
javac -cp "Classes/:lib/junit-4.11.jar" src/test/java/is/hjalti/stringcalc/CalculatorTest.java -d Classes/
java -cp "Classes/:lib/junit-4.11.jar:lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore is.hjalti.stringcalc.CalculatorTest
