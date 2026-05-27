package part5.part5_1;

public abstract class Herbivore extends Animal {
    protected Herbivore(String name, int age, double weight, int energyLevel) {
        super(name, age, weight, energyLevel);
    }

    public void graze() {
        // TODO: +15 к energyLevel (макс 100).
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        if (energyLevel + 15 >= 100){
            energyLevel = 100;
        } else {
            energyLevel += 15;
        }
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }
}