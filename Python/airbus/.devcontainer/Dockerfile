# Basis-Image mit Python 3.11
FROM python:3.11-slim

# Installiere benötigte Pakete
RUN apt-get update && apt-get install -y \
    git curl build-essential && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/*

# Optional: Installiere pipenv, poetry oder andere Tools
# RUN pip install pipenv

# Setze das Arbeitsverzeichnis
WORKDIR /app

# Kopiere Abhängigkeitsdateien, falls vorhanden
# COPY requirements.txt .
# RUN pip install -r requirements.txt

# Standardbefehl (Shell)
CMD ["bash"]