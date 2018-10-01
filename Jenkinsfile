@Library('ascent') _

microservicePipeline {
    imageName = 'ascent/ascent-zipkin'

    //Specify string of comma separated upstream projects that will
    //trigger this build if successful
    upstreamProjects = '../ascent-platform/development'

    /*
    Define a mapping of environment variables that will be populated with Vault token values
    from the associated vault token role
    */
    vaultTokens = [
        "PLATFORM_TOKEN": "ascent-platform"
    ]
    testEnvironment = ['docker-compose.yml', 'docker-compose.override.yml']
    containerPort = 8700

    // TODO!!! Need to have some kind of variable set for deploying to dev
    //     all we have right now is the perfEnvironment variable, which is
    //     probably not what we want to use. Probably library should
    //     support something like this:
    //deployEnvironment = ['docker-compose.yml']
    serviceToTest = 'ascent-zipkin'
    deployWaitTime = 300
    testVaultTokenRole = "ascent-platform"

    /*********  Deployment Configuration ***********/
    stackName = "zipkin"
    serviceName = "ascent-zipkin"

    //Default Deployment Configuration Values
    //composeFiles = ["docker-compose.yml"]
}
