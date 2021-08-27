# Java Spring-boot based on Gradle for Azure App Service deployment

This sample shows how to deploy a simple Java Spring-boot application to Azure App Service for gradle based Java project.

This is done using [Azure WebApp Plugin for Gradle](https://github.com/microsoft/azure-gradle-plugins/blob/master/azure-webapp-gradle-plugin/README.md)

## High-level steps to test this sample:
1. Install gradle – download the build tool from - [Gradle](https://gradle.org/install/)
2. Set JAVA_HOME if needed
3. Clone this repo.  `'git clone https://github.com/amulchapla/speechspringbootsample'`
4. Go to speechspringbootsample directory  of the repo
5. Run `'gradle build'`. Verify that build is successful
6. Run `'gradlew bootRun'` and verify app starts successfully
7. Go to `'http://localhost:8080/'` and you should see “Greetings from Spring Boot from amc speech proj!” if the app started successfully
8. Go to `'localhost:8080/actuator/health'` and you should see {"status":"UP"}
9. Go to `'localhost:8080/api/sayhello'` and you should see “Custom Hello from api sayhello from amc speech proj!”

Your app is tested locally and ready to be deployed to Azure now. 

### *Deploy the Sample spring boot app to Azure App Service:*
1. Update build.gradle with details for deployment to Azure under “azurewebapp” section. Include your Azure subscription and other retails for Azure App Service
2. Run gradle `'azureWebAppDeploy'`
3. That should deploy your Spring-boot Java app to Azure app service.
4. Go to `'https://<your web app name>.azurewebsites.net'` and you should see “Greetings from Spring Boot from amc speech proj!” if the app got deployed successfully
5. Go to `'https://<your web app name>.azurewebsites.net/api/sayhello'` and you should see “Custom Hello from api sayhello from amc speech proj!” if the app got deployed successfully


You can initialize a sample spring boot app and download source code from [Spring Initializr](https://start.spring.io/). This is useful if you need to try a different application scenario.

