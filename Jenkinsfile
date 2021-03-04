pipeline {
    agent any

    // tools {
    //     // Install the Maven version configured as "M3" and add it to the path.
    //     maven "mvn"
    // }

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/QAStudyOnline/automation.git'

                // Run Maven on a Unix agent.
                //sh "mvn -Dmaven.test.failure.ignore=true clean package"
                bat "mvn compile"
                // To run Maven on a Windows agent, use
                bat "mvn -pl 014_lesson_API_Essential test"
            }

            //post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                //success {
                  //  allure([
                    //includeProperties: false,
                    //jdk: '',
                    //properties: [],
                    //reportBuildPolicy: 'ALWAYS',
                    //results: [[path: 'target/allure-results']]
                //])
              //  }
            }
        }
    }
}
