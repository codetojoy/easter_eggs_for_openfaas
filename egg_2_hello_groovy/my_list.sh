#!/bin/bash 

MY_GATEWAY=http://$(minikube ip):31112
MY_DELAY=0.2

echo "listing..."
sleep $MY_DELAY
faas-cli list --gateway $MY_GATEWAY

