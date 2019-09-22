#!/usr/bin/env groovy

def call(body) {

	pipeline {
		agent any	

		stages {
			stage('Build') {
				steps {
					echo 'Building..'
					bat 'mvn install -f formacaoJava2019/pom.xml'
				}
			}
			
			stage('Test') {
				steps {
				
					echo "Check status"
					
				}
			}
			
			stage('Deploy') {
				steps {
					echo 'Deploying....'
					bat "xcopy \"formacaoJava2019\\target\\formacaoJava2019-0.0.1-SNAPSHOT.war\" \"C:\\Tomcat\\apache-tomcat-8.5.46\\webapps\" /y"
				}
			}
		}
	}

}