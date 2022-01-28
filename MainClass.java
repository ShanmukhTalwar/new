package com.cmd;
import java.util.Scanner;
public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GetFiles createFile = new GetFiles();
        AddAndDeleteFiles files1 = new AddAndDeleteFiles();
        RightOptions isRight = new RightOptions();
        SearchFile search = new SearchFile();
        Directory dir=new Directory();
        System.out.println("""
                
                +---------------------------------+
                |    WELCOME TO LOCKEDme.com      |
                |---------------------------------|
                |    Developer:Shanmukh Talawar   |
                |             :shtalawa@cisco.com |
                +---------------------------------+""");
        while (true) {
            System.out.println("""
                    
                    |Choose option:
                    |   1.Retrieve Files
                    |   2.Business Level Operations
                    |   3.Exit Application
                    """);
            System.out.println("Working Directory = " + System.getProperty("user.dir"));
            int option = isRight.checkInput();
            switch (option) {
                case 1 -> createFile.gettingFiles();
                case 2 -> {
                    while (true) {
                        System.out.println("""
                               
                               | Choose options
                               |    1.Add Folder
                               |    2.Add Files
                               |    3.Delete Files
                               |    4.Change Directory
                               |    5.Go To Parent Directory
                               |    6.Search File
                               |    7.Back
                                """);
                        int option1 = isRight.checkInput();
                        switch (option1) {
                            case 1 -> files1.dirCreate();
                            case 2 -> files1.fileCreate();
                            case 3 -> files1.deleteFile();
                            case 4 -> dir.openDir();
                            case 5 -> dir.goParentDir();
                            case 6 -> search.fileSearch();
                            default -> {
                                if (option1 == 7) {
                                    System.out.println("Thank You");
                                    break;
                                } else {
                                    System.out.println("You Entered Wrong Option, Try Again\n");
                                }
                            }
                        }if(option1==7)
                            break;
                    }
                }
                case 3 -> System.exit(1);
                default -> System.out.println("You Entered Wrong Option, Try Again\n");
            }
        }
    }
}
