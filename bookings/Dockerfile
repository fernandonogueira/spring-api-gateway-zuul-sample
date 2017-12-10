FROM openjdk:8-jdk-alpine

RUN apk add --update bash jq curl && rm -rf /var/cache/apk/*

VOLUME /tmp

ADD target/bookings.jar app.jar

RUN sh -c 'touch /app.jar'

ENTRYPOINT ["java", "-jar","app.jar"]