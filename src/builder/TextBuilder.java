package builder;

import java.util.Arrays;

/**
 * Created by takeshi on 2016/11/01.
 */
public class TextBuilder extends Builder {
    private StringBuffer buffer = new StringBuffer();
    public void makeTitle(String title) {
        buffer.append("==================\n");
        buffer.append("『" + title + "』\n");
        buffer.append("\n");
    }
    
    public void makeString(String str) {
        buffer.append('■' + str + "\n");
        buffer.append("\n");
    }
    
    public void makeItems(String[] items) {
        Arrays.stream(items).forEach(item -> buffer.append("   ," + item + "\n"));

        buffer.append("\n");
    }

    public void close() {
        buffer.append("================== ");
    }

    public String getResult() {
        return buffer.toString();
    }
}
