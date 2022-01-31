package company.chapter3.pack;

import java.util.HashSet;


public class SplitTrim {

    public static void main() {
        HashSet<String> col = new HashSet();
        String s = "арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель";
        for (String fruits : s.split(",")) {
            col.add(fruits.trim());
        }
        for (String b : col) {
            System.out.println(b);
        }
    }
}
