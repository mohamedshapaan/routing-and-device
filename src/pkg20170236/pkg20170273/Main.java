package pkg20170236.pkg20170273;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws Exception 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("enter Number of Routers");
        int nRouters = input.nextInt();
        Router router = new Router(nRouters);
        System.out.println("enter Number of Devices");
        int numperofdevice = input.nextInt();
        Device[] device = new Device[numperofdevice];

        System.out.println("What is the Device's Name?");
        input=new Scanner(System.in);
        for (int i = 0; i < numperofdevice; i++) {
            String a = input.nextLine();
            device[i] = new Device(a, router);
        }
        for (int i = 0; i < numperofdevice; i++) {
            Thread.sleep(1000);
            device[i].start();
        }

    }
}
