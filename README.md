# Chat API <br>
## This project is for a master course[Software Managment] in Software Engineering at Birzeit University  

### Project name : Cloud Native App | Simple Messaging Application 

### Course Teacher : Dr. Majed Ayyad.

### Students names: 
- Husam Abu Zahra   
- Waseem Jaber  
- Katy Sadi   

### Project Descrioption  :
Messaging application, developed using 12-factor App methodology, the basic **CURD** operations will be Done.  
The next table demonistrate the technologies that will be used to build and deploy the application, also Kanban board will be used to manage our tasks and to show the progress of the project.  

### Context Diagram For The Simple System  :

![Context Diagram (1)](https://user-images.githubusercontent.com/54929537/100285323-5e9fa080-2f79-11eb-9d8c-c6a080b16b56.jpg)



| Technology      | Usage               |
| --------------- | --------------------|
|JAVA spring boot | programming language|
|Mongo DB         | Data base           |
|Jenkins          | CI/CD               |
|Docker           | Container paltform   |
|kubernetes       | Container orchestration engine|

### Messages :
The Basic Operations that is done By the system

| HTTP Verb       |       URI               |    Action            |
| --------------- | ------------------------|-----------------------------------------------|
| Get             |  /api/messages          |    List All Messages                          |
| Get             |  /api/messages/id       |    Display the message with the specified ID  |
| Post            |  /api/messages          |    Insert new Message                         |
| Put             |  /api/messages/id       |    Update Message with the specified ID       |
| Delete          |  /api/messages/id       |    Delete Message with the specified ID       |



### API Documnetation using Swagger  :

![APIs](https://user-images.githubusercontent.com/54929537/99323052-00d4cf80-287a-11eb-8479-2673f9f0732b.PNG)


### Continuous Integration / Continuous Delivery [ CI/CD ]

In order to automate the continuous delviery and integration for our project we used the following tools:

- **Jenkins**   
We used jenkins tool to automae the build our spring boot applicaiton and produce the JAR file which will be used later on to be dockerized, So we built the following pipline line in order to automate the proccess of building the spring boot app.


- **Dcoker**  
The Docker tool was used in order to contarize our applicaiton, so, it can run on container management paltforms.  


### Kubernetes  
After creating the docker image of the chatapi, we used Kubernetes as container orchestration engine for automating deployment, scaling, and management of our application.  
  
   
   ![chatapisys](https://user-images.githubusercontent.com/54929537/106003014-74852b00-60ba-11eb-8e80-0376147dbaab.png)



### Applyed 12 Factor App in the Project:   
- **F-01- Codebase**  
As we can see in this repositry, Source code, Configurations, Docker File , Jenkin PipeLines are Defined in it.  
- **F-02- Dependencies**   
All application internal and external dependencies were defined inside the pom.xml file.  
When we build the application the dependencies will be downloaded and bundled.   
- **F-03- Configurations**     
Environment Variables were used to store the configurations in, so that the configurations can be changed without the need to change on the application.  
![Picture2](https://user-images.githubusercontent.com/54929537/106011536-3b04ed80-60c3-11eb-80c3-7c7e74107e0a.png)

- **F-05- Build, releas, run**  
Git, Maven, Jenkins were used to automate the process of building and releasing code.  
So, it can be ready to run on any docker server.  
the previous figure shows these steps from Git to Jenkens.  
- **F-06- Processes**   
The aapplication was containerized so that it can be run inside a container.
![dock](https://user-images.githubusercontent.com/54929537/106014140-ddbe6b80-60c5-11eb-8c94-c8b02d8387a5.png)

- **F-07- Port Binding**   
In order to expose our application to external we used port binding factor.  
In our local machine we can bind our service to any port we want, though it's bonded to different port in the deployment.  
![port binding](https://user-images.githubusercontent.com/54929537/106195410-c7dda300-61b8-11eb-9009-de05405c1cf5.png)

- **F-08- Concurrency**  
After containarize our application, this allowed us to run it on container management platform where we used Kubernetes to.  
In this case, we can scale our application easily by increasing the number of the replicas in our deployment, or it can be automatically scaled based on the resource consumption.  
![concurrency](https://user-images.githubusercontent.com/54929537/106197429-63701300-61bb-11eb-8abd-aabd9002d576.png)

- **F-09- Desposability**   
If one of the containers stopped, the service will remain up as there is one service pointing to multiple instances of the same app and this is due to the fact that we are running the application over K8s which running apps can automatically scale up and down.   
![Disposability](https://user-images.githubusercontent.com/54929537/106198918-52c09c80-61bd-11eb-973e-be9e958d396f.png)

- **F-10- Dev/Prod Parity**   
As our application is still very small the Dev/Prod Parity are still the same.  
But in order to keep this factor under control the following has been done:  
--> Env. Variables.  
--> All related files are kept in the same repo.  






