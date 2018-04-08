#!/bin/bash

MY_OPEN_FAAS=$(minikube ip)

echo "for UI    browse to http://${MY_OPEN_FAAS}:31112/ui/"
echo "for graph browse to http://${MY_OPEN_FAAS}:31119/graph/"
echo ""

