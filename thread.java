//Modify the Code:

//Change the loop to print numbers from 10 to 1.
//Change the sleep time to 500 milliseconds.
// public class thread extends Thread{
//     public void run(){
//         for(int i = 10 ; i >= 1 ; i--){
//             System.out.print(i);
//             try{
//                 Thread.sleep(500);
//             }catch(InterruptedException e){
//                 System.out.println(e);
//             }

//         }
//     }
//     public static void main(String args[]){
//         thread t1 = new thread();
//         t1.start();
//     }
// }

public class thread extends Thread{
    public void run(){
        for(int i = 3; i >= 1 ; i--){
            if(i == 3){
                System.out.print("3");
            }
            else if(i == 2){
                System.out.print("2");
            }
            else{
                System.out.print("1");
            }
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println(e);
            }

        }
    }
    public static void main(String args[]){
        thread t1 = new thread();
        t1.start();
    }
}