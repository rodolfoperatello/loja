FROM openjdk:11

MAINTAINER rodolfoperatello

ENV PROFILE=${PROFILE}

WORKDIR /application/bicycleshop

COPY /build/libs/bicycleshop-*.jar bicycleshop.jar

EXPOSE 8080 3306

CMD java -jar bicycleshop.jar --spring.profiles.active=${PROFILE}
