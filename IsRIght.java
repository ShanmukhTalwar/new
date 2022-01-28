package git;

import java.util.Scanner;

public class RightOptions {
    Scanner sc = new Scanner(System.in);

    public  int checkInput() {

        int option;
        while (true) {
            String str = sc.nextLine();
            String regex = "[0-9]+";
            //                System.out.println(option.matches(regex));
            if (str.matches(regex)) {
                option = Integer.parseInt(str);
                return option;
            } else {
                System.out.println("choose correct option");
            }
        }
    }
}

