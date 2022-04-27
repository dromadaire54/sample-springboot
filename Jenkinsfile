node {
    stage("Build Source Code"){
        echo "Building Source Code"
        sh "mvn package -DskipTests"
    }

    stage("Run UNIT-Tests"){
        echo "Runnning Unit Tests"
        sh "mvn test"
    }
    
    stage("Deploy to server"){
        echo "deploy the application to the server"
        sh "scp target/spring-boot-0.0.1-SNAPSHOT.jar dromadaire@192.168.1.15:/home/dromadaire/applis/software/sample-springboot"
    }
}
