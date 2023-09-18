pipeline {
    agent any
    stages {
        stage('build') {
            steps {
		dir('C:\ProgramData\Jenkins\.jenkins\workspace\SpringDevOpsAssignment2\DevOpsAssignment\pom.xml'){
                bat 'mvn clean package'
		}
            }
        }
    }
}