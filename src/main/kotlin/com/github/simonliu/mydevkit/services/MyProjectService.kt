package com.github.simonliu.mydevkit.services

import com.github.simonliu.mydevkit.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
