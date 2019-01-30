#!/usr/bin/env bash

# Remove old driver
rm chromedriver
# Download a new aip archive with a chromedriver
wget https://chromedriver.storage.googleapis.com/2.36/chromedriver_linux64.zip
# Unzip an archive
unzip chromedriver_linux64.zip
# Remove an archive
rm chromedriver_linux64.zip
# Set an executable level for a chromedriver
chmod 755 chromedriver
# Create environment variable with PATH to the cromedriver
export CHROMEDRIVER=$PWD/chromedriver