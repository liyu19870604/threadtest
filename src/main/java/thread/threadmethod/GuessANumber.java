package thread.threadmethod;

/**
 * @author liyu
 * @Date2019/3/12 上午11:45
 **/
public class GuessANumber extends Thread {
    private  int number;
    public GuessANumber(int number){
        this.number = number;
    }

    public void run(){
        int counter = 0;
        int guess = 0;
        do{
            guess = (int)(Math.random()*1000+1);
            System.out.println(this.getName() +" guesses "+guess);
            counter++;
        } while (guess != number);
        System.out.println("** corret!" +this.getName()+" in "+counter+"guesses.**");
    }
}
