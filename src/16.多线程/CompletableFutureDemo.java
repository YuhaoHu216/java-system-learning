import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CompletableFutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        
        System.out.println("=== 1. 基本使用 - supplyAsync ===");
        basicSupplyAsync();

        System.out.println("\n=== 2. 基本使用 - runAsync ===");
        basicRunAsync();

        System.out.println("\n=== 3. thenApply - 转换结果 ===");
        thenApplyDemo();

        System.out.println("\n=== 4. thenAccept - 消费结果 ===");
        thenAcceptDemo();

        System.out.println("\n=== 5. thenRun - 执行后续任务 ===");
        thenRunDemo();

        System.out.println("\n=== 6. thenCombine - 合并两个任务结果 ===");
        thenCombineDemo();

        System.out.println("\n=== 7. allOf - 等待所有任务完成 ===");
        allOfDemo();

        System.out.println("\n=== 8. anyOf - 任一任务完成即继续 ===");
        anyOfDemo();

        System.out.println("\n=== 9. 异常处理 ===");
        exceptionHandlingDemo();

        System.out.println("\n=== 10. 链式调用 ===");
        chainCallDemo();
    }

    private static void basicSupplyAsync() throws ExecutionException, InterruptedException {
        // 异步执行有返回值的任务
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            sleep(1);
            return "Hello";
        });
        System.out.println("结果: " + future.get());
    }

    private static void basicRunAsync() throws ExecutionException, InterruptedException {
        // 异步执行无返回值的任务
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            sleep(1);
            System.out.println("执行无返回值的任务");
        });
        future.get();
    }

    private static void thenApplyDemo() throws ExecutionException, InterruptedException {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            sleep(1);
            return "Hello";
        }).thenApply(result -> {
            // 对结果进行操作
            sleep(1);
            return result + " World";
        });
        System.out.println("结果: " + future.get());
    }

    private static void thenAcceptDemo() throws ExecutionException, InterruptedException {
        CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {
            sleep(1);
            return "Hello";
        }).thenAccept(result -> {
            // 消费结果
            sleep(1);
            System.out.println("消费结果: " + result);
        });
        future.get();
    }

    private static void thenRunDemo() throws ExecutionException, InterruptedException {
        CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {
            sleep(1);
            return "Hello";
        }).thenRun(() -> {
            // 任务完成后执行后续操作
            sleep(1);
            System.out.println("前一个任务完成后执行，不关心结果");
        });
        future.get();
    }

    private static void thenCombineDemo() throws ExecutionException, InterruptedException {
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            sleep(1);
            return "Hello";
        });

        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            sleep(1);
            return "World";
        });
        // 合并两个独立任务的结果
        CompletableFuture<String> combined = future1.thenCombine(future2, (result1, result2) -> {
            sleep(1);
            return result1 + " " + result2;
        });

        System.out.println("合并结果: " + combined.get());
    }

    private static void allOfDemo() throws ExecutionException, InterruptedException {
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            sleep(2);
            return "任务1完成";
        });

        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            sleep(1);
            return "任务2完成";
        });

        CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> {
            sleep(3);
            return "任务3完成";
        });

        long start = System.currentTimeMillis();
        // 等待所有任务完成继续
        CompletableFuture.allOf(future1, future2, future3).join();
        long end = System.currentTimeMillis();

        System.out.println("所有任务完成，耗时: " + (end - start) + "ms");
        System.out.println(future1.get());
        System.out.println(future2.get());
        System.out.println(future3.get());
    }

    private static void anyOfDemo() throws ExecutionException, InterruptedException {
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            sleep(3);
            return "任务1完成";
        });

        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            sleep(1);
            return "任务2完成";
        });

        CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> {
            sleep(2);
            return "任务3完成";
        });

        long start = System.currentTimeMillis();
        // 任一任务完成即继续
        Object result = CompletableFuture.anyOf(future1, future2, future3).join();
        long end = System.currentTimeMillis();

        System.out.println("最快任务完成，耗时: " + (end - start) + "ms");
        System.out.println("结果: " + result);
    }

    private static void exceptionHandlingDemo() throws ExecutionException, InterruptedException {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            sleep(1);
            if (true) {
                throw new RuntimeException("模拟异常");
            }
            return "正常结果";
        }).exceptionally(ex -> {
            // 异常处理
            System.out.println("捕获异常: " + ex.getMessage());
            return "默认返回值";
        });

        System.out.println("结果: " + future.get());
    }

    private static void chainCallDemo() throws ExecutionException, InterruptedException {
        // 链式调用执行
        CompletableFuture.supplyAsync(() -> {
            sleep(1);
            return "Hello";
        }).thenApply(result -> {
            sleep(1);
            return result + " World";
        }).thenApply(result -> {
            sleep(1);
            return result.toUpperCase();
        }).thenAccept(result -> {
            System.out.println("最终结果: " + result);
        }).get();
    }

    private static void sleep(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
