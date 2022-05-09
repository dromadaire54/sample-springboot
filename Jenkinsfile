node {
    stage("Checkout Source Code"){
        echo "Checkout Source Code"
        checkout scm
    }

    stage("Run init tests") {
        echo "Running unit tests"
        sh "mvn test"
    }

    stage("Build project") {
        echo "Build project"
        sh "mvn package -DskipTests"
    }

    stage("Deploy") {
        configFileProvider([configFile(fileId: '9209bbe4-269c-4d57-832b-8a37bcf61e60', variable: 'MAVEN_SETTINGS')]) {
            // Exécuter la commande mvn avec le settings
            sh "mvn deploy -s $MAVEN_SETTINGS -Preposilite"
        }
    }
}
