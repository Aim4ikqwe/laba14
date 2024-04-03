import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text = "что делаешь 142.254.111.251 как дела";
        Pattern p = Pattern.compile("(([1-9]\\d\\d|2[0-4]\\d|25[0-5]|\\d)\\.){3}([1-9]\\d\\d|2[0-4]\\d|25[0-5]|\\d)");
        Matcher q = p.matcher(text);
        if (q.find()) {
            System.out.println(q.group());
        }
        else {
            System.out.println("Не нашло");
        }
    }
}