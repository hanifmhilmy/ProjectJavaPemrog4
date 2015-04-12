/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t_p4;

/**
 *
 * @author calutak
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Object anm based on class Animal
        Animal anm = new Animal();
        anm.eat();
        anm.walk();
        //Object anm1 based on class Animal with overload constructor Animal
        Animal anm1 = new Animal(4);
        anm1.eat();
        anm1.walk();
        //Abstact class Pet
        Pet pt = new Pet() {};
        pt.setName("MyPet");
        System.out.println(pt.getName());
        pt.play();
        //Object spider based on class Spider which is subclass from class Animal
        Spider spider = new Spider();
        spider.eat();
        //Object cat based on class Cat which is subclass from abstract class Pet
        Cat cat = new Cat();
        cat.setName("Castro");
        cat.play();
        cat.eat();
        //Object fish based on class Fish which is subclass from abstract class Pet
        Fish fish = new Fish();
        fish.setName("Shado");
        fish.play();
        fish.walk();
        fish.eat();
        
    }
}
