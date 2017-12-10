FROM openjdk:8-jdk-alpine

RUN apk add --update bash jq curl && rm -rf /var/cache/apk/*

VOLUME /tmp

ADD target/gateway.jar app.jar
#COPY entry_point.sh /entry_point.sh

RUN sh -c 'touch /app.jar'
#RUN sh -c 'touch /entry_point.sh'

#ENTRYPOINT ["/bin/bash", "entry_point.sh","app.jar","8080"]
ENTRYPOINT ["java", "-jar","app.jar"]