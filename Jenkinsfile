pipeline{
  agent any
  stages{
    stage ('checkout'){
      steps{
      echo 'code checkout'
    }
  }
   stage('compile'){
    steps{
      sh ' mvn -DskipTests=true  package'
      }
     
    }
  }
}
