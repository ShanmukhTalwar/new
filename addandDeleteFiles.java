package git;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AddAndDeleteFiles {
    Scanner sc =new Scanner(System.in);
    public void dirCreate(){
        System.out.println("enter file name");
        String fileName=sc.nextLine();
        File file=new File(System.getProperty("user.dir")+"/"+fileName);
        System.setProperty(System.getProperty("user.dir"),file.getAbsolutePath()+"/"+fileName);
        if(file.mkdir()) {
            try {
                System.out.println("file created");
            } catch (Exception e) {
                System.out.println("Unable to create");
            }
        }
        else{
            System.out.println("try by another name");
        }
    }

    public void fileCreate(){
        System.out.println("Enter file name");
        String fileName=sc.nextLine();
        File file=new File(System.getProperty("user.dir")+"/"+fileName);
        try {
            if(file.createNewFile()) {
                System.out.println("file created");
            }
            else{
                System.out.println("unable to create");
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("unable to create");
        }
    }

    public void deleteFile(){
        System.out.println("enter file name");
        String fileName=sc.nextLine();
        File file=new File(System.getProperty("user.dir")+"/"+fileName);
        if(file.delete()){
            System.out.println("file deleted successfully");
        }
        else{
            System.out.println("unable to find file");
        }
    }
}
