pipeline {
    agent any
    tools {
        maven 'my-maven'
        jdk 'my-jdk'
    }

    stages {
        stage('Git') {
            steps {
                echo 'Pull code from GitHub'
                git url: 'https://github.com/AJABHIMANYU/car-security.git', branch: 'master'
            }
        }
        stage('Build') {
            steps {
                echo 'Build project using Maven'
                bat "mvn clean install -DskipTests"
            }
        }
        stage('Test') {
            steps {
                echo 'Test your application'
                bat "mvn test"
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploy the project'
                bat 'docker rm -f authentication-sr || true'
                bat 'docker rmi -f authentication-service || true'
                bat 'docker build -t authentication-service .'
                bat 'docker run --network demoproject_app-network -p 8011:8011 -d --name authentication-sr authentication-service'
            }
        }
    }
}
