pipeline {
    agent any
    stages {
        stage('build') {
            steps {
		dir('DevOpsAssignment'){
                bat 'mvn clean package'
		}
            }
        }
    }
}