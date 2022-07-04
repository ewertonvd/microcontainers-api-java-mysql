FROM openjdk:11

LABEL maintainer="Ewerton Vieira Donati <ewertonvd@gmail.com>"

COPY target/microcontainers-0.0.1-SNAPSHOT.jar /opt/spring_boot/microcontainers.jar

WORKDIR /opt/spring_boot

EXPOSE 3306
EXPOSE 8080

CMD ["java", "-jar", "/opt/spring_boot/microcontainers.jar"]