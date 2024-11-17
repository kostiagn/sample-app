local docker registry
docker run -d -p 5000:5000 --restart always --name registry registry:2
add
"insecure-registries": ["localhost:5000"]
to  ~/.docker/daemon.json

curl localhost:5000/v2/_catalog

minikube dashboard


mvn clean install -DskipTests -T1C
mvn jib:build -Djib.allowInsecureRegistries=true