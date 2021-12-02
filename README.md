# Spring Boot API Atlas Azure

API made using Spring Boot connected to Atlas and ready to be deployed on Azure.

---

Search for the database connection string on Atlas and configure the database connection in '_application.properties_' :
```
spring.data.mongodb.uri=mongodb+srv://admin:<password>@cluster0.txljz.mongodb.net/databaseName
spring.data.mongodb.database=databaseName
```
- Replace <password> with the password for the admin user. 
- Replace databaseName with the name of the database that connections will use by default. 
- Ensure any option params are URL encoded.

---

Create the needed collection(s) and add some sample data.

---

Run the application locally :
```
mvn spring-boot:run
```

---

Package the application as a war :

```
mvn package war:war
```
