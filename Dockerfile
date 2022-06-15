FROM maven:3.8.5-openjdk-11-slim as builder

ARG VERSION=1.0.0-SNAPSHOT

WORKDIR /src

COPY . .

RUN mvn -e -B versions:set -DnewVersion=${VERSION} &&\
mvn -e -B versions:commit &&\
mvn package -DskipTests

FROM eclipse-temurin:11.0.15_10-jre-alpine

ARG VERSION=1.0.0-SNAPSHOT

COPY --from=builder /src/target/spring-boot-${VERSION}.jar /root/sample.jar

CMD java -jar sample.jar    