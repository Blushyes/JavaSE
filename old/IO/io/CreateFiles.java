import java.io.File;
import java.io.IOException;

/**
 *  IO测试
 *
 */
public class CreateFiles {
    public static void main(String[] args) throws IOException {
        //直接通过文件名来创建
        {
            String path = "D:/Study/JavaSE/old/IO/files/file1.txt";
            File file = new File(path);
            //若创建成功则返回true，否则返回false
            boolean newFile = file.createNewFile();
            System.out.println(newFile);
        }

        //通过父目录和文件名创建
        {
            String path = "D:/Study/JavaSE/old/IO/files";
            String fileName = "file2.txt";
            File file = new File(path, fileName);
            //若创建成功则返回true，否则返回false
            boolean newFile = file.createNewFile();
            System.out.println(newFile);
        }

        //通过父目录文件和子路径创建
        {
            File parent = new File("D:\\Study\\JavaSE\\IO\\files");
            String child = "file3.txt";
            File file = new File(parent, child);
            //若创建成功则返回true，否则返回false
            boolean newFile = file.createNewFile();
            System.out.println(newFile);
        }
    }
}