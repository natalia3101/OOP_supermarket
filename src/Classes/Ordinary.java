package Classes;

// обычный клиент - подтип клиента
public class Ordinary extends Actor {

    public Ordinary(String name) {
        super(name);
    }
    // получаем имя клиента
    @Override
    public String getName() {
        return super.name;
    }

    // дальше все методы из интерфейса iactorbehavior
    @Override
    public boolean makeOrder() {
        return super.makeOrder;
    }
 

    @Override
    public boolean takeOrder() {
        return super.makeOrder;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
       super.makeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean pickUpOrder) {
       super.takeOrder = pickUpOrder;   
    }

    @Override
    public Actor getActor() {
        return this;
    }

      // дальше методы из интерфейса ireturnorder
    @Override
    public void setReturnOrder(boolean returnOrder) {
        super.returnOrder = returnOrder;
    }

    @Override
    public void setTakeMoney(boolean takeMoney) {
        super.takeMoney = takeMoney;
    }

    @Override
    public boolean returnOrder() {
        return super.returnOrder;
    }

    @Override
    public boolean takeMoney() {
        return super.takeMoney;
    }

}
