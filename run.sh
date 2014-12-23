#!/bin/sh
PID=$(ps aux | grep '[j]ava -jar build/libs/kllegro-0.1.0.jar' | awk '{print $2}')
if [ -z "$PID" ]
then
    echo "Application is already stopped"
else
    echo "kill process:" $PID
    kill $PID
fi

java -jar build/libs/kllegro-0.1.0.jar &

PID=$(ps aux | grep '[j]ava -jar build/libs/kllegro-0.1.0.jar')

echo "Application PID:" $PID