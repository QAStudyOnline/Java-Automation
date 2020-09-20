#!/usr/bin/env bash

docker build -t jdbc-mysql .
docker run -d -it --name=jdbc-m -p 3306:3306 jdbc-mysql
docker start jdbc-m