FROM groovy:2.4.14-jdk8-alpine

USER root

ADD https://github.com/openfaas/faas/releases/download/0.7.1/fwatchdog /usr/bin
RUN chmod +x /usr/bin/fwatchdog

USER groovy

WORKDIR /home/groovy

COPY Handler.groovy .

ENV fprocess="groovy Handler.groovy"

HEALTHCHECK --interval=1s CMD [ -e /tmp/.lock ] || exit 1

CMD ["fwatchdog"]

