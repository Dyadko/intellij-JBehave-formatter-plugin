package com.github.dyadko.intellijjbehaveformatterplugin.services

import com.github.dyadko.intellijjbehaveformatterplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
