import java.util.Scanner;
import java.io.File;
 
public class count {
    public static void main(String[] args) throws Exception {
      //  if in Commandline Argument we didn't give file it will not execute this program
        if (args.length < 1) {
            System.out.println("You Have not Given Path for File, Please specify the path");
            System.exit(1);
        }
 
        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("File Does not exist!!");
            System.exit(2);
        }
    //here we initialized all value zero
        Scanner in = new Scanner(file);
        long charCount = 0L;
        int lines = 0;
        int words = 0;
 
        while(in.hasNext()) {
            String line = in.nextLine();
            //here we Applied logic for counting the lines,words etc....
            String[] wordArray = line.split(" ");         
 
            charCount += line.length();
            lines += 1;
            words += wordArray.length;
        }
        System.out.println("File "+args[0]+" has "+ charCount +" characters " + words + " words " + lines + " lines");
        System.out.println("by 21CE008");
    }
}
