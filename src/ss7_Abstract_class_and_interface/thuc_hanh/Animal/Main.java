package ss7_Abstract_class_and_interface.thuc_hanh.Animal;
import ss7_Abstract_class_and_interface.thuc_hanh.Animal.Animal;
import ss7_Abstract_class_and_interface.thuc_hanh.Animal.Tiger;
import ss7_Abstract_class_and_interface.thuc_hanh.Animal.Chicken;
import ss7_Abstract_class_and_interface.thuc_hanh.Fruit.edible;
import ss7_Abstract_class_and_interface.thuc_hanh.Fruit.Fruit;
import ss7_Abstract_class_and_interface.thuc_hanh.Fruit.Apple;
import ss7_Abstract_class_and_interface.thuc_hanh.Fruit.Orange;

public class Main {
    public static void main(String[] args) {
        Animal[] animal= new Animal[2];
        animal[0]=new Tiger();
        animal[1]=new Chicken();
        for(Animal animal1:animal){
            System.out.println(animal1.makeSound());

            if (animal1 instanceof Chicken) {
                edible edibler = (Chicken) animal1;
                System.out.println(edibler.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
