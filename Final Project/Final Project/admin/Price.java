package admin;

import Interface.NavigationInterface;
import Interface.TakeInputInterface;
import start.StartApplication;
import static start.StartApplication.*;

public class Price extends StoreHouse{
    public static int bp=8;
    public static int cop=17;
    public static int clp=6;

    public Price(NavigationInterface navigationInterface, TakeInputInterface takeInputInterface) {
        super(navigationInterface, takeInputInterface);
    }
    public static void prices(){
        System.out.println("\n\tPrices");
        System.out.println("\nPrice of per "+book+" :"+bp+"$");
        System.out.println("Price of per "+compu+" :"+cop+"$");
        System.out.println("Price of per "+cl+" :"+clp+"$");
    }

}
