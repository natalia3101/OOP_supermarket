package Interfaces;

import Classes.Actor;

public interface iActorBehaviour {
    // заявка на заказ
    void setMakeOrder(boolean makeOrder);
    // заявка на получение готового заказа
    void setTakeOrder(boolean pickUpOrder);
    // сделан ли заказ
    boolean makeOrder();
    // получен ли заказ
    boolean takeOrder();
    // возврат имени клиента, выполняющего действие
    Actor getActor();
}