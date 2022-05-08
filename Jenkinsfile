node {
    stage("Checkout Source Code"){
        echo "Checkout Source Code"
        checkout scm
    }

    stage("Run unit tests"){
        echo "Runnning Unit Tests"
        sh './mvn -s $MAVEN_SETTINGS test'
    }

    stage("Build Source Code"){
        echo "Building Source Code"
        sh './mvnw -s $MAVEN_SETTINGS package -DskipTests'
        
    }
    
    stage("Deploy to registry"){
        echo "deploy the application to the server"
        [configFile(fileId: 'maven-settings', variable: 'MAVEN_SETTINGS')]) {
            sh './mvnw -s $MAVEN_SETTINGS -Pdeposilite deploy'
        }
    }
}
