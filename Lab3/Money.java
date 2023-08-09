package Lab3;

public class Money {
        public int rupees;
        public int paisa;

        public Money(int rupees, int paisa) {
            this.rupees = rupees;
            if (paisa >= 0 && paisa < 100) {
                this.paisa = paisa;
            } else {
                return;
            }
        }
        public Money(int rupees) {
            this(rupees, 0);
        }
        public Money add(Money other) {
            int newRupees = this.rupees + other.rupees;
            int newPaisa = this.paisa + other.paisa;

            if (newPaisa >= 100) {
                newRupees++;
                newPaisa -= 100;
            }

            return new Money(newRupees, newPaisa);
        }
        public Money subtract(Money other) {
            int newRupees = this.rupees - other.rupees;
            int newPaisa = this.paisa - other.paisa;

            if (newPaisa < 0) {
                newRupees--;
                newPaisa += 100;
            }

            return new Money(newRupees, newPaisa);
        }
        public void displayMoney() {
            System.out.println("Rs " + rupees + " and " + paisa + " paisa");
        }

        public static void main(String[] args) {
            Money money1 = new Money(50, 75);
            Money money2 = new Money(30, 25);

            System.out.println("Money 1 and Money 2:");
            money1.displayMoney();
            money2.displayMoney();

            Money sum = money1.add(money2);
            System.out.println("Addition Result:");
            sum.displayMoney();

            Money difference = money1.subtract(money2);
            System.out.println("Subtraction Result:");
            difference.displayMoney();
        }
    }

