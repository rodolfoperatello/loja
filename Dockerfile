FROM openjdk:11

MAINTAINER rodolfoperatello

ENV PROFILE=${PROFILE}

#RUN mkdir /application/bicycleshop

WORKDIR /application/bicycleshop

COPY build/libs/bicycleshop-*.jar /application/bicycleshop.jar

EXPOSE 8080 3306

CMD java -jar loja.jar -Dspring.profiles.active=${PROFILE}
