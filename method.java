// // // public class method {
// // //     public static int sub(int a , int b){
// // //         return a-b ;
// // //     }
// // //     public static void main(String[] args){
// // //         int s = sub(20,5);
// // //         System.out.println("Subtraction of two numbers is: " + s);
// // //     }
// // // }


// // // method overloading
// // public class method{
// //     public int add(int a , int b ){
// //         return a+b;
// //     }
// //     public int add(int a , int b , int c){
// //         return a+b+c;
// //     }
// //     public static void main(String[] args){
// //         method m = new method();
// //         int s = m.add(10,20);
// //         System.out.println("Addition of two numbers is: " + s);
// //         int s1 = m.add(10,20,30);
// //         System.out.println("Addition of three numbers is: " + s1);
// //     }
// // }


// // method overriding
// public class method{
//     class dog{
//         public void sound(){
//             System.out.println("Dog barks");
//         }
//     }
//     class cat extends dog{
//         @Override
//         public void sound(){
//             System.out.println("Cat meows");
//         }
//     }
//     public static void main(String[]args){
//         method m = new method();
//         dog d = m.new dog();
//         d.sound(); // Dog barks
//         cat c = m.new cat();
//         c.sound(); // Cat meows
//     }
// }