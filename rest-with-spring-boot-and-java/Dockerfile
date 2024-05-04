# Define a imagem base como openjdk:17-jdk-slim
FROM openjdk:17-jdk-slim

# Define o diretório de trabalho no contêiner
WORKDIR /app

# Define um argumento para o arquivo JAR
ARG JAR_FILE=target/*.jar

# Copia o arquivo JAR para o diretório /app no contêiner
COPY ${JAR_FILE} app.jar

# Define o comando de entrada para executar o JAR
ENTRYPOINT ["java", "-jar", "app.jar"]