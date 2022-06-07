/**
* JetBrains Space Automation
* This Kotlin-script file lets you automate build activities
* For more info, see https://www.jetbrains.com/help/space/automation.html
*/

job("Code analysis, plan, up and test") {
    container(displayName = "Sonarqube continuous inspection of code quality and security", image = "openjdk:11")
    {
        env["SONAR_TOKEN"] = Secrets("terraspace_infra_sonar_token")
        kotlinScript { api->
            api.gradlew("sonarqube")
        }
    }
}