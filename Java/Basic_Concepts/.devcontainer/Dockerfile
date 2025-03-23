# Basis-Image mit OpenJDK 21
FROM eclipse-temurin:21-jdk

# Installiere benötigte Pakete
RUN apt-get update && apt-get install -y \
    maven gradle git curl unzip openjdk-21-jdk && \
    apt-get clean

# Setze das Arbeitsverzeichnis
WORKDIR /app

# Standardbefehl (Shell)
CMD ["bash"]