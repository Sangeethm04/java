// import Pet;

// package Chapt9;
// public class Pet {
//     private String name;
//     private String type;

//     public Pet(String n, String t) {
//         name = n;
//         type = t;
//     }
//     public String getType() {
//         return type;
//     }
//     public String getName() {
//         return name;
//     }

//     public void speak() {
//         System.out.println("grr!");
//     }
//     public static void main(String[] args) {
//         Pet p = new Pet("Sammy", "hamster");
//         System.out.println(p.getType());
//         p.speak();

//         Dog d = new Dog("Fido");
//         System.out.println(d.getType());
//         d.speak();
//         Cat c = new Cat("Fluffy");
//         System.out.println(c.getType());
//         c.speak();

//     }
// }

// // Complete the Dog class
//  class Dog extends Pet {

//     public Dog(String n) {
//         super(n, "dog");
//     }

//     public void speak() {
//         System.out.println("Meow!");
//     }

// }

// // Add a Cat class
// class Cat extends Pet {
//     public Cat(String n) {
//         super(n, "cat");
//     }
//     public void speak() {
//         System.out.println("Woof!");
//     }

// }