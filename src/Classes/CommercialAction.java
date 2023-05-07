package Classes;

// клиент, пришедший за товарами по акции - подтип клиента
public class CommercialAction extends Actor{

    // имеет указание на акцию, в которой участвует 
    private String actionName;
    // имеет уникальный номер
    static int idClient = 0;


    public CommercialAction(String name, String actionName){
        super(name);
        this.actionName = actionName;
        idClient++;
    }
  // дальше все методы из интерфейса iactorbehavior
    @Override
    public String getName() {
        return super.name;
    }

    public String getActionName() {
        return actionName;
    }

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
