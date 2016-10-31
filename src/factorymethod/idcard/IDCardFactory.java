package factorymethod.idcard;

import factorymethod.framework.*;
import java.util.*;

/**
 * Created by takeshi on 2016/10/16.
 */
public class IDCardFactory extends Factory {
    private List owners = new ArrayList();

    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }

    public List getOwners() {
        return owners;
    }
}
