import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * 删除所有创建的文件和目录
 *
 */
public class DeleteAllFilesAndDirs {
    public static void main(String[] args) {
        //删除所有文件
        for(int i = 1; i <= 3; ++i){
            File file = new File("D:\\Study\\JavaSE\\IO\\files\\file" + i + ".txt");
            boolean deleteSuc = file.delete();
            System.out.println(file.getPath() + ": " + deleteSuc);
        }

        //删除所有目录
        List<File> fileList = new ArrayList<>();
        fileList.add(new File("D:\\Study\\JavaSE\\IO\\dirs\\a\\b\\c"));
        fileList.add(new File("D:\\Study\\JavaSE\\IO\\dirs\\a\\b"));
        fileList.add(new File("D:\\Study\\JavaSE\\IO\\dirs\\a"));
        for(File file: fileList){
            boolean deleteSuc = file.delete();
            System.out.println(file.getPath() + ": " + deleteSuc);
        }
    }
}
