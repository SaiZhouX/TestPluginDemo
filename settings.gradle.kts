pluginManagement {
    repositories {
        maven("F:/Android/workspace/HelloPlugin/plugin").isAllowInsecureProtocol = true
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven("F:/Android/workspace/HelloPlugin/plugin").isAllowInsecureProtocol = true
        google()
        mavenCentral()
    }
}

rootProject.name = "TestPluginDemo"
include(":app")
 