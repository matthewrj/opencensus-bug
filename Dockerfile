FROM anapsix/alpine-java:8

RUN mkdir /app
COPY bin /app/bin
COPY lib /app/lib

CMD /app/bin/opencensus-bug
