FROM openjdk:17
WORKDIR /database
RUN docker network create db
RUN docker run --name db -p 5432:5432 --network=db -v "%cd%:/var/lib/postgresql/data" -e POSTGRES_PASSWORD=password -d postgres:alpine
RUN docker run -it --rm --network=db postgres:alpine psql -h db -U postgres
COPY target/ /tmp
WORKDIR /tmp
CMD java -jar FakeShop-0.0.1-SNAPSHOT.jar