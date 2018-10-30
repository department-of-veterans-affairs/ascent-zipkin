FROM ascent/ascent-base

ENV JAR_FILE "/ascent-zipkin.jar"
ADD target/ascent-zipkin.jar $JAR_FILE

# Append app specific secrets to load to the base config
 RUN echo \
 'secret { \
     format = "ascent.zipkin.{{ key }}" \
     no_prefix = true \
     path = "secret/ascent-zipkin" \
 }' >> $ENVCONSUL_CONFIG
