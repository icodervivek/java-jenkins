pipeline{
    agent any
    stages{
        stage("compile"){
            step{
                sh 'javac Main.java'
            }
        }
        stage("run"){
            step{
                sh 'java Main'
            }
        }
    }
}