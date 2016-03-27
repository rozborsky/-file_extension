import java.io.File;

/**
 * Created by roman on 25.03.2016.
 */
public class Renamer {
    public void listFilesForFolder(String dir, final File folder) {
        for (final File fileEntry : folder.listFiles()) {
            if (folder.isDirectory()){
                rename(dir, fileEntry.getName());
            }
        }
    }

    private void rename(String dir, String old_name){
        File old_file = new File(dir + old_name);
        String new_name[] = old_name.split("\\.");
        String new_n = dir + new_name[0] + ".JPG";
        System.out.println(dir + new_name[0] + ".JPG");
        File new_file = new File(new_n);
        old_file.renameTo(new_file);
    }
}

