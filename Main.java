import java.io.File;

/**
 * Created by roman on 25.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        String dir = "C:\\Users\\roman\\.android\\cache\\prog\\new\\";
        Renamer rename = new Renamer();
        rename.listFilesForFolder(dir, new File(dir));
    }
}
