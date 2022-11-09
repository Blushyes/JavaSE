import java.io.File;

public class CreateDirectory {
    public static void main(String[] args) {
        //创建一级目录（要创建的目前之前的目录都存在）
        {
            File file = new File("D:\\Study\\JavaSE\\IO\\dirs");
            boolean mkdir = file.mkdir();
            System.out.println(mkdir);
        }

        //创建多级目录
        {
            File file = new File("D:\\Study\\JavaSE\\IO\\dirs\\a\\b\\c");
            boolean mkdir = file.mkdir();
            System.out.println(mkdir);  //false
            mkdir = file.mkdirs();
            System.out.println(mkdir);  //ture
        }
    }
}