import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
/*
gives list of names and then writes the names to a file
 */
public class CustomerNames {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        File output = new File("customer.txt");
        String name;
        System.out.println("Enter the first customer name: ");
        name = in.nextLine();
        try{
            PrintWriter out = new PrintWriter(output);
            while (name.equalsIgnoreCase("done")==false)
            {
                out.println(name);
                System.out.println("Enter the next name or\"done\" to exit.");
                name = in.nextLine();
            }
            out.close();
        }catch (Exception e)
        {
            System.out.println("Error encountered " + e.toString());
        }
    }
}
