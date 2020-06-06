# Child-Abuse-Reporter-System

This is a user module that can raise complaints for child abuse.

This project consists of modules that make up the reporter REST service

# Modules

## reporter-api

The reporter-api module contains the public facing REST API for the service

## reporter-client

The client module contains a reference client for the reporter-service

## reporter-service

The reporter-service module contains full implementation of the child abuse reporter REST service

# Developer Information

## Developer Documentation
Initial SetUp:

This is a Spring boot application. 

Followed the following page for the spring boot installations and its dependencies: 
https://docs.spring.io/spring-boot/docs/current/reference/html/getting-started.html

Java version: 1.8 

Maven: 3.6.3

Spring: Spring CLI v2.3.0.RELEASE


### Maven Overview

This project utilizes maven for controlling builds. The entire project can be built by running _mvn_ commands from the top level directory.
For example : mvn clean verify --> will perform a complete build and verification of the project locally.


Individual modules may be run with maven's -pl command. For example


mvn -pl reporter-api clean verify


will build and verify the reporter-api module of this project








