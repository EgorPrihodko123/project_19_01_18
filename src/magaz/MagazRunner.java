package magaz;

import magaz.sport_goods.Boots;
import magaz.sport_goods.Dress;

public class MagazRunner {

    private static   Boots boots;
    private static  Boots bootsBig2;
    private static   Dress dress;
    private static Shop shop;

    public static void main(String[] args) {
       // Shop shop = new Shop();
       // shop=new Shop();

        Boots anotherBoots=new Boots();

        initGoods(boots,dress);
      //  System.out.println(boots.getBrend());
        addGoodsToTheShop(shop, boots, dress);
     //   System.out.println(shop.getSportBoots().getBrend());
      //  System.out.println(shop.getSportBoots().getPrice());
      //  System.out.println(bootsBig2.getPrice());
      //  System.out.println(shop.getSportBoots().getBrend()+" , size is "+ shop.getSportBoots().getSize());
      //  System.out.println(shop.getSportBoots().getBrend()+" , dress brend is "+ shop.getDress().getBrend());
    }
     private static  void initGoods(Boots b, Dress dr){
         b.setBrend("Carvalol");
         b.setPrice(100);
         boots = new Boots(23,"Nike",100);
        // bootsBig2 = new Boots(15,"AlexBoots",50);
        dress = new Dress(15,"Bershka",95);
     }
    private static void addGoodsToTheShop(Shop shop, Boots boots, Dress dress) {
        if (shop != null) {
            if (boots != null && dress != null) {
                shop.setDress(dress);
                shop.setSportBoots(boots);
                System.out.println(shop.getSportBoots().getBrend());
            }
        }
    }
}

