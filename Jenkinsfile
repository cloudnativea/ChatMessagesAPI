pipeline {
    agent any
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
		    steps('Build Docker Image') {
				def dockerImage
			    dockerImage = docker.build("habuzahra:chatapi")
			}
            post {
                success {
                   echo "Done"
                }
            }
        }
    }
}
