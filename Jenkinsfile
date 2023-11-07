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
       stage('Build') {
            steps {
                script {
                    sh "mvn --version" // Use the specified Maven installation
                    sh "mvn clean package -DskipTests" // Build your Maven project
                }
            }
        }
       stage('Run Sonar')  {
            steps {
                withCredentials([string(credentialsId: '4598b638-c854-4694-bbfc-a1d716874816', variable: 'SONAR_TOKEN')]) {
                    sh 'mvn sonar:sonar -Dsonar.host.url=http://192.168.33.10:9000/ -Dsonar.login=$SONAR_TOKEN'
                }
            }
        }
        stage('Run Tests') {
            steps {
                sh 'mvn test'
            }
        }
        stage("Nexus") {
            steps {
                sh "mvn deploy -DskipTests"
            }
        }
    }
}
