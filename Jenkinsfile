pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                dir('DevOpsAssignment') {
                    bat 'mvn clean package'
                }
            }
        }
        stage('test') {
            steps {
                dir('DevOpsAssignment') {
                    bat 'mvn test'
                }
            }
        }
    }
}
