#!/usr/bin/env bash
docker rmi -f jdbc-mysql:latest && docker rm -f jdbc-mysql && docker images -a | grep jdbc
