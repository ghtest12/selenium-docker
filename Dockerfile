FROM woahbase/alpine-openjdk8:armhf

# INSTALL curl and jq
RUN apk add curl jq

#WORKSPACE
WORKDIR /usr/share/udemy

#ADD .jar files target from host into this image
ADD target/selenium-docker.jar 			selenium-docker.jar
ADD target/selenium-docker-tests.jar 	selenium-docker-tests.jar
ADD target/libs							libs

#In case of any other dependencies like .csv or .json or .xml 
#or images folder ADD them here

#ADD suite files (testng.xml files)
ADD contactusverification.xml			contactusverification.xml
ADD checklinksonhome.xml				checklinksonhome.xml

#ADD health check script
ADD healthcheck.sh						healthcheck.sh

#Browser
#HUB_HOST
#Module
ENTRYPOINT sh healthcheck.sh