# Offizielles Node.js-Image mit npm und TypeScript
FROM node:20-slim

# Installiere benötigte Tools
RUN apt-get update && apt-get install -y \
    git curl build-essential && \
    npm install -g typescript eslint && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/*

# Setze das Arbeitsverzeichnis
WORKDIR /app

# Standardbefehl
CMD ["bash"]