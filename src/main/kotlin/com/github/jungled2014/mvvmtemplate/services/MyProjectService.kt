package com.github.jungled2014.mvvmtemplate.services

import com.github.jungled2014.mvvmtemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
