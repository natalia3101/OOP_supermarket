import Classes.CommercialAction;
import Classes.Market;
import Classes.Ordinary;
import Classes.Special;
import Interfaces.iActorBehaviour;

public class App {
    public static void main(String[] args) throws Exception {
        // Market market = new Market();
        // Ordinary client1 = new Ordinary("Gil");
        // Ordinary client2 = new Ordinary("Joel");
        // Special client3 = new Special("Nat", 1);
        // market.acceptToMarket(client1);
        // market.acceptToMarket(client2);
        // market.acceptToMarket(client3);
        // market.update();

        Market market = new Market();
        iActorBehaviour item1 = new Ordinary("Nat");
        iActorBehaviour item2 = new Special("Mama", 1);
        iActorBehaviour item3 = new Ordinary("Dima");
        iActorBehaviour item4 = new Special("Papa", 2);
        iActorBehaviour item5 = new CommercialAction("Lena", "2 jogurts for 1");
        
 
        market.acceptToMarket(item1);
        market.acceptToMarket(item2);
        market.acceptToMarket(item3);
        market.acceptToMarket(item4);
        market.acceptToMarket(item5);
        market.update();

    }
}
