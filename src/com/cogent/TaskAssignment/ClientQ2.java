/**
 * 
 */
package com.cogent.TaskAssignment;

import java.util.Scanner;


/**
 * @author: Boqiang Cui
 * @date: Jan 16, 2023
 */
public class ClientQ2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter your first Task id: ");
		int tID1 = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your first Task name: ");
		String tName1 = sc.nextLine();
		
		System.out.println("Enter your second Task id: ");
		int tID2 = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your second Task name: ");
		String tName2 = sc.nextLine();
		
		System.out.println("Enter your third Task id: ");
		int tID3 = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your third Task name: ");
		String tName3 = sc.nextLine();
		
		if(checkDuplicateTaskId(tID1, tID2, tID3) == false) {
			System.out.println("Task Ids cannot be the same");
			main(null);
			System.exit(0);
		}
		
		TaskManagerQ2 manager = new TaskManagerQ2(name, 
				new Task(tID1, tName1), new Task(tID2, tName2), new Task(tID3, tName3));
		
		while (true) {
			showMenu();
			int choice = sc.nextInt();
			switch(choice) {
			case 0:
				System.out.println("Done.");
				sc.close();
				System.exit(choice);
			case 1:
				manager.showUserName();
				break;
			case 2:
				manager.checkTask(true);
				break;
			case 3:
				manager.checkTask(false);
				break;
			case 4:
				manager.findDuplicate();
				break;
			default:
				System.out.println("Not a vaild number");
			}
		}
	}
	
	private static boolean checkDuplicateTaskId(int t1, int t2, int t3) {
		if (t1 == t2 || t1 == t3 || t2 == t3) return false;
		return true;
	}
	
	private static void showMenu() {
		System.out.println("*****Menu******");
		System.out.println("Type 1 for printing your name on the screen");
		System.out.println("Type 2 for seeing all the tasks in increasing order");
		System.out.println("Type 3 for seeing all the tasks in decreasing order");
		System.out.println("Type 4 for seeing the repeated tasks");
		System.out.println("Type 0 to exit");
	}
	

}
