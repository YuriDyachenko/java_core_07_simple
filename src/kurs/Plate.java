package kurs;

public class Plate {
    private int amount;

    public int getAmount() {
        return amount;
    }

    //уменьшить количество еды
    public void decrease(int amount) {
        if (amount <= 0) {
            System.out.printf("Тарелка: неправильное значение для уменьшения = %d\n", amount);
            return;
        }
        if (amount > this.amount) {
            System.out.printf("Тарелка: слишком большое значение для уменьшения = %d\n", amount);
            return;
        }
        this.amount -= amount;
        System.out.printf("Тарелка: количество еды уменьшается на %d\n", amount);
    }

    //увеличить количества еды
    public void increase(int amount) {
        if (amount <= 0) {
            System.out.printf("Тарелка: неправильное значение для увеличения = %d\n", amount);
            return;
        }
        this.amount += amount;
        System.out.printf("Тарелка: количество еды увеличивается на %d\n", amount);
    }

    //печать
    public void print() {
        System.out.printf("Тарелка: количество еды = %d\n", amount);
    }
}
