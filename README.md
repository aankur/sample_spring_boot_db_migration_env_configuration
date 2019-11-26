### A Sample Demo application running spring boot reading configuration from environment and performing automatic database migration.

Set these variable before starting the app 
```
PORT //or any port you choose
JDBC_URL //the url to your database server
JDBC_USERNAME //username used to connect to database server
JDBC_PASSWORD //password used to connect to database server
```

create a database in you server, the commands use testmigdb, you can create any just replace the name in your config

build the app
```
mvn package -DskipTests
```
or run mvn package with tests
```
PORT=8080 JDBC_URL=jdbc:mysql://localhost:3306/testmigdb JDBC_USERNAME=root JDBC_PASSWORD=root java mvn package
```

run the app
```
PORT=8080 JDBC_URL=jdbc:mysql://localhost:3306/testmigdb JDBC_USERNAME=root JDBC_PASSWORD=root java -jar ./target/demo-0.0.1-SNAPSHOT.jar
```
migration sql scripts are defined in src\main\resources\db\migration,
when you start the app automatic db migration will happen
