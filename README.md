# Spring Boot API Atlas Azure

API made using Spring Boot connected to Atlas and ready to be deployed on Azure.

Create the following collection :
- users

Add some sample data :

```json
{
  "id" : "1",
  "firstName" : "Michael",
  "lastName" : "Someone"
}
```

Run the application locally :
```
mvn spring-boot:run
```

Package the application as a war :

```
mvn package war:war
```

