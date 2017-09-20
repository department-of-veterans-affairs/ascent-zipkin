FROM jluck/ascent-base

ENV JAR_FILE "/ascent-zipkin.jar"
ADD target/ascent-zipkin-*.jar $JAR_FILE

# Append app specific secrets to load to the base config
RUN echo \
'secret { \
    format = "elasticsearch.{{ key }}" \
    no_prefix = true \
    path = "secret/ascent-zipkin/elasticsearch" \
}' >> $ENVCONSUL_CONFIG