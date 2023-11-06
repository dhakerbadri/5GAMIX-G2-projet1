pipeline {
    agent any
    tools {
        maven 'M2_HOME'
    }
    stages {
        stage ('Checkout to SCM') {
            steps {
                git branch: 'dhakerBADRI-5GAMIX-G2', url: 'https://github.com/dhakerbadri/5GAMIX-G2-projet1.git'
                sh 'git checkout dhakerBADRI-5GAMIX-G2'
                sh 'ls -la'
                sh "echo 'Hello World'"
            }
        }
        stage ('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
    }
}