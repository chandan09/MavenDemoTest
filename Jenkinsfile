pipeline{
  agent any
  stages{
    stage('checkout'){
      step{
      echo 'code checkout'
    }
  }
   stage('compile'){
    steps{
      sh ' mvn compile package'
      }
     
    }
  }
}
