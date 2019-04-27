package Lambda.Examples;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Action action = (s,x) -> {
            System.out.println(s);
            System.out.println(x+x);
        };
        //Lambda u gory, brak lambdy na dole
        Action action1 = new Action() {
            @Override
            public void doAction(String s, int x) {
                System.out.println(s);
                System.out.println(x);
            }
        };
        action.doAction("Heeeeeey makarena",4);
        action1.doAction("Nie ma makareny",0);


        List<String> names = Arrays.asList("Damian","Lukasz");
        names.forEach(s -> System.out.println(s));
    }
}
