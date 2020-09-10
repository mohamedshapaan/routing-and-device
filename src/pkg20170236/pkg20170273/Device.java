package pkg20170236.pkg20170273;
public class Device extends Thread {
    public static Router router;
    public boolean enter = false;
    public int assdevice ;
    Device(String deviceName, Router router1) {
        super(deviceName);
       router = router1;
    }
    public void run() {
        router.enter.coc(this); 
        try {
            assdevice=router.occupy(this);
        }
        catch (InterruptedException e) {} catch (Exception e) {
        }
        try {
            System.out.println("Connection " + assdevice + "=> " + this.getName() + router.perform());
        } catch (InterruptedException e) {

        }

        System.out.println("Connection " +assdevice + "=> " + this.getName() + router.logout(this));

        router.enter.coc1();
    }

}
