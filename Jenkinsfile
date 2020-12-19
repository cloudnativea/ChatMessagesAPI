node {
	    // reference to maven
	    // ** NOTE: This 'maven-3.5.2' Maven tool must be configured in the Jenkins Global Configuration.   
	    def mvnHome = tool 'Maven 3.6.3'
	

	    // holds reference to docker image
	    def dockerImage
	    // ip address of the docker private repository(nexus)
	 
	    def dockerImageTag = "habuzahra:chatapi"
	    
	 	  
	    stage('Build Project') {
	      // build project via maven
	      bat 'mvn clean package spring-boot:repackage' 
	    }
			
	    stage('Build Docker Image') {
	      // build docker image
	      dockerImage = docker.build("habuzahra:chatapi")
	    }
	   
	    
}
