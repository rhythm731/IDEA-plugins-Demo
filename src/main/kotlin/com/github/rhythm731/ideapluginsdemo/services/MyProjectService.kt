package com.github.rhythm731.ideapluginsdemo.services

import com.intellij.openapi.project.Project
import com.github.rhythm731.ideapluginsdemo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
