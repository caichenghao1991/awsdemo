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
                bat 'mvn deploy'

            }
        }

    }
}