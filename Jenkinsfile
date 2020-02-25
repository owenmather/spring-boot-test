pipeline {
    agent {
        docker {
            image 'maven:3.6.3-jdk-8' 
            args '-v /var/jenkins_home/workspace/test:/root/.m2
        }
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') { 
            steps {
                sh 'mvn test' 
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml' 
                }
            }
        }
    }
}
