pipeline{
    agent any
    stages{
        stage("CheckoutStage"){
            checkout scm
        }
        stage("Build Source Code"){
            echo "Building Source Code"
            sh "mvn install"
        }

        stage("Run UNIT-Tests"){
            echo "Runnning Unit Tests"
            sh "mvn test"
        }

        stage("Static Code Analysis"){
            echo "Runnning Code Analysis"
        }
    }
}
