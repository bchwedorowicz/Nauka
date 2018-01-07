package pl.java.kolejki;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class TaskManager {

	public static final int ADD_TASK = 1;
	public static final int GET_TASK = 2;
	public static final int EXIT = 0;
	private Queue<Task> tasks = new PriorityQueue<>();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int button = -1;
		TaskManager list = new TaskManager();

		Task shower = new Task("shower", "take a shower", Priority.LOW);
		Task wash = new Task("wash", "washing plates", Priority.HIGH);
		Task iron = new Task("iron", "iron your clothes", Priority.MODERATE);
		Task print = new Task("print", "Print your CV", Priority.MODERATE);

		System.out.println("Press 1 to add new task" + "\n" + "Press 2 to get task" + "\n" + "Press 0 to exit");

		while (button != EXIT) {
			switch (button = sc.nextInt()) {
			case ADD_TASK:
				list.addTask(shower);
				list.addTask(wash);
				list.addTask(iron);
				list.addTask(print);
				break;
			case GET_TASK:
				System.out.println(list.getTask());
				System.out.println(list.getTask());
				System.out.println(list.getTask());
				break;
			case EXIT:
				break;
			default:
				sc.close();
			}

		}

	}

	public void addTask(Task taks) {
		tasks.offer(taks);
	}

	public Task getTask() {
		return tasks.poll();
	}

}
