# Basis-Image (Ubuntu, weil es stabil ist)
FROM ubuntu:22.04

# Installiere gcc, g++, make und andere benötigte Tools
RUN apt-get update && apt-get install -y \
    gcc g++ make cmake lldb \
    curl git unzip && \
    apt-get clean

# Setze das Arbeitsverzeichnis
WORKDIR /app

# Standardbefehl (Shell)
CMD ["bash"]