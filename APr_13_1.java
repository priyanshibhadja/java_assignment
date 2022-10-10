import java.io.File; 
import java.io.IOException; 
import java.util.*; 
 
public class APr_13_1 {
    // function to sort the array of students
    public static void sortArray(String[] student, int k) {
      
        for (int i = 0; i < k - 1; i++) {
            for (int j = 0; j < k - i - 1; j++) {
               
                if (student[j].compareTo(student[j + 1]) > 0) {
                    String temp = student[j];
                    student[j] = student[j + 1];
                    student[j + 1] = temp;
                }
            }
        }
        // print the student array in ascending order
        for (int i = 0; i < k; i++) {
            System.out.println(student[i]);
        }
    }
 
    public static void main(String[] args) {
        // an array to store the names 
        String student[] = new String[500];
        int counter = 0;
        try {
            // Here we use the loop for reading the names
            for (int i = 0; i < args.length; i++) {
                File file = new File(args[i]);
                Scanner scnr = new Scanner(file);
                while (scnr.hasNextLine()) {
                    String line = scnr.nextLine();
                    int flag = 0;
                    for (int j = 0; j < counter; j++) {
                        if (line.compareTo(student[j]) == 0) {
                            flag = 1;
                            break;
                        }
                    }
                    if (flag == 0) {
                        student[counter] = line;
                        counter++;
                    }
                }
            }
            //eSystem.out.println("the list of students in ascending order:");
            // call the sortArray() to sort the student array and print it
            sortArray(student, counter);
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        System.out.println("21CE008");
    }
}
