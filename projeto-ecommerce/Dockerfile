FROM openjdk
RUN mkdir app
ADD /target/projeto-ecommerce-0.0.1-SNAPSHOT.jar /app/projeto-ecommerce.jar
WORKDIR /app
ENTRYPOINT ["java", "-jar", "projeto-ecommerce.jar"]