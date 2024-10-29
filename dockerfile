FROM openjdk:17-oracle
COPY ./target/Car-authentication-0.0.1-SNAPSHOT.jar car-security.jar
CMD ["java","-jar","car-security.jar"]