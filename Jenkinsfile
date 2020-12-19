pipeline {
    agent {
	any
    tools { 
        maven 'Maven 3.6.3' 
        jdk 'jdk8' 
    }
    stages {
        stage ('Initialize') {
            steps {
                bat '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${MAVEN_HOME}"
                '''
            }
        }

        stage ('Build') {
            steps {
                bat 'mvn clean package spring-boot:repackage' 
            }
            post {
                success {
                   echo "Done"
                }
            }
        }
    }
}
