package Classes;

import java.util.ArrayList;
import java.util.List;

import Interfaces.iMarketBehavior;
import Interfaces.iActorBehaviour;
import Interfaces.iQueueBehaviour;
import Interfaces.iReturnOrder;

public class Market implements iMarketBehavior, iQueueBehaviour{
    
    private List<iActorBehaviour> queue;
// создание очереди клиентов
    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
    }
// клиент входит в магазин
    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        System.out.println(actor.getActor().getName() + " came to the shop");
        takeInQueue(actor);
    }
// метод добавления клиента в очерель
    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName()+" is added to the queue");
    }
// клиент уходит из магазина
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for(Actor actor:actors)
        {
            System.out.println(actor.getName()+" left the shop");
            queue.remove(actor);
        }  
    }


    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }

// клиент получил заказ
    @Override
    public void giveOrder() {
        for(iActorBehaviour actor: queue)
        {
            if(actor.makeOrder())
            {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName()+" got the order");
            }
        }
        
    }
    // клиент сделал заказ
    @Override
    public void takeOrder() {
        for(iActorBehaviour actor: queue)
        {
            if(!actor.makeOrder())
            {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName()+" made an order");

            }
        }
        
    }
// клиент выходит из очереди
    @Override
    public void releaseFromQueue() {
       List<Actor> releaseActors = new ArrayList<>();
       for(iActorBehaviour actor:queue)
       {
        if(actor.takeOrder())
        {
            releaseActors.add(actor.getActor());
            System.out.println(actor.getActor().getName()+" left the queue");
        }

       }
    releaseFromMarket(releaseActors);
    }


    
}
