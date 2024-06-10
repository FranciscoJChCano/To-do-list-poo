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