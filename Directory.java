package git;

import java.io.File;
import java.util.Scanner;

public class Directory {
    public boolean openDir(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter file name");
        String fileName = sc.nextLine();
        boolean result =false;
        File file=new File(System.getProperty("user.dir")+"/"+fileName);
        System.out.println(file.getAbsolutePath());
        System.setProperty(System.getProperty("user.dir"),file.getAbsolutePath());
        if (file.exists())
        {
            result = (System.setProperty("user.dir", file.getAbsolutePath()) != null);
        }
        return result;
    }

    public boolean goParentDir(){
        boolean result =false;
        File file=new File(System.getProperty("user.dir").substring(0,System.getProperty("user.dir").lastIndexOf("/")));
        System.out.println(file.getAbsolutePath());
        System.setProperty(System.getProperty("user.dir"),file.getAbsolutePath());
        if (file.exists())
        {
            result = (System.setProperty("user.dir", file.getAbsolutePath()) != null);
        }
        return result;
    }
}
