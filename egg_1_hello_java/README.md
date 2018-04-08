
### How this project was created

* these instructions assume project is called `openfaas-hello-java`
* `faas-cli new --lang dockerfile openfaas-hello-java`
*  `cd openfaas-hello-java`
* from [here](https://github.com/openfaas/faas/tree/master/sample-functions/BaseFunctions/java) :
    *  edit Dockerfile 
    *  edit Handler.java
*  edit `openfaas-hello-java.yml`
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
