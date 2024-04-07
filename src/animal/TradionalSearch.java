package animal;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TradionalSearch {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("cat", false, true));
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("dolphin", true, false));

        printAnimal(animals,a -> a.canHop());
    }

    private static void printAnimal(List<Animal> animals, Predicate<Animal>checker) {
        for (Animal animal : animals) {
            if (checker.test(animal)) {
                System.out.print(animal+" ");

            }
        }
    }
}
