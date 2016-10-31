//import factorymethod.idcard.IDCardFactory;
//import factorymethod.framework.Factory;
//import factorymethod.framework.Product;
import builder.Director;
import builder.HTMLBuilder;
import builder.TextBuilder;
import prototype.*;
import prototype.framework.*;

/**
 * Created by takeshi on 2016/10/09.
 */
public class Main {

    public static void main(String[] args) {
        // adapter entry point.
        // Print p = new PrintBanner("Hello");
        // p.printWeak();
        // p.printStrong();

        // template method entry point.
//        AbstractDisplay ad1 = new CharDisplay('H');
//
//        AbstractDisplay ad2 = new StringDisplay("Hello World");
//
//        ad1.display();
//        ad2.display();
//

        // Factroy Method entry point.
//        Factory factory = new IDCardFactory();
//        Product card1 = factory.create("test1");
//        Product card2 = factory.create("test2");
//        Product card3 = factory.create("test3");
//
//        card1.use();
//        card2.use();
//        card3.use();


        // Prototype entry point.
//        Manager manager = new Manager();
//        UnderLinePen upen = new UnderLinePen('~');
//
//        MessageBox mbox = new MessageBox('*');
//        MessageBox sbox = new MessageBox('/');
//
//        manager.retister("strong message", upen);
//        manager.retister("warning box", mbox);
//        manager.retister("slash box", sbox);
//
//        Product p1 = manager.create("strong message");
//        p1.use("Hello, world.");
//        Product p2 = manager.create("warning box");
//        p2.use("Hello, world.");
//        Product p3 = manager.create("slash box");
//        p3.use("Hello, world.");


        // Builder entry point.
        if (args.length != 1) {
            System.exit(0);
        }

        if (args[0].equals("plain")) {
            TextBuilder textbuilder = new TextBuilder();
            Director director = new Director(textbuilder);
            director.constract();
            String result = textbuilder.getResult();
            System.out.println(result);
        } else if (args[0].equals("html")) {
            HTMLBuilder htmlBuilder = new HTMLBuilder();
            Director director = new Director(htmlBuilder);
            director.constract();
            String result = htmlBuilder.getResult();
            System.out.println(result);
        } else {
            System.exit(0);
        }
    }


}
