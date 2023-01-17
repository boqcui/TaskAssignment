/**
 * 
 */
package com.cogent.TaskAssignment;

/**
 * @author: Boqiang Cui
 * @date: Jan 16, 2023
 */
public class TaskManagerQ1 {
	private static Task[] tasks;
	private static int pointer;
	
	public TaskManagerQ1() {
		tasks = new Task[2];
		pointer = 0;
	}
	
	public boolean addNewTask(Task t) {
		if (findTask(t.getTaskId()) != null) return false;
		if (pointer == tasks.length) increaseArraySize();
		tasks[pointer] = t;
		pointer++;
		return true;
	}
	
	public boolean updateTask(int taskId, Object newObj) {
		Task t = findTask(taskId);
		if (t == null) {
			return false;
		}
		if (newObj instanceof String) t.setTaskName((String)newObj);
		if (newObj instanceof Integer) t.setTaskId((int)newObj);
		return true;
	}
	
	
	public boolean deleteTask(int taskId) {
		int position = -1;
		for (int i = 0; i < pointer; i++) {
			if (tasks[i].getTaskId() == taskId) {
				position = i;
				break;
			}
		}
		if (position == -1) {
			return false;
		}
		
		for (int i = position; i < tasks.length-1; i++) {
			tasks[i] = tasks[i+1];
		}
		pointer--;
		return true;
	}
	
	
	public Task findTask(int taskId) {
		for (Task task : tasks) {
			if (task == null) break;
			if (task.getTaskId() == taskId) return task;
		}
		return null;
	}
	
	public void showAllTask() {
		for (int i = 0; i < pointer; i++) {
			System.out.println("taskId: " + tasks[i].getTaskId() + ", taskName: " + tasks[i].getTaskName());
		}
	}
	
	
	
	
	private void increaseArraySize() {
		Task[] temp = new Task[tasks.length*2];
		for (int i = 0; i < tasks.length; i++) {
			temp[i] = tasks[i];
		}
		tasks = temp;
	}
}