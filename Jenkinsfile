#!/usr/bin/groovy

def VERSION
def TAGGED

node {
    stage("Checkout Source Code"){
        echo "Checkout Source Code"
        checkout scm
        
        if (env.TAG_NAME) {
            VERSION = env.TAG_NAME.substring(1)
            echo "${VERSION}"
            TAGGED = true
        } else {
            TAGGED = false
        }
    }

    stage("Run unit tests"){
        echo "Runnning Unit Tests"
        sh 'mvn test'
    }

    stage("Prepare Release") {
        if (TAGGED) {
            sh "mvn -e -B versions:set -DnewVersion=${VERSION}"
            sh "mvn -e -B versions:commit"
        }
    }

    stage("Build Source Code"){
        echo "Building Source Code"
        sh "mvn package -DskipTests"
        
    }
    
    stage("Deploy to registry"){
        echo "deploy the application to the server"
        configFileProvider([configFile(fileId: '9209bbe4-269c-4d57-832b-8a37bcf61e60', variable: 'MAVEN_SETTINGS')]) {
            sh "mvn -s $MAVEN_SETTINGS -Preposilite deploy"
        }
    }

    stage("Update integration") {
        echo "Get the latest version in the registry and restart the service"
        sh '''
            ssh root@172.16.44.90 /opt/sample-springboot/update.sh
        '''
    }    
}