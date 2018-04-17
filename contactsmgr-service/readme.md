# contactsmgr-service

It is a simple service to manage contacts in a relational database. It provides 1000 different addresses that can be used. Furthermore it allows
to add new contacts.

It is intended to run on Red Hat OpenShift platform. It is a Spring Boot application that also runs locally. Locally it uses the a H2 memory database.
When it runs on OpenShift it uses a PostgreSQL database.


## Usage

### Local

```
mvn spring-boot:run -Plocal
```

### OpenShift

```
mvn clean install fabric8:deploy -Popenshift
```

Be sure that the PostgreSQL database is already deployed to OpenShift and up and running. If necessary update the values for the database in file 
src/main/resources/application-openshift.properties. Furthermore check the values in file src/main/fabric8/deployment.yml if necessary.

## Accessing the services

A SoapUI project with examples provided in the file contactsmgr-service-soapui-project.xml

