package templatemethod;

/**
 * Created by takeshi on 2016/10/09.
 */
public class CharDisplay extends AbstractDisplay {

    private char ch;

    public CharDisplay(char c) {
        this.ch = c;
    }

    public void open() {
        System.out.print("<<<");
    }

    public void print() {
        System.out.print(ch);
    }

    public void close() {
        System.out.println(">>>");
    }
}
