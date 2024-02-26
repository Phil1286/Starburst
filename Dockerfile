FROM openshift.artifactory.mycloud.intranatixis.com/artifactory/openshift/openjdk/openjdk-8-rhel8
EXPOSE 8080
ADD target/spring-boot-docker.jar spring-boot-docker.jar
ENTRYPOINT ["java","-jar","/spring-boot-docker-one.jar"]

