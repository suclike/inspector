package com.jakeout.gradle.inspector

import groovy.transform.Canonical

@Canonical
class TaskStats {
    public TaskDiffStats diffStats
    public TaskExecutionStats executionStats
}