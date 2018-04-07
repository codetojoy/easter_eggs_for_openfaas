
### Prerequisites

* Docker (not documented)

### minikube 

* 07-APR-2018: `v 0.25.2` worked initially but then on reset went crazy, so reverted to `v 0.25.0`
    * re: crazy. Trouble with alertmanager and prometheus re: `CreateContainerConfigError`
* related  tickets (?):
    * might be [this](https://github.com/openfaas/faas-netes/issues/164)
    * and [this](https://github.com/kubernetes/minikube/issues/2642)
* see `install_minikube.sh` in this folder. Uses `curl` and not `brew`
    * reference [here](https://github.com/kubernetes/minikube/releases)

### kubectl

* `brew` did not work for install
* I think (?!!) I used `curl` as explained [here](https://kubernetes.io/docs/tasks/tools/install-kubectl/)

### Open FaaS

* from [here (?)](http://docs.openfaas.com/deployment/kubernetes/)
* highlights:  
    * `brew install faas-cli`
    * `brew install kubernetes-helm`

### Setup Open FaaS

#### part A

* if doing a reset on a previous cluster:
    * `minikube stop`
    * `minikube delete`
* `minikube start`
* `minikube status`
* assume `alias k=kubectl `
* `k -n kube-system create sa tiller`
* `k create clusterrolebinding tiller --clusterrole cluster-admin  --serviceaccount=kube-system:tiller` 
* `helm init --skip-refresh --upgrade --service-account tiller`

#### part B

* cd `~/tools/faas-netes/chart`
* `helm upgrade --install --debug --reset-values --set async=false --set rbac=false openfaas openfaas/`
* various confirmations:
    * `k --namespace=default get deployments -l "release=openfaas, app=openfaas"`
    * `k get pods`
    * let `MY_OPEN_FAAS` be value from `minikube ip`
        * UI: http://MY_OPEN_FAAS:31112/ui
        * Graph: http://MY_OPEN_FAAS:31119/graph

### Next Steps

* try to deploy a function with one of the examples in this repo
