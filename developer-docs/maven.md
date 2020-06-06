mvn clean install
mvn clean package spring-boot:repackage
mvn package


cd into reporter-service and target, then execute any of these:
java -jar reporter-service-0.0.1-SNAPSHOT.jar
mvn spring-boot:run

or cd into reporter service and do
mvn spring-boot:run to run