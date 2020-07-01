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
        stage ('Packaging Stage'){
                    steps{
                        bat 'mvn package'

                    }
                }
        stage ('Deployment Stage'){
            steps{
                //bat 'mvn deploy'
                bat 'docker build -t springbootjenkinsdocker .'
                bat 'docker run -d -p 127.0.0.1:8000:8082 springbootjenkinsdocker'
            }
        }

    }
}