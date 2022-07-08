import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author qiyu
 * @date 2020-09-07
 */
public class FutureTaskDemo {

    private static AtomicInteger count = new AtomicInteger(10);

    public static void main(String[] args) throws ExecutionException, InterruptedException {
    //    1,2,3,4,5
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(() ->{
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
                System.out.println(Thread.currentThread().getName());
            });
            thread.setName(i + "");
            threads.add(thread);
        }
        for (Thread thread : threads) {
            thread.start();
            thread.join();
            System.out.println(Thread.currentThread().getName());
        }
    }
}
