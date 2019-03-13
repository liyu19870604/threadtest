package thread.threadmethod;

/**
 * @author liyu
 * @Date2019/3/12 下午1:53
 **/
public class ThreadClassDemo {

    public static void main(String[] args) {
//        Runnable hello = new DisplayMessage("Hello");
//        Thread thread1 = new Thread(hello);
//        thread1.setDaemon(true);//将该线程标记为守护线程或用户线程。调试时可以设置为false，那么这个程序是个死循环，没有退出条件。设置为true，即可主线程结束，test线程也结束。
//        thread1.setName("hello");
//        System.out.println("Starting hello thread...");
//        thread1.start();
        /**
         * 用户线程和守护线程的区别：
         * 1. 主线程结束后用户线程还会继续运行,JVM存活；主线程结束后守护线程和JVM的状态又下面第2条确定。
         * 2.如果没有用户线程，都是守护线程，那么JVM结束（随之而来的是所有的一切烟消云散，包括所有的守护线程）。
         */

//        Runnable bye = new DisplayMessage("Goodbye");
//        Thread thread2 = new Thread(bye);
//        thread2.setPriority(Thread.MAX_PRIORITY);//Java 线程的优先级是一个整数，其取值范围是 1 （Thread.MIN_PRIORITY ） - 10 （Thread.MAX_PRIORITY ）。
//        thread2.setDaemon(true);
//        System.out.println("Starting goodbye thread...");
//        thread2.start();

//
//        System.out.println("Starting thread3...");
//        Thread thread3 = new GuessANumber(27);
//        thread3.start();
//        try {
//            thread3.join();//等待该线程终止后在执行后面的
//        }catch(InterruptedException e) {
//            System.out.println("Thread interrupted.");
//        }
//        System.out.println("Starting thread4...");
//        Thread thread4 = new GuessANumber(75);
//
//        thread4.start();
//        System.out.println("main() is ending...");
    }
}
