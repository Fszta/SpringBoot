FROM java:8

WORKDIR /usr/local

COPY target/SpringApi-1.0-SNAPSHOT.jar .

CMD ["java", "-jar", "SpringApi-1.0-SNAPSHOT.jar"]