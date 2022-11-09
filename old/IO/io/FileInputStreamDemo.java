import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        //单字节读取
        {
            FileInputStream inputStream = null;
            try {
                inputStream = new FileInputStream("D:\\Study\\JavaSE\\IO\\files\\file1.txt");
                int read;
                //若读到文件末尾，则返回-1
                while ((read = inputStream.read()) != -1){
                    System.out.print((char)read);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                //关闭流
                try {
                    assert inputStream != null;
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        //多字节读取
        {
            System.out.println();
            FileInputStream inputStream = null;
            try {
                inputStream = new FileInputStream("D:\\Study\\JavaSE\\IO\\files\\file1.txt");
                byte[] buf = new byte[8];
                int readLen;
                //返回-1表示读取完毕
                //如果读取成功则返回实际读取的字节数
                while ((readLen = inputStream.read(buf)) != -1){
                    System.out.print(new String(buf, 0, readLen));
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                //关闭流
                try {
                    assert inputStream != null;
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
