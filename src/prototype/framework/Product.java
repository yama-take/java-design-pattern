package prototype.framework;

/**
 * Created by takeshi on 2016/10/16.
 */
public interface Product extends Cloneable {
    void use(String s);

    Product createClone();
}
