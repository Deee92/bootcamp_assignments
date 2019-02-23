/**
 * Question 7: Submit List of tasks to ExecutorService and wait for the completion
 * of all the tasks
 */

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class TaskListDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Thread starting: " + Thread.currentThread().getName());
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        try {
            
            List<Callable<Integer>> callableList = new ArrayList<>();
            callableList.add(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    Thread.sleep(1000L);
                    return 1;
                }
            });
            callableList.add(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    Thread.sleep(1000L);
                    return 2;
                }
            });
            callableList.add(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    Thread.sleep(2000L);
                    return 3;
                }
            });
            callableList.add(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    Thread.sleep(2000L);
                    return 4;
                }
            });
            
            List<Future<Integer>> integerFutureList = executorService.invokeAll(callableList);
            
            for (Future<Integer> f : integerFutureList) {
                if (f.isDone()) {
                    try {
                        System.out.println("Value in Future object: " + f.get().toString());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    }
                }
            }
        } finally {
            executorService.shutdown();
        }
        executorService.awaitTermination(2000L, TimeUnit.SECONDS);
        System.out.println("Thread exiting: " + Thread.currentThread().getName());
    }
}
