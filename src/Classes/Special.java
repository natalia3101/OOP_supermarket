package Classes;

// вип клиент - подтип клиента
public class Special extends Actor{
// имеет уникальный вип номер
    private int idVIP;

    public Special(String name, int idVIP){
        super(name);
        this.idVIP = idVIP;
    }

    // получаем имя клиента
    @Override
    public String getName() {
        return super.name;
    }
// получаем номер клиента
    public int getIdVIP() {
        return idVIP;
    }
// дальше все методы из интерфейса iactorbehavior
    @Override
    public boolean makeOrder() {
        return super.makeOrder;
    }
    
    @Override
    public boolean takeOrder() {
        return super.takeOrder;
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
