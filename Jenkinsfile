pipeline{
    agent any
    options {
        timestamps()
    }
    stages{
        stage("compile"){
            steps{
                sh 'javac Main.java'
            }
        }
        stage("run"){
            steps{
                sh 'java Main'
            }
        }
        stage("cleanup"){
            steps{
                echo 'Build finished, cleaning up workspace.'
            }
        }
    }
}
