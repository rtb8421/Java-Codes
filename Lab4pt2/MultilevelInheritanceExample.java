package Lab4pt2;
    class Animal {
        String species;

        Animal(String species) {
            this.species = species;
        }

        void display() {
            System.out.println("Species: " + species);
        }
    }

    class Mammal extends Animal {
        String type;

        Mammal(String species, String type) {
            super(species);
            this.type = type;
        }

        @Override
        void display() {
            super.display();
            System.out.println("Type: " + type);
        }
    }

    class Dog extends Mammal {
        String breed;

        Dog(String species, String type, String breed) {
            super(species, type);
            this.breed = breed;
        }

        @Override
        void display() {
            super.display();
            System.out.println("Breed: " + breed);
        }
    }

    public class MultilevelInheritanceExample {
        public static void main(String[] args) {
            Dog myDog = new Dog("Canine", "Domestic", "Labrador");
            myDog.display();
        }
    }
