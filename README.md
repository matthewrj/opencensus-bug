Steps to reproduce:
```
./gradlew run
```

Steps to reproduce in a docker container:
```
./gradlew docker
docker run -it opencensus-cpu-thrasher
```

I observe 100% CPU both running directly on my Ubuntu machine and in the docker container.
