package prototype;

import prototype.framework.Product;

/**
 * Created by takeshi on 2016/10/16.
 */
public class UnderLinePen implements Product {

    private char ulchar;

    public UnderLinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    public void use(String s) {
        int length = s.getBytes().length;
        System.out.println("\"" + s + "\"");
        System.out.print(" ");
        for(int i = 0; i < length; i++) {
            System.out.print(ulchar);
        }
        System.out.println("");
    }

    public Product createClone() {
        Product p = null;
        try {
            p = (Product)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }

}
