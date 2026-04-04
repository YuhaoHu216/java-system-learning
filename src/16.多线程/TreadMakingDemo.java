import java.util.concurrent.*;

import java.util.concurrent.ExecutionException;

public class TreadMakingDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        System.out.println("=== 1. 继承 Thread 类 ===");
        extendThreadDemo();

        System.out.println("\n=== 2. 实现 Runnable 接口 ===");
        implementRunnableDemo();

        System.out.println("\n=== 3. 实现 Callable 接口（有返回值）===");
        implementCallableDemo();

        System.out.println("\n=== 4. 使用 Lambda 表达式 ===");
        lambdaThreadDemo();

        System.out.println("\n=== 5. 线程池创建线程 ===");
        threadPoolDemo();
    }

    // 1. 继承 Thread 类
    private static void extendThreadDemo() throws InterruptedException {
        MyThread thread = new MyThread("继承Thread的线程");
        thread.start();
        thread.join();
    }
    // 2. 实现 Runnable 接口
    private static void implementRunnableDemo() throws InterruptedException {
        Thread thread = new Thread(new MyRunnable(), "实现Runnable的线程");
        thread.start();
        thread.join();
    }

    // 3. 实现 Callable 接口（有返回值）
    private static void implementCallableDemo() throws ExecutionException, InterruptedException {
        MyCallable callable = new MyCallable();
        FutureTask<String> futureTask = new FutureTask<>(callable);
        Thread thread = new Thread(futureTask, "实现Callable的线程");
        thread.start();

        String result = futureTask.get();
        System.out.println("Callable返回结果: " + result);
    }
    // 4. 使用 Lambda 表达式
    private static void lambdaThreadDemo() throws InterruptedException {
        Thread thread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " - 计数: " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }, "Lambda线程");

        thread.start();
        thread.join();
    }
    // 5. 线程池创建线程
    private static void threadPoolDemo() throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            final int taskId = i;
            executor.submit(() -> {
                System.out.println(Thread.currentThread().getName() + " 执行任务 " + taskId);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        executor.shutdown();
        while (!executor.isTerminated()) {
            Thread.sleep(100);
        }
        System.out.println("所有线程池任务完成");
    }
}

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - 计数: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                interrupt();
            }
        }
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - 计数: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - 计数: " + i);
            Thread.sleep(100);
        }
        return "Callable任务完成，返回结果";
    }
}


