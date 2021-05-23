# Camera-state-Webservice
AWS cloud deployable java webservice to check the status of camera direction depends on user votes in specific time frame.

* As per the provided documents, one resource endpoint has been created in the web service which returns a boolean value as a result.
 
* Web service endpoint resource is /addVote which returns true on the success and starts the scheduler to return the command on the base of number of votes for the command.

* Service endpoint accepts a Integer parameter

* Singleton design pattern is used for storage purposes which return an object with HashMap to store the unique keys and its values.

* Following numbers are used to return and print the command String after each 30 seconds - 
    * 0 - Stay
    * 1 - Pan Right
    * 2 - Pan Left
* Tools and Technologies used for development - 
    * Spring Tool Suite
    * Tomcat v9.0 server
    * Java 1.8

* Following separate modules are used for the classes
    * Controllers
    * Services
    * UtilClasses
    * ServiceImpl
    * DaoImpl

* AWS cloud deployment 
  * Elastic Beanstalk
    * Create a WAR file of the project
    * Create new application in EB service 
    * Create one web server environment 
    * Provide environment name
    * Select platform
    * Add application code i.e. WAR file
    * Create environment 
    * Upload and deploy the WAR file
  * EC2
    * Launch a new instance of EC2 service
    * Choose Amazon Machine Image
    * Choose an instance type
    * Configure the instance and provide the following details
    * Number of instances
    * Virtual private cloud network
    * Subnet with availability zone
    * Auto-assign public IP
    * Add the storage
    * Configure the security groups
    * Review and launch
    * Create a Key pair to connect the instance and download it
    * Use Putty app to upload and deploy JAR file on EC2 instance
