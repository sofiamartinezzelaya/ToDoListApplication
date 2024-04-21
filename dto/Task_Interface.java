package org.sofia.dto;

public interface Task_Interface {
    /**
     * create a new task
     */
    public void newTask();

    /**
     * view a specific task identified by user
     * @param taskName is the name of the task
     */
    public void viewSpecificTask(String taskName);

    /**
     * view all tasks created by user
     */
    public void viewTask();

    /**
     * edit a specific task identified by user
     * @param taskName is the name of the task
     */
    public void editTask(String taskName);

    /**
     * delete a specific task identified by user
     * @param taskName is the name of the task
     */
    public void deleteTask(String taskName);


    /**
     * will undo the users last change
     */
    public void undo();

    /**
     * will redo whatever the user just undid while using the undo method
     */
    public void redo();

}
