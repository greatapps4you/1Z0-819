
### in the target folder make a dir called modules and copy movies.jar to ther

## java -m modules\movies.jar -m movies/us.greatapps4you.movies.Main
Error occurred during initialization of boot layer
java.lang.module.FindException: Module modules\movies.jar not found

## java -p modules\movies.jar -m movies/us.greatapps4you.movies.Main
Movies...

## java -p modules -m movies/us.greatapps4you.movies.Main
Movies...

## java --path modules\movies.jar -m movies/us.greatapps4you.movies.Main
Unrecognized option: --path
Error: Could not create the Java Virtual Machine.
Error: A fatal exception has occurred. Program will exit.

## java --module-path modules -m movies/us.greatapps4you.movies.Main
Movies...


