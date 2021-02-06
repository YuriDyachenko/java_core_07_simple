package kurs;

public class Main {

    public static void main(String[] args) {
        Cat[] cats = createCats();
        printCats(cats);

        Plate plate = new Plate(10);
        plate.print();
        plate.increase(20);
        plate.print();

        feedCats(cats, plate);
        printCats(cats);
    }

    public static Cat[] createCats() {
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Барсик", 12);
        cats[1] = new Cat("Горбачев", 15);
        cats[2] = new Cat("Мишка", 10);
        cats[3] = new Cat("Непоседа", 8);
        cats[4] = new Cat("Ананасик", 9);
        return cats;
    }

    public static void printCats(Cat[] cats) {
        System.out.println("----- состояние котов -----");
        for (Cat cat : cats) {
            cat.print();
        }
    }

    public static void feedCats(Cat[] cats, Plate plate) {
        System.out.println("----- кормим всех котов -----");
        for (Cat cat : cats) {
            cat.eats(plate);
        }
    }
}
