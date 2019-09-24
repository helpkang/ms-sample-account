
FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS --spring.profiles.active=local
ADD target/ms-sample-account-web-0.0.1-SNAPSHOT.jar ms-sample-account-web.jar
EXPOSE 8081
# For Spring-Boot project, use the entrypoint below to reduce Tomcat startup time.
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar ms-sample-account-web.jar
