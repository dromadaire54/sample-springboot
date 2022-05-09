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
}
