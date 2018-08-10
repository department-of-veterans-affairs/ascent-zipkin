FROM ascent/ascent-base

ENV JAR_FILE "/ascent-zipkin.jar"
ADD target/ascent-zipkin.jar $JAR_FILE

# Disabling secret loading from secret/ascent-zipkin
# since there are no longer any secrets stored there.

# Append app specific secrets to load to the base config
# RUN echo \
# 'secret { \
#     format = "{{ key }}" \
#     no_prefix = true \
#     path = "secret/ascent-zipkin" \
# }' >> $ENVCONSUL_CONFIG