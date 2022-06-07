/**
* JetBrains Space Automation
* This Kotlin-script file lets you automate build activities
* For more info, see https://www.jetbrains.com/help/space/automation.html
*/

job("Code analysis, up and and test") {
    container(displayName = "Continuous inspection of code quality and security",image = "sonarsource/sonar-scanner-cli"){
        env["SONAR_LOGIN"] = Secrets("sonar_token")
        env["SONAR_HOST_URL"] = Params("sonar_host_url")
        args("-Dsonar.projectKey=a-aziz93_infra","-Dsonar.organization=a-aziz93")
    }
}