package com.careerit.jfs.interview;

class TaskManager {

    private static volatile TaskManager taskManager = null;

    private TaskManager() {
    }

    public void showRunningTasks() {
        System.out.println("Showing running tasks");
    }

    public static TaskManager getInstance() {
        if(taskManager == null) {
            synchronized (TaskManager.class) {
                if (taskManager == null) {
                    taskManager = new TaskManager();
                }
            }
        }
        return taskManager;
    }
}

public class SingletonManager {

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                TaskManager taskManager = TaskManager.getInstance();
                System.out.println(taskManager);
            }
        });
       Thread t2 = new Thread(new Runnable() {
            public void run() {
                TaskManager taskManager = TaskManager.getInstance();
                System.out.println(taskManager);
            }
        });

        Thread t3 = new Thread(new Runnable() {
            public void run() {
                TaskManager taskManager = TaskManager.getInstance();
                System.out.println(taskManager);
            }
        });
        t1.start();
        t2.start();
        t3.start();

    }

}
