#!/bin/bash

eval $(minikube -p minikube docker-env --shell bash)

#helm create hello-world
#helm install hello-world hello-world -namespace hello-world -create-namespace ./helm

#helm upgrade hello-world hello-world