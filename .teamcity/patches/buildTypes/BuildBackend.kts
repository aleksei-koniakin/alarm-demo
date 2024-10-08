package patches.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.gradle
import jetbrains.buildServer.configs.kotlin.buildSteps.qodana
import jetbrains.buildServer.configs.kotlin.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the buildType with id = 'BuildBackend'
accordingly, and delete the patch script.
*/
changeBuildType(RelativeId("BuildBackend")) {
    expectSteps {
        gradle {
            tasks = "build"
            gradleParams = "-x test"
        }
        qodana {
            enabled = false
            linter = jvm {
            }
            additionalDockerArguments = """-e QODANA_REVISION="%build.vcs.number%" -e QODANA_REMOTE_URL="%vcsroot.url%" -e QODANA_BRANCH="%vcsroot.branch%%""""
            cloudToken = "credentialsJSON:98b80096-d5bb-41ca-9000-06f287466a77"
        }
    }
    steps {
        items.removeAt(1)
    }
}
