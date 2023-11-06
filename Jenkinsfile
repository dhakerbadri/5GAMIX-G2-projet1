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
        stage ('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('sonarInstallation') {
                    sh 'mvn clean verify sonar:sonar -Dsonar.projectKey=5GAMIX-G2-projet1 -Dsonar.projectName=\'5GAMIX-G2-projet1\' -Dsonar.projectVersion=1.0  -Dsonar.sources=src/main/java -Dsonar.sourceEncoding=UTF-8 -Dsonar.language=java -Dsonar.java.binaries=target/classes'
                }
               }   }
    }
}