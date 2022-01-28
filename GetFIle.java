package git;
import java.io.File;
import java.util.Arrays;

public class GetFiles {
    public void gettingFiles() {
        File file = new File(System.getProperty("user.dir"));
        System.setProperty(System.getProperty("user.dir"),file.getAbsolutePath());
        try {
            String[] List = file.list();
            Arrays.sort(List);
            for (String i: List){
                System.out.println(i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(file.getAbsolutePath());
    }
}

