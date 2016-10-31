package builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * Created by takeshi on 2016/11/01.
 */
public class HTMLBuilder extends Builder{
    private String filename;
    private PrintWriter writer;
    public void makeTitle(String title) {
        filename = title + ".html";
        try {
            writer = new PrintWriter(new FileWriter(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("<html><head><title>" + title + "</title></head><body>");
        writer.println("<h1>" + title + "</h1>");
    }

    public void makeString(String str) {
        writer.println("<p>" + str + "</p>");
    }

    public void makeItems(String[] items) {
        writer.println("<ul>");
        Arrays.stream(items).forEach(item -> writer.println("<li>" + item + "</li>"));

        writer.println("</ul>");
    }

    public void close() {
        writer.println("</body></html>");
        writer.close();
    }

    public String getResult() {
        return filename;
    }
}
