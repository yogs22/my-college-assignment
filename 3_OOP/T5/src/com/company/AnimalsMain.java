package com.company;

public class AnimalsMain {

    public static void main(String[] args) {
        Biodata biodata = new Biodata();
        Cat cat = new Cat();
        Bird bird = new Bird();
        Sheep sheep = new Sheep();
        Chow chow = new Chow();
        Chicken chicken = new Chicken();

        biodata.getBiodata();
        cat.print();
        bird.print();
        sheep.print();
        chow.print();
        chicken.print();
    }
}
