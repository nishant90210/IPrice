import java.util.Scanner;

/*
Creational pattern
In Factory pattern, we create object without exposing the creation logic to the client
and refer to newly created object using a common interface.
 */
public class GenerateString {

    public static void main(String args[]) {

        GetOperationFactory planFactory = new GetOperationFactory();

        Scanner in = new Scanner(System.in);
        System.out.print(
                "Enter the name of operation for which the string will be generated: \n" +
                "1.) Generate Upper Case \n" +
                "2.) Generate Alternate Case \n" +
                "3.) Generate CSV Case \n");

        String typeId = in.nextLine();

        System.out.print("Enter the Input String :- ");

        String inputString = in.nextLine();

        Convertor convertor = planFactory.getConvertor(typeId);
        System.out.println("Output :- " + convertor.applyOperation(inputString));
    }
}
