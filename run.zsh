#!/bin/zsh
mvn package
echo "\n\nFinished building! Running now...\n\n"
java -cp target/debugging-workshop-1.0-SNAPSHOT.jar com.csmentors.app.App
