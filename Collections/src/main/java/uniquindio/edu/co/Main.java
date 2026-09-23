package uniquindio.edu.co;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Set<String> nombres = new HashSet<>();
        nombres.add("Jose");
        nombres.add("David");
        nombres.add("Jose");

        Iterator<String> it = nombres.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}