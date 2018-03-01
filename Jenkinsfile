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
        "VAULT_TOKEN": "ascent-platform",
        "ELK_VAULT_TOKEN": "elk"
    ]
    testEnvironment = ['docker-compose.yml']
    serviceToTest = 'ascent-zipkin'
    deployWaitTime = 300
    testVaultTokenRole = "ascent-platform"
}