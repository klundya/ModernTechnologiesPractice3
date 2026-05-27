package part5.part5_1;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Zoo {
    private final List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal a) {
        animals.add(a);
    }

    public void feedAll() {
        for (Animal a : animals) {
            a.eat(200);
        }
    }

    public void makeNoise() {
        for (Animal a : animals) {
            a.makeSound();
        }
    }

    public List<Animal> getHungryAnimals() {
        // TODO: верните животных с energyLevel < 30.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        List<Animal> hungryAnimals = new ArrayList<>();
        for (Animal a : animals) {
            if (a.energyLevel < 30){
                hungryAnimals.add(a);
            }
        }
        return hungryAnimals;
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public Optional<Animal> findAnimal(String name) {
        // TODO: найдите животное по имени (без учета регистра).
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        for (Animal a : animals){
            if (a.name.equalsIgnoreCase(name)){
                return Optional.of(a);
            }
        }
        return Optional.empty();
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }
}