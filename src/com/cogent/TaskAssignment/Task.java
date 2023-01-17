/**
 * 
 */
package com.cogent.TaskAssignment;

/**
 * @author: Boqiang Cui
 * @date: Jan 16, 2023
 */
public class Task {
	private int taskId;
	private String taskName;
	
	public Task() {
		this.taskId = -1;
		this.taskName = "null";
	}
	
	public Task(int taskId, String taskName) {
		this.taskId = taskId;
		this.taskName = taskName;
	}
	
	public int getTaskId() {
		return this.taskId;
	}
	
	public String getTaskName() {
		return this.taskName;
	}
	
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
}
