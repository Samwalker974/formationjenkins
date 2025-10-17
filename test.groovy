public class DeployScript {
    def deployFunction() {
        echo 'Déploiement du projet en cours...'
    }
}

DeployScript deployer = new DeployScript()
deployer.deployFunction()
