# invision-day-2018

Contains workshop material used for the [In Vision Day 2018 of TH Nürnberg](https://www.th-nuernberg.de/fakultaeten/in/in-vision-day-2018/) at 18.04.2018.

The workshops is used to explain microservice development with Spring Boot and Red Hat OpenShift as runtime environment.

It contains the following projects:

- greetings: A simple REST services with Spring Boot
- openshift-greetings: A simple REST services already prepared to run in OpenShift using fabric8 framework
- contactsmgr-service: A complex example providing a REST service for contacts. The contacts can be managed within an in-memory or postgres database.

## greetings

### Build
```
mvn package
```

### Run
```
mvn spring-boot:run
```

### Use
```
curl http://localhost:8080/greeting
```

## openshift-greetings

### Build
```
mvn package
```

### Run locally
```
mvn spring-boot:run
```

### Run in OpenShift
```
oc login https://servername:port
mvn clean fabric8:deploy -Popenshift
```

### Use
```
curl http://localhost:8080/api/greeting?name=Sarah
```

## contactsmgr-service

### Build
```
mvn package
```

### Run locally
```
mvn spring-boot:run -Plocal
```

### Run in OpenShift
```
oc login https://servername:port
mvn fabric8:deploy -Popenshift
```

### Use
```
curl http://localhost:8080/api/contacts/101
```
