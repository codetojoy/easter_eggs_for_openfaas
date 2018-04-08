#!/bin/bash 

MY_GATEWAY=http://$(minikube ip):31112
MY_DELAY=0.2

echo "testing..."
sleep $MY_DELAY
echo "The quick brown fox jumped over the lazy dog." | faas-cli invoke openfaas-hello-groovy --gateway $MY_GATEWAY
