#!/bin/bash 

MY_GATEWAY=http://$(minikube ip):31112

echo "testing..."
MY_DELAY=0.2
sleep $MY_DELAY

echo "The quick brown fox jumped over the lazy dog." > fox.txt

curl $MY_GATEWAY/function/openfaas-hello-groovy --data-binary @fox.txt

rm fox.txt
