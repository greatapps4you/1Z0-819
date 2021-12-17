## Integrating Maven and Java Modules

https://www.baeldung.com/maven-multi-module-project-java-jpms

## Generating and executable jar from Maven

https://www.baeldung.com/executable-jar-with-maven


## Ways of executing the app:

java -classpath mysql-connector-java-8.0.11.jar;datalayer.jar;myapp.jar com.abc.myapp.Main

or

java -p mysql-connector-java-8.0.11.jar;datalayer.jar;myapp.jar -m abc.myapp/com.abc.myapp.Main

or

java -cp mysql-connector-java-8.0.11.jar -p datalayer.jar;myapp.jar -m abc.myapp/com.abc.myapp.Main

