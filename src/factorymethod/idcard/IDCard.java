package factorymethod.idcard;


import factorymethod.framework.*;


/**
 * Created by takeshi on 2016/10/16.
 */
public class IDCard extends Product {

    private String owner;

    IDCard(String owner) {
        System.out.println(owner + "のカードを作ります。");
        this.owner = owner;
    }

    public void use() {
        System.out.println(owner + "のカードを使います。" );
    }

    public String getOwner() {
        return owner;
    }

}
