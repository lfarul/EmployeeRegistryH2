pipeline {
  agent any
  stages {
    
    /*stage ("Checkout") {
    steps {
      echo "Checking out...."
      git credentialsId: 'git-creds', url: 'https://github.com/lfarul/EmployeeRegistryH2'
    }
  }
  */
    // Kompiluje plik
    stage("Compile / Build") {
      steps {
        echo "Compiling / Building..."
        sh 'mvn compile'
      }
    }
    
    // Przeprowadzam testy jednostkowe
    stage("JUnit Test") {
      steps {
        echo "JUnit testing..."
        sh 'mvn test'
      }
    }
    
    // Pakuje aplikacje do pliku .jar
    stage("Package") {
      steps {
        echo "Packaging..."
        sh 'mvn package'
      }
     }
    
        /*
    // Uruchamiam aplikację Jenkinsem z wykorzystaniem mavena
    stage("Mvn Package & Run") {
      steps {
        echo "Packaging and Running...."
        sh 'mvn package && java -jar target/thymeleaf-demo-0.0.1-SNAPSHOT.jar'
        }
      }
     */

    // Buduje obraz Dockera dla Docker Registry 
    stage("Build Docker image for Docker Hub"){
      steps{
        echo "Building Docker image for Docker Registry..."
        // lfarul to mój username na dockerhub i musi być w nazwie image / nazwa obrazu : wersja obrazu
        sh 'docker build -t lfarul/employeeregistry:20.0 .'
      }
    }
    
    // Robie push obrazu Dockera na chmure Dockera
    stage("Push Docker image to Docker Registry"){
      steps{
        echo "Pushing Docker image to Docker Registry..."
        withCredentials([string(credentialsId: 'docker-pwd', variable: 'dockerHubPwd')]) {
          sh "docker login -u lfarul -p ${dockerHubPwd}"
        }
        sh 'docker push lfarul/employeeregistry:20.0'
      }
    }    

    // Buduje obraz Dockera dla Google Cloud
    stage("Build Docker image for Google Cloud"){
      steps{
        echo "Building Docker image for Google Cloud..."
        sh 'docker build -t gcr.io/nowyprojekt-235718/employeeregistry:20.0 .'
      }
    }
    
    // Uruchamiam aplikację w kontenerze na zmapowanym porcie 8282
     stage("Run Docker container"){
      steps{
        echo "Running Docker container"
        sh 'docker run -d -p 8282:9000  lfarul/employeeregistry:20.0' 
      }
    }
  }
}
   
    /*Robie push obrazu Dockera na chmure Google
    stage("Push Docker image to Google Cloud"){
      steps{
        echo "Pushing Docker image to Google Cloud..."
        withCredentials([file(credentialsId: 'GCR-pwd', variable: 'GCR-pwd')]){
          sh "docker login -u lfarul -p ${dockerHubPwd}"     
        }
        sh 'docker push gcr.io/nowyprojekt-235718/employeeregistry:2.0'
        
      }
    }
  }
}

 */
