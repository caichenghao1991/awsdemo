pipeline{
    agent any
    stages{
        stage('Compile Stage'){
            steps{
                git 'https://github.com/caichenghao1991/awsdemo.git'
                sh 'mvn clean compile'

            }
        }
        stage ('Testing Stage'){
            steps{
                sh 'mvn test'

            }
        }
        stage ('Deployment Stage'){
            steps{
                sh 'mvn deploy'

            }
        }

    }
}