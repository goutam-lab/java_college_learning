import java.io.File;

public class filehandling {
    //File handling is a process of creating, reading, writing, and deleting files in a computer system. 
    //It allows programs to store and retrieve data from files, enabling persistent storage and data management.
    //In Java, file handling is done using classes from the java.io package, such as File, FileReader, FileWriter, BufferedReader, and BufferedWriter.
    //These classes provide methods for performing various file operations like opening, closing, reading, writing, and deleting files.
    

    //creating a file 
    // public static void main(String args[]){
    //     try {
    //         File file = new File("example.txt");
    //         if(file.createNewFile()){
    //             System.out.println("File has successfully created");

    //         }else{
    //             System.out.print("File already created");
    //         }
    //     } catch (Exception e) {
    //         System.out.println("error occured");
    //         e.printStackTrace();
    //     }
    // }


    // writing a file 
    // public static void main(String args []){
    //     try {
    //         FileWriter writer = new FileWriter("example.txt");
    //         writer.write("Hello world");
    //         writer.close();
    //         System.out.println("Successfully written");
    //     } catch (Exception e) {
    //         System.out.print("Some error occured");
    //         e.printStackTrace();
    //     }
    // }

    //reading a file 
    // public static void main(String[] args) {
    //     try {
    //         File file = new File("example.txt");
    //         Scanner Sc = new Scanner(file);
    //         while(Sc.hasNextLine()){
    //             String data = Sc.nextLine();
    //             System.out.println(data);

    //         }
    //         Sc.close();

    //     } catch (Exception e) {
    //     }
    // }

    public static void main(String[] args) {
        File file = new File("example.txt");
        if (file.delete()) {
            System.out.println("Deleted the file: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
