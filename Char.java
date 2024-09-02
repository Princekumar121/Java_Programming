import java.io.*;
class Char
{
  public static void main(String args[])throws IOException
  {
     FileInputStream fis= new FileInputStream("Q.txt");
     BufferedInputStream bis= new BufferedInputStream(fis);
     FileOutputStream fos= new FileOutputStream("A.txt");
     BufferedOutputStream bos= new BufferedOutputStream(fos);
     int x=0;
     while((x=bis.read())!=-1)
     { 
        bos.write(x);
     }
     bis.close();
     fis.close();
     bos.close();
     fos.close();
  }
}

