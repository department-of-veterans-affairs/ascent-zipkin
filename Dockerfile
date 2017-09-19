FROM java:8
ADD target/ascent-zipkin-*.jar /ascent-zipkin.jar
ENTRYPOINT ["java", "-Xms32m", "-Xmx256m", "-jar", "/ascent-zipkin.jar"]
