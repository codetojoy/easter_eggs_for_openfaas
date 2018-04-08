
### How this project was created

* these instructions assume project is called `openfaas-hello-groovy`
* `faas-cli new --lang dockerfile openfaas-hello-groovy`
*  `cd openfaas-hello-groovy`
* from [here](https://github.com/openfaas/faas/tree/master/sample-functions/BaseFunctions/java) :
    *  edit Dockerfile 
    *  edit Handler.groovy
*  edit `openfaas-hello-groovy.yml`
    * add codetojoy qualifier to image

### Build and push to Docker Hub

* in Docker terminal
    * use `./my_build_and_push_docker_image.sh`

### Deploy function to local Open FaaS

*  use `./my_deploy.sh`

### Testing, examining

* test function:  `./my_test.sh`
* list functions: `./my_list.sh`
* browse to URLs specified by `./my_urls.sh`
