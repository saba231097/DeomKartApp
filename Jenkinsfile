pipeline{
    agent any
    stages{
        stage('Init'){
            steps{
                echo "Code Pipeline Test"
            }
        }
        stage('Build'){
            steps{
                echo "Building maven project"
            }
        }
        stage('Deploy'){
            steps{
                echo "Deploying in Staging Area"
            }
        }
        stage('Deploy to PRD'){
            steps{
                echo "Deploying in Production Area"
            }
        }
    }
}