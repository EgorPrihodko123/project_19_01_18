package magaz.sport_goods;

/**
 * Created by java on 19.01.2018.
 */
public class Boots {
    private int size;
    private String brend;
    private int price;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    private int count;


    public Boots(){
    }

    public Boots(int size, String brend) {
        this.size = size;
        this.brend = brend;
    }

    public Boots(int size, String brend, int price) {
        this.size = size;
        this.brend = brend;
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

