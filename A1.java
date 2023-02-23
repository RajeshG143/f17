import java.io.*;
import java.util.*;
public class A1 
{
    public static void main(String[] args) 
    {
 Scanner sc= new Scanner(System.in);
        String input="";
        String line = "";
        Map<String, String> map = new HashMap<String, String>();
try 
{
 FileReader fr = new FileReader("/home/rajesh/java/MVI/f17/Student.txt");
 BufferedReader br = new BufferedReader(fr);
while ((line = br.readLine()) != null) 
{
 String content [] = line.split(",");
 map.put(content[0],content[1]);
}
 br.close();
} 
catch (IOException e) 
        {
            e.printStackTrace();
        }
        System.out.println(map);
        System.out.println("Enter the Student ID");
       input = sc.nextLine();
        System.out.println(map.get(input));


    }
}
