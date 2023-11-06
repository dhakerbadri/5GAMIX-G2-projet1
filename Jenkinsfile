pipeline {
    agent any
    stages {
        stage ('Checkout to SCM') {
            steps {
                git branch: 'islem-Hmazi-5Gamix-G2',  url: 'https://github.com/dhakerbadri/5GAMIX-G2-projet1.git'
                sh 'git checkout islem-Hmazi-5Gamix-G2'
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