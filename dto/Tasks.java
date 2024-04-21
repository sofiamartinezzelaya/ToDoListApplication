package org.sofia.dto;

import org.sofia.dto.PriorityLevels;

public class Tasks {
    public String taskName;
    public String description;
    public String dueDate;
    public PriorityLevels priorityLevels;
    public boolean completionStatus;

    public Tasks () {
        this.taskName = null;
        this.description = null;
        this.dueDate = null;
        this.priorityLevels = null;
        this.completionStatus = false;
    }

    public Tasks(String taskName, String description, String dueDate, PriorityLevels priorityLevels, boolean completionStatus) {
        this.taskName= taskName;
        this.description = description;
        this.dueDate = dueDate;
        this.priorityLevels = priorityLevels;
        this.completionStatus = completionStatus;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String TaskName) {
        this.taskName = taskName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public PriorityLevels getPriorityLevels() {
        return priorityLevels;
    }

    public void setPriorityLevels(PriorityLevels priorityLevels) {
        this.priorityLevels = priorityLevels;
    }

    public boolean isCompletionStatus() {
        return completionStatus;
    }

    public void setCompletionStatus(boolean completionStatus) {
        this.completionStatus = completionStatus;
    }
}
