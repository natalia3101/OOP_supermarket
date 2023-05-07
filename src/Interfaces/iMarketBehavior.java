package Interfaces;

import java.util.List;
import Classes.Actor;

public interface iMarketBehavior {
    // клиент заходит в магазин
    void acceptToMarket(iActorBehaviour actor);
    // клиент уходит из магазина
    void releaseFromMarket(List<Actor> actors);
    // обновление статуса
    void update();
}
