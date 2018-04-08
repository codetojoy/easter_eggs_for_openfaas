MY_GATEWAY=http://$(minikube ip):31112
MY_DELAY=0.2

echo "deploying..."
sleep $MY_DELAY
faas-cli deploy -f openfaas-hello-groovy.yml --gateway $MY_GATEWAY

echo "Ready."
