FROM openjdk:11

MAINTAINER rodolfoperatello

COPY ./libs/bicycleshop-*.jar bicycleshop/

EXPOSE 8080 3306

