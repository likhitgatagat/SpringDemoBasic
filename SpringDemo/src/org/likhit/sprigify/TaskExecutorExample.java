package org.likhit.sprigify;

import org.springframework.core.task.TaskExecutor;

public class TaskExecutorExample {
	private class MessagePrintingTask implements Runnable {
		private String message;
		
		public MessagePrintingTask(String message) {
			this.message = message;
		}
		
		public void run() {
			System.out.println(message);
		}
	}
	
	private TaskExecutor taskExecutor;
	public TaskExecutorExample(TaskExecutor taskExecutor) {
		this.taskExecutor = taskExecutor;
	}
	
	public void printMessage() {
		for(int i=0; i<10; i++) {
			taskExecutor.execute(new MessagePrintingTask("Message printing task: " + i));
		}
	}
}
