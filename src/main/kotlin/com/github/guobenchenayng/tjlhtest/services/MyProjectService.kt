package com.github.guobenchenayng.tjlhtest.services

import com.intellij.openapi.project.Project
import com.github.guobenchenayng.tjlhtest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
