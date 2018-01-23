package magaz;

import magaz.sport_goods.Boots;
import magaz.sport_goods.Dress;
import magaz.sport_goods.Info;
public class MagazRunner {


    public static void main(String[] args) {

        Shop shop=new Shop();


        MostCity mostCity=new MostCity();

        shop.setName("Bootic");
        Info info=new Info();
        info.setAdress("lol");
        Boots boots=new Boots(15,"Nike",20);
        boots.setInfo(info);
        Dress dress=new Dress();
        shop.setSportBoots(boots);
        shop.setDress(dress);
     //   System.out.println(shop.getSportBoots().getPrice());

        mostCity.addShopToShopMass(shop);

        Shop shop1=new Shop();
        shop1.setName("good shop");

        mostCity.addShopToShopMass(shop1);
        // mostCity.showAllShops();
        mostCity.showOneShop(shop1);
    }
}


