FROM frolvlad/alpine-oraclejdk8:slim
MAINTAINER Alex

VOLUME /tmp
VOLUME /opt/server
ADD app.jar /opt/server/app.jar
RUN sh -c 'touch /opt/app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/opt/server/app.jar"]
