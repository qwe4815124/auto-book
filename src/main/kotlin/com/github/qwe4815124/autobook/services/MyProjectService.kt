package com.github.qwe4815124.autobook.services

import com.intellij.openapi.project.Project
import com.github.qwe4815124.autobook.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
