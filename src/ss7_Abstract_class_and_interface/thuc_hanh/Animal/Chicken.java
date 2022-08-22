package ss7_Abstract_class_and_interface.thuc_hanh.Animal;

import ss7_Abstract_class_and_interface.thuc_hanh.Fruit.edible;

public class Chicken extends Animal implements edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck, cluck.";
    }

    @Override
    public String howToEat() {
        return "Could be fried";
    }
}
