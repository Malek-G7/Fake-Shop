FROM openjdk:17
COPY target/ /tmp
WORKDIR /tmp
CMD java -jar FakeShop-1.0-SNAPSHOT.jar