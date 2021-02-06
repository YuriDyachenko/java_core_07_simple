package kurs;

public class Cat {
    private final String name;
    private final int appetite;
    private boolean full;


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        full = false;
    }

    //кот говорит
    public void says(String msg) {
        System.out.printf("%s: %s\n", name, msg);
    }

    //кот кушает
    public void eats(Plate plate) {
        if (full) {
            says("я уже сыт, не хочу");
            return;
        }
        int plateAmount = plate.getAmount();
        if (plateAmount == 0) {
            says("я не идиот, тут же пусто");
            return;
        }
        if (plateAmount < appetite) {
            says(String.format("для меня %d слишком мало, надо %d", plateAmount, appetite));
            return;
        }
        plate.decrease(appetite);
        full = true;
        says(String.format("покушал %d", appetite));
    }

    //печать
    public void print() {
        says(String.format("аппетит %d - %s", appetite, full ? "сыт" : "голоден"));
    }
}
