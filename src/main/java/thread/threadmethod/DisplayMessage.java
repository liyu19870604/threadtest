package thread.threadmethod;

/**
 * @author liyu
 * @Date2019/3/12 上午11:52
 **/
public class DisplayMessage implements Runnable {
    private String message;

    public DisplayMessage(String message){
        this.message = message;
    }

    public void run() {
        while (true){
            System.out.println(message);
        }

    }
}
