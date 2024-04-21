package org.sofia.dto;

import org.sofia.dto.PriorityLevels;
import org.sofia.dto.Task_Interface;

import java.util.Scanner;

public class TaskManagement extends Tasks implements Task_Interface {
    public Tasks task;
    public Tasks[] tasks;
    public Tasks[] dueDates;
    public Tasks[] descriptions;
    public Tasks[] completionStats;
    public PriorityLevels priorityLevels;//may be modified to an array
    //do we need to use gitHub for the deliverables?
    Scanner console = new Scanner(System.in);
    public TaskManagement(String title, String description, String dueDate, PriorityLevels priorityLevels, boolean completionStatus, Tasks task) {
        super(title, description, dueDate, priorityLevels, completionStatus);
        this.task = task;
    }

    /**
     * no return type, will create a new task and set the name according to user input
     */
    public void newTask() {//creates new Task
        System.out.println("What is the title of this task?");
        String title = console.nextLine();
        setTaskName(title);
    }

    /**
     * no return type, will print out information regarding the specific task inputted
     * @param taskName is the task name, making it easier for the user to view info about one specific task
     */
    public void viewSpecificTask (String taskName) {

    }

    /**
     * no return type, will print out information regarding all the tasks that were created by the user
     * no parameter needed to view all tasks
     */
    public void viewTask() { //will view all attributes of the task
        /*System.out.println("Task: "+ super.getTaskName());
        System.out.println("Description: "+ super.getDescription());
        System.out.println("Due Date: "+ super.getDueDate());
        System.out.println("Priority Level: "+ super.getPriorityLevels());
        System.out.println("Is this task completed: " + super.isCompletionStatus());*/
        //implementation needs to be modified
    }

    /**
     * no return type, it will ask user what they would like to change/modify in their task information according to the task they enter
     * all information such as title, description, due date, priority level, and completion status will be edited in this method
     * @param taskName is the title of the task they would like to edit
     */
    public void editTask(String taskName) { //edits whatever the user chooses to edit
        System.out.println("What would you like to change: \n1-Title\n2-Description\n3-Due Date\n4-Priority Level\n5-Completion Status");
        int option = console.nextInt();
        switch (option) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            default: break;
        }
    }

    /**
     * no return type, will delete task according to the task
     * @param taskName is the name of the task that will be deleted
     */
    public void deleteTask(String taskName) {
        //will delete task
        //also delete from the linkedlist
        System.out.println("Task successfully deleted");
    }

    /**
     * no return type, will undo the last change the user made
     * parameter may need to be modified
     */
    public void undo() {

    }

    /**
     * no return type (may be subject to change), will allow user to redo what the user just undid (which used the undo method)
     */
    public void redo() {

    }

    /**
     * sorts and filters tasks based on what user would like to sort/filter
     * @param tasks are the tasks that are put into an array containing all the existing tasks (may be modified)
     * @returns the tasks array (array may be modified) sorted and filtered based on certain criteria
     */
    public Tasks[] sort(Tasks[] tasks) {
        System.out.println("What would you like your list to be sorted according to: \n1-Due Date\n2-Priority Level\n3-Completion Status:" +
                "\nif you would like to filter your tasks, how would you like to filter the tasks: \n4-Completion Status\n5-Priority Level");
        int option = console.nextInt();
        switch (option) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default: break;
        }
        return tasks;//temporary return value
    }
    /**
     * searches a task
     * @param taskName is the name of the task that will be searched
     * @return the information of the task the user inputs
     */
    public Tasks search(String taskName) {
        return task; //temporary return value
    }
}
