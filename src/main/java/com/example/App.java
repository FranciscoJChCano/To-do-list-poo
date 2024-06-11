package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Add task");
            System.out.println("2. Remove task");
            System.out.println("3. List tasks");
            System.out.println("4. Mark task as completed");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    System.out.print("Enter the task description: ");
                    String description = scanner.nextLine();
                    taskList.addTask(description);
                    break;
                case 2:
                    System.out.print("Enter the index of the task to remove: ");
                    int removeIndex = scanner.nextInt();
                    taskList.removeTask(removeIndex);
                    break;
                case 3:
                    taskList.listTasks();
                    break;
                case 4:
                    System.out.print("Enter the index of the task to mark as completed: ");
                    int completeIndex = scanner.nextInt();
                    taskList.completeTask(completeIndex);
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }

        scanner.close();
    }
}