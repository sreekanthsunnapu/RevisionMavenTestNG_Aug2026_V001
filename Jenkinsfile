pipeline{
	agent any
	
	stages{
		
		stage('Checkout'){
			steps{
				echo "source code is available from SCM"
			}	
		}
		
		stage('Build'){
			steps{
				bat "mvn clean compile"
			}
		}
		
		stage("Test"){
			steps{
				bat "mvn test"
			}
		}
	}
	
	post{
		always{
			echo "Build Execution Completed"
			junit '**/target/surefire-reports/TEST-*.xml'
		}
		
		success{
			echo "Maven Project Execution Successful"
		}
		
		failure{
			echo "Execution Failed"
		}
	}
}