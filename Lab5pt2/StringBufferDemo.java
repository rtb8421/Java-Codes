package Lab5pt2;

    public class StringBufferDemo {
        public static void main(String[] args) {
            StringBuffer stringBuffer = new StringBuffer("Rohan");

            stringBuffer.append(" Patel");

            System.out.println("StringBuffer content: " + stringBuffer);

            int capacity = stringBuffer.capacity();
            System.out.println("StringBuffer capacity: " + capacity);

            int length = stringBuffer.length();
            System.out.println("StringBuffer length: " + length);
        }
    }

