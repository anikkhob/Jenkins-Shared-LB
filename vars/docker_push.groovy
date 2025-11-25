def call(String Project, String ImageTag, String dockerhubuser) {

    withCredentials([usernamePassword(
        credentialsId: 'Docker',
        usernameVariable: 'dockerhubuser',
        passwordVariable: 'dockerhubpass'
    )]) {

        sh """
            echo "$dockerhubpass" | docker login -u "$dockerhubuser" --password-stdin
        """
    }

    sh """
        docker push ${dockerhubuser}/${Project}:${ImageTag}
    """
}
