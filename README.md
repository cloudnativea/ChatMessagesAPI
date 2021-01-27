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
- **F-03- Configurations**   
- **F-05- Build, releas, run**  
- **F-06- Processes**   
- **F-07- Port Binding**  
- **F-08- Concurrency**  
- **F-09- Desposability**   
- **F-10- Dev/Prod Parity**   




