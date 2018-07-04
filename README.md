# springbootsample
Sample CRUD written on Spring boot

This is a sample CRUD application on Spring Boot which starts by default on port 8080. The only pre-requisite being that maven needs to be installed on the system.

Sample Services:

1. GET 
http://localhost:8080/nsc/services/getAllUsers
http://localhost:8080/nsc/services/getUser?id=1

2. POST
http://localhost:8080/nsc/services/setUser

3. PUT
http://localhost:8080/nsc/services/updateUser

In both the POST and PUT cases, the model has to be sent as a JSON in the form:

{
"id": ,
"firstName": "",
"lastName": "",
"address": "",
"city": ""
}

4. DELETE
http://localhost:8080/nsc/services/deleteUser?id=2


To generate a final build:

Run mvn clean package or mvn clean install on cmd.

This will generate a final "jar" file that can be deployed.




