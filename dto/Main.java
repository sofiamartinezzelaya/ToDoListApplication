package org.sofia.dto;

import java.util.Scanner;
import java.io.File;
//more file imports will be used upon implementation;

/**
 * To Do List Application
 *
 * @author Sofia Martinez
 */
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        while(true) {
            System.out.println("MENU\n1-Create org.sofia.dto.Tasks\n2-View org.sofia.dto.Tasks\n3-View a specific task\n4-Edit a task\n5-Delete a task" +
                    "\n7-Sort tasks");//more possible options (undo and redo may be done in the above options or as another seperate option
            int option = console.nextInt();

            switch (option) {
                case 1:
                    break;
                case 2:
                    break;
                    //file management will be done when viewing tasks
                case 3:
                    break;
                //file management will be done when viewing a task
                case 4:
                    break;
                //file management will be done when viewing tasks
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default: break;
            }
        }
    }
    //file management may be done in more of the switch cases
}