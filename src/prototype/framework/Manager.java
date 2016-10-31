package prototype.framework;

import java.util.HashMap;

/**
 * Created by takeshi on 2016/10/16.
 */
public class Manager {

    private HashMap showcase = new HashMap();

    public void retister(String name, Product proto) {
        showcase.put(name, proto);
    }

    public Product create(String protoname) {
        Product p  = (Product)showcase.get(protoname);
        return p.createClone();
    }
}
