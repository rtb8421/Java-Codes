package Lab4pt2;
    class Time {
        private int hours;
        private int minutes;
        private int seconds;

        // Constructor with all parameters
        public Time(int hours, int minutes, int seconds) {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
        }

        // Constructor with hours and minutes
        public Time(int hours, int minutes) {
            this(hours, minutes, 0);
        }

        // Constructor with hours
        public Time(int hours) {
            this(hours, 0, 0);
        }

        // Display time in HH:MM:SS format
        public void display() {
            System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);
        }
    }

    public class TimeFormats {
        public static void main(String[] args) {
            Time time1 = new Time(9, 30, 45);
            Time time2 = new Time(14, 15);
            Time time3 = new Time(21);

            System.out.print("Time 1: ");
            time1.display();

            System.out.print("Time 2: ");
            time2.display();

            System.out.print("Time 3: ");
            time3.display();
        }
    }
