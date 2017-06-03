package IOstreams;

//import java.io.BufferedReader;
import java.io.*;

public class type2 {

     public static void main(String[] argfs)
    {
        String file = "C:\\Temp\\ram.txt";
        String line = "";
        String words[]=null;
        try
        {
            BufferedReader inFile=new BufferedReader(new FileReader(file));
            while((line=inFile.readLine())!=null)
            {
                System.out.println(line);
                 words=line.split(" ");
                break;
            }
            
            for (Object obj:words)
            {
            System.out.println(obj);
            }
            }
          
        catch(FileNotFoundException e)
        {
            System.out.println("File not found..Try again");
        }

        catch(IOException e)
        {
            System.out.println("problem reading file.");
        }
    }
}
