import java.io.*;

public class Main {

    public static void main(String[] args) {

		try {
			// File with infix expressions
			//String inFileName = "infix_expr_short.txt";
			String inFileName = args[0];
			String outFileName = args[1];

			FileReader fileReader = new FileReader(inFileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			FileWriter fileWriter = new FileWriter(outFileName);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
				String currentExpr = bufferedReader.readLine();

			while (currentExpr != null) {


				currentExpr = InfixPostfixConverter.convertToPostfix(currentExpr);
				String result = PostfixEvaluator.evaluatePostfixExpression(currentExpr);

				bufferedWriter.write(result);
				currentExpr = bufferedReader.readLine();
				System.out.println("---------------------------");

			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + e);
		} catch (IOException e) {
			System.out.println("Error reading file: " + e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: No command line arguments given. Exiting");
		}

    }
}
