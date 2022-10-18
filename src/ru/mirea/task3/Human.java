package ru.mirea.task3;

public class Human {
    private String name;
    private int age;
    private double height;
    private double weight;

    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Human(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    public class Head{
        private boolean hair;
        private int quantity;

        public void setHair(boolean hair) {
            this.hair = hair;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public boolean isHair() {
            return hair;
        }

        public int getQuantity() {
            return quantity;
        }

        public Head(boolean hair, int quantity) {
            this.hair = hair;
            this.quantity = quantity;
        }
        public String toString() {
            return "Head{" +
                    "hair=" + hair +
                    ", quantity=" + quantity +
                    '}';
        }

    }
    public class Legs {
        private int quantity;
        private boolean legsMove;

        public int getQuantity() {
            return quantity;
        }

        public boolean isLegsMove() {
            return legsMove;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public void setLegsMove(boolean legsMove) {
            this.legsMove = legsMove;
        }
        public Legs(int quantity, boolean legsMove) {
            this.quantity = quantity;
            this.legsMove = legsMove;
        }
        public String toString() {
            return "Legs{" +
                    "quantity=" + quantity +
                    ", legsMove=" + legsMove +
                    '}';
        }
    }
    public class Hands {
        private int quantity;
        private boolean isThereAnythingInHand;

        public int getQuantity() {
            return quantity;
        }

        public boolean isThereAnythingInHand() {
            return isThereAnythingInHand;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public void setThereAnythingInHand(boolean thereAnythingInHand) {
            isThereAnythingInHand = thereAnythingInHand;
        }

        public Hands(int quantity, boolean isThereAnythingInHand) {
            this.quantity = quantity;
            this.isThereAnythingInHand = isThereAnythingInHand;
        }
        public String toString() {
            return "Hands{" +
                    "quantity=" + quantity +
                    ", isThereAnythingInHand=" + isThereAnythingInHand +
                    '}';
        }
    }
    public class Chest {
        private int quantity;
        private boolean isBreathing;

        public int getQuantity() {
            return quantity;
        }

        public boolean isBreathing() {
            return isBreathing;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public void setBreathing(boolean breathing) {
            isBreathing = breathing;
        }

        public Chest(int quantity, boolean isBreathing) {
            this.quantity = quantity;
            this.isBreathing = isBreathing;
        }
        public String toString() {
            return "Chest{" +
                    "quantity=" + quantity +
                    ", isBreathing=" + isBreathing +
                    '}';
        }
    }
}