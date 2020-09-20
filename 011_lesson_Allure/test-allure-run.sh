#!/usr/bin/env bash
set -e
wget http://repo.maven.apache.org/maven2/io/qameta/allure/allure-commandline/2.9.0/allure-commandline-2.9.0.zip
jar -xvf allure-commandline-2.9.0.zip
rm -rf allure-commandline-2.9.0.zip