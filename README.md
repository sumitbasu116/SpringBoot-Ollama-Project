# Use Case:
> To run a Ollama in local machine (stand alone or as a docker container) and load one of the ollama model to ineract as an API to our Spring AI project.

# Docker ollama image link:
```
https://github.com/ollama/ollama
```

# Docker compose file to run the Ollama in docker container:
```
version: '3.8'
services:
  ollama:
    hostname: ollama
    container_name: ollama
    image: ollama/ollama
    ports:
      - "11434:11434"
```

# Directly run the ollama docker image into the docker container:
```
docker run -p 11434 ollama/ollama
```
# Load the ollama model in windows 11:
```
winpty docker exec -it ollama ollama run llama3.2:1b ==> 4GB RAM is fine
winpty docker exec -it ollama ollama run llama2 ==> min RAM should be 8GB
```
