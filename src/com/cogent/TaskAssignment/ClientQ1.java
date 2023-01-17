/**
 * 
 */
package com.cogent.TaskAssignment;

import java.util.Scanner;

/**
 * @author: Boqiang Cui
 * @date: Jan 16, 2023
 */
public class ClientQ1 {
	public static void main(String[] args) {
		TaskManagerQ1 manager = new TaskManagerQ1();
		while (true) {
			showMenu();
			Scanner sc = new Scanner(System.in);
			int id = -1;
			String name = "null";
			int choice = sc.nextInt();
			
			switch(choice) {
			case 0: 
				System.out.println("Done.");
				sc.close();
				System.exit(choice);

			case 1:
				System.out.println("Please enter taskId");
				id = sc.nextInt();
				sc.nextLine();
				System.out.println("Please enter taskName");
				name = sc.nextLine();
				if (!manager.addNewTask(new Task(id, name))) {
					System.out.println("taskId: " + id + " is already exist.");
				};
				break;
				
			case 2:
				System.out.println("Please enter the taskId which you want to update.");
				id = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter 1 for update taskId, 2 for update taskName.");
				int c = sc.nextInt();
				sc.nextLine();
				if (c == 1) {
					System.out.println("Enter new taskId");
					int newId = sc.nextInt();
					sc.nextLine();
					if(!manager.updateTask(id, newId)) {
						System.out.println("taskId: " + id + " isn't exist in system, "
								+ "please first add a new task with this taskId.");
					};
				} 
				else if (c == 2) {
					System.out.println("Enter new taskName");
					String newName = sc.nextLine();
					if(!manager.updateTask(id, newName)) {
						System.out.println("taskId: " + id + " isn't exist in system, "
								+ "please first add a new task with this taskId.");
					}
				} else {
					System.out.println("Vaild number");
					continue;
				}
				break;
				
			case 3:
				System.out.println("Please enter the taskId which you want to delete.");
				id = sc.nextInt();
				if(!manager.deleteTask(id)) {
					System.out.println("taskId: " + id + " isn't exist in system.");
				}
				break;
				
			case 4:
				System.out.println("Please enter the taskId which you want to find.");
				id = sc.nextInt();
				Task find = manager.findTask(id);
				if (find != null) {
					System.out.println(find.getTaskName());
				} else {
					System.out.println("Not found");
				}
				break;
				
			case 5:
				manager.showAllTask();
				break;
			default:
				System.out.println("Not a vaild number");
			}
		}
	}
	
	private static void showMenu() {
		System.out.println("*****Menu******");
		System.out.println("Type 1 for Adding a new task");
		System.out.println("Type 2 for Updating a new task");
		System.out.println("Type 3 for Deleting a new Task");
		System.out.println("Type 4 for Searching a new task");
		System.out.println("Type 5 for printing all the tasks");
		System.out.println("Type 0 to exit");
	}
}
