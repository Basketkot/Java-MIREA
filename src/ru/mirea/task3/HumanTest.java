package ru.mirea.task3;

public class HumanTest {
    public static void main(String[] args){
        Human human = new Human("human1", 19, 180, 80.5);
        Human.Head head = human.new Head(true, 1);
        Human.Legs legs = human.new Legs(2, false);
        Human.Hands hands = human.new Hands(2, false);
        Human.Chest chest = human.new Chest(1, true);
        System.out.println(head);
        System.out.println(hands);
        System.out.println(legs);
        System.out.println(chest);
        System.out.println(human);
    }
}