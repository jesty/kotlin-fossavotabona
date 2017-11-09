# kotlin-fossavotabona
Examples used during my presentation at Codemotion Milan 2017

* kotlin-slides: contains all the code examples used during the presentations

The other projects are the two examples at the end of the presentation:

* kotlin-codemotion: To run the backend, made with Spring Boot, use `./gradlew build && java -jar build/libs/kotlin-codemotion-0.0.1-SNAPSHOT.jar`. Please be sure that backend starts on port 8080. If you want to try the API you can use the curl commands below:
   * curl -XGET http://localhost:8080/contacts
   * curl -XGET http://localhost:8080/contacts/1
   * curl -XPOST http://localhost:8080/contacts  -H 'Content-Type: application/json' -d '{"name":"Davide", "surname":"Cerbo"}'
   * curl -XDELETE http://localhost:8080/contacts/1
* kotlin-codemotion-front: To run the frontend use, made with Kotlin, `yarn start`. After visit http://locahost:3000

