pipeline {
  agent any
  stages {
    stage('Build Application') {
      steps {
        bat 'gradle build'
      }
    }
    stage('Test') {
      steps {
        echo 'Test Appplication...'
        bat 'gradle test'
      }
    }
  }
}