package kurs;

public class Plate {
    private int amount;

    public Plate(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    //именно приватный, чтобы регулировали количество еды только
    //через уменьшить и добавить
    private void setAmount(int amount) {
        this.amount = amount;
        if (this.amount < 0) {
            this.amount = 0;
        }
    }

    //уменьшить количество еды
    public void decrease(int amount) {
        setAmount(this.amount - amount);
        System.out.printf("Тарелка: количество еды уменьшается на %d\n", amount);
    }

    //увеличить количества еды
    public void increase(int amount) {
        setAmount(this.amount + amount);
        System.out.printf("Тарелка: количество еды увеличивается на %d\n", amount);
    }

    //печать
    public void print() {
        System.out.printf("Тарелка: количество еды = %d\n", amount);
    }
}
