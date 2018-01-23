package magaz;

import magaz.sport_goods.Boots;
import magaz.sport_goods.Dress;

/**
 * Created by java on 19.01.2018.
 */
public class Shop {
    private String name;
private Boots sportBoots;
    private Dress dress;
    public Shop(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Shop(Boots sportBoots, Dress dress) {
        this.sportBoots = sportBoots;
        this.dress = dress;
    }

    public Boots getSportBoots() {
        return sportBoots;
    }

    public void setSportBoots(Boots sportBoots) {
        this.sportBoots = sportBoots;
    }

    public Dress getDress() {
        return dress;
    }

    public void setDress(Dress dress) {
        this.dress = dress;
    }
}

