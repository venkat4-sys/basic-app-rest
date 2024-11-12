FROM openjdk:17

WORKDIR /usr/app/

COPY target/spring-basic-app.jar  /usr/app/spring-basic-app.jar

ENTRYPOINT [ "java","-jar","spring-basic-app.jar" ]

EXPOSE 8080