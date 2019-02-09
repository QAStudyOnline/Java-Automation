#!/usr/bin/env bash
docker rmi -f jdbc-mysql:latest && docker rm -f jdbc-m && docker images -a | grep jdbc
