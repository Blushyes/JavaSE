import java.io.File;

public class GetFilesInfo {
    public static void main(String[] args) {
        File file = new File("D:\\Study\\JavaSE\\IO\\files\\file1.txt");
        System.out.println("filename: " + file.getName());
        System.out.println("parent: " + file.getParent());
        System.out.println("AbsoluteFile: " + file.getAbsoluteFile());
        System.out.println("AbsoluteFile: " + file.getAbsoluteFile().getClass());
        System.out.println("AbsolutePath: " + file.getAbsolutePath().getClass());
        System.out.println("length: " + file.length());
        System.out.println("exists?: " + file.exists());
        System.out.println("isFile?: " + file.isFile());
    }
}

