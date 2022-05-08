node {
    stage("Checkout Source Code"){
        echo "Checkout Source Code"
        checkout scm
    }

    stage("Run unit tests"){
        echo "Runnning Unit Tests"
        sh 'mvn test'
    }

    stage("Build Source Code"){
        echo "Building Source Code"
        sh 'mvn package -DskipTests'
        
    }
    
    stage("Deploy to registry"){
        echo "deploy the application to the server"
        configFileProvider([configFile(fileId: '9209bbe4-269c-4d57-832b-8a37bcf61e60', variable: 'MAVEN_SETTINGS')]) {
            sh 'mvn -s $MAVEN_SETTINGS -Preposilite deploy'
        }
    }
}
