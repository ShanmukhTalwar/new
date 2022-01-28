package git;

import java.io.File;
import java.util.Scanner;

public class SearchFile {
    public void fileSearch(){
        System.out.println("enter a file");
        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();
        File file =new File(System.getProperty("user.dir"));
        if (file.exists()){
            System.out.println(fileName +" file found");

        }
        else {
            System.out.println("file not found");
        }
    }
}
