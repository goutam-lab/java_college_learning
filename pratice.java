// // // // public class pratice {
// // // //     class vehicle{
// // // //         public void startengine(){
// // // //             System.out.println("Engine started");
// // // //         }
// // // //     }
// // // //     class car extends vehicle{
// // // //         @Override
// // // //         public void startengine(){
// // // //             System.out.println("Car engine started");
// // // //         }
// // // //     }
// // // //     class bike extends vehicle{
// // // //         @Override
// // // //         public void startengine(){
// // // //             System.out.println("Bike engine started");
// // // //         }
// // // //     }
// // // //     public static void main(String[] args){
// // // //         pratice p = new pratice();
// // // //         vehicle v = p.new vehicle();
// // // //         v.startengine(); // Engine started
// // // //         car c = p.new car();
// // // //         c.startengine(); // Car engine started
// // // //         bike b = p.new bike();
// // // //         b.startengine(); // Bike engine started
// // // //     }
// // // // }



// // // // Create a superclass Shape with a protected method draw. Create a subclass Circle that overrides the draw method with a public access modifier.

// // // public class pratice {
// // //     class Shape {
// // //         protected void draw() {
// // //             System.out.println("Drawing a shape");
// // //         }
// // //     }

// // //     class Circle extends Shape {
// // //         @Override
// // //         public void draw() {
// // //             System.out.println("Drawing a circle");
// // //         }
// // //     }

// // //     public static void main(String[] args) {
// // //         pratice p = new pratice();
// // //         Shape shape = p.new Shape();
// // //         shape.draw(); // Output: Drawing a shape
        
// // //         Circle circle = p.new Circle();
// // //         circle.draw(); // Output: Drawing a circle
// // //     }
// // // }


// // // single inheritance
// // public class pratice {
// //     class Animal{
// //         public void sound(){
// //             System.out.println("Animal makes sound");
// //         }
// //     }
// //     class dog extends Animal{
// //         public void sound(){
// //             System.out.println("Dog barks");
// //         }
// //     }
// //     public static void main(String[] args){
// //         pratice p = new pratice();
// //         dog d = p.new dog();
// //         d.sound(); // Dog barks
// //     }
// // }

// // multilevel inheritance 
// public class pratice {
// class animal{
//     public void sound(){
//         System.out.println("Animal makes sound");
//     }
// }
// class dog extends animal{
//     public void s(){
//         System.out.println("Dog barks");
//     }
// }
// class puppy extends dog{
//     public void h(){
//         System.out.println("Puppy barks");
//     }
// }
//     public static void main(String[] args){
//         pratice p = new pratice();
//         puppy pu = p.new puppy();
//         pu.h();
//         animal a = p.new animal(); // Animal makes sound
//         a.sound(); // Animal makes sound
//         dog d = p.new dog(); // Dog barks
//         d.s(); // Dog barks
//      } // Puppy barks  }
// }