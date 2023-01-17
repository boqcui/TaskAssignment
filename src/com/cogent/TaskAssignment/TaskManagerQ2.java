/**
 * 
 */
package com.cogent.TaskAssignment;

/**
 * @author: Boqiang Cui
 * @date: Jan 16, 2023
 */
public class TaskManagerQ2 {
	private final String userName;
	private Task t1;
	private Task t2;
	private Task t3;
	
	public TaskManagerQ2(String userName, Task t1, Task t2, Task t3) {
		this.userName = userName;
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
	}
	
	public void showUserName() {
		System.out.println("Your name is: " + userName);
	}
	
	public void checkTask(boolean increasingOrder) {
		String min = "";
		String mid = "";
		String max = "";
		boolean countT1 = false;
		boolean countT2 = false;
		boolean countT3 = false;
		if (t1.getTaskId() < t2.getTaskId() && t1.getTaskId() < t3.getTaskId()) {
			min = t1.getTaskName();
			countT1 = true;
		}
		else if (t2.getTaskId() < t1.getTaskId() && t2.getTaskId() < t3.getTaskId()) {
			min = t2.getTaskName();
			countT2 = true;
		} else {
			min = t3.getTaskName();
			countT3 = true;
		}
				
		if (t1.getTaskId() > t2.getTaskId() && t1.getTaskId() > t3.getTaskId()) {
			max = t1.getTaskName();
			countT1 = true;
		}
		else if (t2.getTaskId() > t1.getTaskId() && t2.getTaskId() > t3.getTaskId()) {
			max = t2.getTaskName();
			countT2 = true;
		} else {
			max = t3.getTaskName();
			countT3 = true;
		}
		
		if (!countT1) {
			mid = t1.getTaskName();
		} 
		else if (!countT2) {
			mid = t2.getTaskName();
		} else {
			mid = t3.getTaskName();
		}
		
		if (increasingOrder) {
			System.out.println(min);
			System.out.println(mid);
			System.out.println(max);
		} else {
			System.out.println(max);
			System.out.println(mid);
			System.out.println(min);
		}
	}
	
	public void findDuplicate() {
		if (t1.getTaskName().equals(t2.getTaskName()) && t1.getTaskName().equals(t3.getTaskName())) {
			System.out.println("Task ID: " + t1.getTaskId() + ", Task Name: " + t1.getTaskName());
			System.out.println("Task ID: " + t2.getTaskId() + ", Task Name: " + t2.getTaskName());
			System.out.println("Task ID: " + t3.getTaskId() + ", Task Name: " + t3.getTaskName());
		}
		else if (t1.getTaskName().equals(t2.getTaskName())) {
			System.out.println("Task ID: " + t1.getTaskId() + ", Task Name: " + t1.getTaskName());
			System.out.println("Task ID: " + t2.getTaskId() + ", Task Name: " + t2.getTaskName());
		}
		else if (t1.getTaskName().equals(t3.getTaskName())) {
			System.out.println("Task ID: " + t1.getTaskId() + ", Task Name: " + t1.getTaskName());
			System.out.println("Task ID: " + t3.getTaskId() + ", Task Name: " + t3.getTaskName());
		}
		else if (t2.getTaskName().equals(t3.getTaskName())) {
			System.out.println("Task ID: " + t2.getTaskId() + ", Task Name: " + t2.getTaskName());
			System.out.println("Task ID: " + t3.getTaskId() + ", Task Name: " + t3.getTaskName());
		}
	}
	
	
}
