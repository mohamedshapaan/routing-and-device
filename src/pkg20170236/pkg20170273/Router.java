
package pkg20170236.pkg20170273;

import static java.lang.Thread.sleep;

public class Router {

    public boolean[] devicelist;
    public int numberofdevice;
    public Semaphore enter;
    public int nOccupied;


    Router(int x) {
        numberofdevice = x;
        enter = new Semaphore(numberofdevice);
        devicelist = new boolean[numberofdevice];
    }


    //methods
    public synchronized int occupy(Device ob) throws Exception {

        for (int i = 0; i < numberofdevice; i++) {
            if (devicelist[i] == false) { /* means It's available for being occupied */
                nOccupied++;
                ob.assdevice = i+1;
                System.out.println("Router " + ob.assdevice + ": " + ob.getName() + " occupied");
                devicelist[i] = true;
                sleep(1000);
                break;
            }
        }
        return ob.assdevice;
    }
    public String perform() throws InterruptedException {
        String val = " performs online activity";
        sleep(1000);
        return val;
    }

    public synchronized String logout(Device ob) {

        { /* means It's available for being occupied */
            nOccupied--;
            devicelist[ob.assdevice-1] = false;
        }
        notify();
        return " logged out";
    }

}
