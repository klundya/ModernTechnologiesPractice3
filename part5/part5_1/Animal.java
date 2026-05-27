package part5.part5_1;

public abstract class Animal {
    protected String name;
    protected int age;
    protected double weight;
    protected int energyLevel;

    protected Animal(String name, int age, double weight, int energyLevel) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.energyLevel = energyLevel;
    }

    public void eat(int calories) {
        // TODO: увеличьте energyLevel, но не выше 100.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        if (energyLevel + (int) (calories*0.3) >= 100){
            energyLevel = 100;
        } else {
            energyLevel += (int) (calories*0.3);
        }
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public void sleep(int hours) {
        // TODO: увеличьте energyLevel в зависимости от часов, но не выше 100.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        if (energyLevel + hours*10 >= 100){
            energyLevel = 100;
        } else {
            energyLevel += hours*10;
        }
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public abstract void makeSound();

    public int getEnergyLevel() {
        return energyLevel;
    }

    public String getName() {
        return name;
    }
}