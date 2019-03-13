package thread;

/**
 * @author liyu
 * @Date2019/3/12 上午11:05
 *
 **/
public class ThreadDemo extends Thread {
    private  Thread t;
    private String threadName;

    String a = "";

    ThreadDemo(String name){
        threadName = name;
        System.out.println("creating "+threadName);
    }

    public void run(){
        System.out.println("running "+threadName);
        try {
            for(int i=4;i>0 ;i--){
                System.out.println("Thread: "+threadName+","+i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Thread "+threadName +" interrupted");
        }
        System.out.println("Thread " +  threadName + " exiting.");
    }

    public void start(){
        System.out.println("starting "+threadName);
        if(t == null){
            t = new Thread(this,threadName);
            t.start();
        }
    }
}

class TestThread {
    public static void main(String[]args){
       ThreadDemo t1 = new ThreadDemo("Thread-1");
       t1.start();

       ThreadDemo t2 = new ThreadDemo("Thread-2");
       t2.start();
    }
}
