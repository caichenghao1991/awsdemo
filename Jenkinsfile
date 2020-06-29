pipeline{
    agent any
    stages{
        stage('Compile Stage'){
            steps{
                git 'https://github.com/caichenghao1991/awsdemo.git'
                bat 'mvn clean compile'

            }
        }
        stage ('Testing Stage'){
            steps{
                bat 'mvn test'

            }
        }
        stage ('Deployment Stage'){
            steps{
                //bat 'mvn deploy'
                bat 'docker run -d -p 8761:8761 --network mynet --name awsdemo caichenghao/awsdemo:0.0.0'
            }
        }

    }
}