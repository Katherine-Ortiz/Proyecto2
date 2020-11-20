import java.io.File;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.Scanner;
public class PrincipalFile
{
    public static void main(String[] args){
        File file = new File("productos.txt.txt");
        PrintWriter output = null;
        try{
            output = new PrintWriter(new FileWriter(file,true));
            output.println("iphone,2000");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            if (output != null) {
                output.close();
            }
        }
    }
}

/*import java.io.File; lectura
import java.util.Scanner;
public class PrincipalFile
{
public static void main(String[] args){
File file = new File("productos.txt.txt");
try{
Scanner input = new Scanner(file);
String line;
while(input.hasNextLine()) {
line = input.nextLine();
System.out.println(line);
}
}catch(Exception e){
System.out.println(e.getMessage());
}
}
}*/
/*import java.io.File;
public class PrincipalFile
{
public static void main(String[] args){
File file = new File("productos.txt.txt");
System.out.println("Does it exist? " + file.exists());
System.out.println("The file has " + file.length() + " bytes");
System.out.println("Can it be read? " + file.canRead());
System.out.println("Can it be written? " + file.canWrite());
System.out.println("Is it a directory? " + file.isDirectory());
System.out.println("Is it a file? " + file.isFile());
}
}*/