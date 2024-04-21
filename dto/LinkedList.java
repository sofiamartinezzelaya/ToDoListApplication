package org.sofia.dto;

public class LinkedList {
    Node head;

    /**
     * will allow new nodes to be created at the end of the linked list, and these nodes will have the data of the task being created
     * @param data is the data of the tasks which will be from the Task class
     */
    public void insert(Tasks data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if(head == null) {
            head = node;
        }
        else {
            Node n1 = head;//starts from beginning of linked list
            while(n1.next != null){
                n1 = n1.next;
            }
            n1.next = node;
        }
    }

    /**
     * no return type, will show the data of the nodes/information of the tasks
     */
    public void show() {

    }
    //search how to do multiple conditions when sorting

}
