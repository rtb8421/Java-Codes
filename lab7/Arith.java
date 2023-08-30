package lab7;

    public class Arith {
        private int rp, ip;

        public void arith() {
            rp = ip = 0;
        }

        public void arith(int intrp, int intip) {
            this.rp = intrp;
            this.ip = intip;
        }

        public void add(Arith a1, Arith a2) {
            this.rp = a1.rp + a2.rp;
            this.ip = a1.ip + a2.ip;
        }

        public void sub(Arith a1, Arith a2) {
            this.rp = a1.rp - a2.rp;
            this.ip = a1.ip - a2.ip;
        }

        public void display() {
            System.out.println("Real Part: " + rp);
            System.out.println("Imaginary Part: " + ip);
        }
        public static void main(String[] args) {
            Arith a1 = new Arith();
            Arith a2 = new Arith();
            Arith a3 = new Arith();

            a1.arith(5, 3);
            a2.arith(2, 1);

            a3.add(a1, a2);
            System.out.println("Addition:");
            a3.display();

            a3.sub(a1, a2);
            System.out.println("Subtraction:");
            a3.display();

        }
    }


