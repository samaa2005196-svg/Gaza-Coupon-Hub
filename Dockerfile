
# Stage 1: Compile Kotlin
FROM eclipse-temurin:21-jdk AS build

WORKDIR /app

ARG KOTLIN_VERSION=2.4.21

RUN apt-get update && apt-get install -y --no-install-recommends curl unzip \
    && curl -fL -o kotlin.zip \
    "https://github.com/JetBrains/kotlin/releases/download/v${KOTLIN_VERSION}/kotlin-compiler-${KOTLIN_VERSION}.zip" \
    && unzip -q kotlin.zip \
    && rm kotlin.zip

COPY Main.kt .

RUN ./kotlinc/bin/kotlinc Main.kt -include-runtime -d Main.jar

# Stage 2: Run the application
FROM eclipse-temurin:21-jre

WORKDIR /app

COPY --from=build /app/Main.jar Main.jar

CMD ["java", "-jar", "Main.jar"]
