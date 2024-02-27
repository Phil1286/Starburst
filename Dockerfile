FROM artifactory.mycloud.intranatixis.com/artifactory/openshift/ubi8/openjdk-11
EXPOSE 8080
ADD target/spring-boot-docker.jar spring-boot-docker.jar
ENTRYPOINT ["java","-jar","/spring-boot-docker-one.jar"]

