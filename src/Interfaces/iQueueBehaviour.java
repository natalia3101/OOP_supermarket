package Interfaces;

// интерфейс поведения очереди
public interface iQueueBehaviour {
    // прием человека в очередь
    void takeInQueue(iActorBehaviour actor);
    // удаление из очереди
    void releaseFromQueue();
    // получение заказала от клиента
    void takeOrder();
    // отдать готовый заказ клиенту
    void giveOrder();
}
