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
        echo "Compiling / Building...."
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

    // Buduje obraz Dockera dla Docker Registery 
    stage("Build Docker image for DockerHub"){
      steps{
        echo "Building Docker image for Docker Registery..."
        // lfarul to mój username na dockerhub i musi być w nazwie image / nazwa obrazu : wersja obrazu
        sh 'docker build -t lfarul/employeeRegistry:1.0 .'
      }
    }
  }
}
    
    /*
    // Buduje obraz Dockera dla Google Cloud
    stage("Build Docker image for Google Cloud"){
      steps{
        echo "Building Docker image for Docker Repository..."
        sh 'docker build -t gcr.io/nowyprojekt-235718/employeeRegistry:1.0 .'
      }
    }  
    // Robie push obrazu Dockera na chmure Dockera
    stage("Push Docker image to Docker Registery"){
      steps{
        echo "Pushing Docker image to Docker Registery..."
        withCredentials([string(credentialsId: 'docker-pwd', variable: 'dockerHubpwd')]) {
          sh "docker login -u lfarul -p ${dockerHubpwd}"
        }
        sh 'docker push lfarul/employeeRegistry:1.0'
      }
    }
    // Robie push obrazu Dockera na chmure Google
    stage("Push Docker image to Google Cloud"){
      steps{
        echo "Pushing Docker image to Google Cloud..."
        withCredentials([string(credentialsId: 'docker-pwd', variable: 'dockerHubpwd')]) {
          sh "docker login -u lfarul -p ${dockerHubpwd}"
        }
        sh 'docker push gcr.io/nowyprojekt-235718/employeeRegistry:1.0'
      }
    }
  }
}

    /* Package and Run
    stage("Mvn Package & Run") {
      steps {
        echo "Packaging and Running...."
        sh 'mvn package && java -jar target/thymeleaf-demo-0.0.1-SNAPSHOT.jar'
      }
     }
   }
}

 */
