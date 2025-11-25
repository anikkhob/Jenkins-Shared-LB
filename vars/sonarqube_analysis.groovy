def call (String SonarQubeAPI, String ProjectName ,String ProjectKey) {
  WithSonarQubeEnv ("${SonarQubeAPI}"){
    sh "$SONAR_HOME/bin/sonar_scanner -Dsonar.projectName=${ProjectName} -x
}
}
