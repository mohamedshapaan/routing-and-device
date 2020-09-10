package pkg20170236.pkg20170273;

public class Semaphore {
    public static int queue;
    Semaphore(int number)
    {
        queue=number;
    }
    //methods
    public synchronized void coc(Device ob){
        queue--;
        if(queue<0) {
            try {
                System.out.println(ob.getName() + " arrived and wait");
                wait();
            } catch (Exception e) {
            }
        }
        else {
            System.out.println(ob.getName() + " arrived");
        }
    }
    public synchronized void coc1() {
        queue++;
        if (queue <= 0) {
            notify();
        }
    }
}