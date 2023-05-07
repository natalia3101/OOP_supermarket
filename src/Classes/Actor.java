package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;
// абстрактный класс, тк имеет различные прототипы, наследюшие
// определенные признаки от своего родителя
public abstract class Actor implements iActorBehaviour, iReturnOrder {
// каждый клиент имеет имя
    protected String name;
    // полученныйзаказ
    protected boolean takeOrder;
    // сделанный заказ
    protected boolean makeOrder;
    // возвращенный заказ
    protected boolean returnOrder;
    // полученные деньги
    protected boolean takeMoney;

    public Actor(String name) {
        this.name = name;
    }

    public abstract String getName();

    
}
