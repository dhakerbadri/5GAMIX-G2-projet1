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
        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('sonarInstallation') {
                    sh 'mvn clean verify sonar:sonar -Dsonar.projectName=\'5GAMIX-G2-projet1\' -Dsonar.projectVersion=1.0  -Dsonar.sources=src/main/java -Dsonar.sourceEncoding=UTF-8 -Dsonar.language=java -Dsonar.java.binaries=target/classes'
                }
            }
            post {
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
        // stage ('JUNIT/MOCKITO') {
        //     steps {
        //     }
        // }
        stage ('Deploy to Nexus') {
            steps {
                sh 'mvn deploy'
            }
        }
    }
}