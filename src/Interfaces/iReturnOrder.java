package Interfaces;
import Classes.Actor;

public interface iReturnOrder {
        // Заявка на возврат товара 
        void setReturnOrder(boolean returnOrder);
        // заявка на получение денег обратно
        void setTakeMoney(boolean takeMoney);
        // возврат заказа
        boolean returnOrder();
        // получение денег
        boolean takeMoney();
        Actor getActor(); 
}
