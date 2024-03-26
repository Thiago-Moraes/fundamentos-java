FROM openjdk:17-jdk-slim-buster

RUN apt-get update && apt-get upgrade -y

RUN apt install iputils-ping -y

CMD ["ping", "127.0.0.1"]