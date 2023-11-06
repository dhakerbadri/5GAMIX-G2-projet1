pipeline {
    agent any
    stages {
        stage ('Checkout to SCM') {
            steps {
                git branch: 'ChehineZouari-5GAMIX-G2',  url: 'https://github.com/dhakerbadri/5GAMIX-G2-projet1.git'
                sh 'git checkout ChehineZouari-5GAMIX-G2'
                sh 'ls -la'
                sh "echo 'Hello World'"
            }
        }
    }
}