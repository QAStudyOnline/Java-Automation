#!/usr/bin/env bash

rm chromedriver
wget https://chromedriver.storage.googleapis.com/2.36/chromedriver_linux64.zip
unzip chromedriver_linux64.zip
rm chromedriver_linux64.zip
chmod 755 chromedriver
export CHROMEDRIVER=$PWD/chromedriver