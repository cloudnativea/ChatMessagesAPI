FROM openjdk:8-jdk-alpine
ENV SPRING_DATA_MONGODB_DATABASE=swm-messages
ENV SPRING_DATA_MONGODB_URI=mongodb://db:27017/swm-messages?readPreference=primary&gssapiServiceName=mongodb&ssl=false
COPY target/messages-api-0.0.1-SNAPSHOT.jar messages-api-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","./messages-api-0.0.1-SNAPSHOT.jar"]
