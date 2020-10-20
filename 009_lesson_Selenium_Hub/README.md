# Steps

* docker-compose up
* docker network inspect 009_lesson_default
* open browser <selenium-hub ip>:4444/grid/console to verify ui and  
connected containers
* put ip addresses for chrome and firefox in to src/main/resources/test.properties 
like on example:
````
webdriver.hub.firefox=http://172.21.0.3:5555/wd/hub
webdriver.hub.chrome=http://172.21.0.4:5555/wd/hub
````

* run mvn test
* to see test execution use vnc for connections into docker container with chrome.  