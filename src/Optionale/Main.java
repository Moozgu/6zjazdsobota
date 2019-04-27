package Optionale;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String name = null;
        Optional<String> nameOptional = Optional.ofNullable(name);

        if (nameOptional.isPresent()) {
            System.out.println("Fuck yeah " + nameOptional.get());
        }else{
            System.out.println("Fuck");
        }
    }
}
