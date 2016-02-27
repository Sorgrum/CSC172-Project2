import java.util.ArrayList;

/**
 * Student Name: Marcelo Gheiler
 * Filename: InfixPostfixConverter
 * Date: 2/24/16
 * TA Name: Shengbo Ge
 * Assignment:
 * Lab: MW 2-3:15pm
 * Lab Location: Gavett 244
 * I affirm that I have not given or received any unauthorized help on this assignment, and that this work is my own
 */
public class InfixPostfixConverter {


	public static String convertToPostfix(String infixExpr) {

		ArrayList<String> tokens = tokenize(infixExpr);
		Stack<String> operatorStack = new Stack<>();
		Queue<String> postfixString = new Queue<>();

		for (int i = 0; i < tokens.size(); i++) {

		}
		return "";
	}

	public static ArrayList<String> tokenize(String infixExpr) {

		ArrayList<String> tokenizedString = new ArrayList<>();

		for (int i = 0; i < infixExpr.length(); i++) {
			String tokenToAdd = "";

			switch (infixExpr.charAt(i)) {
				case ')':
					tokenizedString.add(Character.toString(infixExpr.charAt(i)));
					System.out.println("Added " + Character.toString(infixExpr.charAt(i)));
					break;
				case '(':
					tokenizedString.add(Character.toString(infixExpr.charAt(i)));
					System.out.println("Added " + Character.toString(infixExpr.charAt(i)));
					break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
				case '8':
				case '9':
				case '.':
					// While the next characters are numbers or a period combine them into one string
					tokenToAdd = "";

					// If it's the last one there shouldnt be any other number following it's a single digit

					tokenToAdd += infixExpr.charAt(i);

					while (i + 1 < infixExpr.length() && (Character.isDigit(infixExpr.charAt(i + 1)) || infixExpr
							.charAt(i + 1)
							== '.')) {
						tokenToAdd += infixExpr.charAt(i + 1);

						i++;
					}



					tokenizedString.add(tokenToAdd);
					System.out.println("Added " + tokenToAdd);
					break;
				case '+':
					tokenizedString.add(Character.toString(infixExpr.charAt(i)));
					System.out.println("Added " + Character.toString(infixExpr.charAt(i)));
					break;
				case '-':
					tokenToAdd = "";


					// If the previous token is a digit
					try {
						Double.parseDouble(tokenizedString.get(tokenizedString.size() - 1));
						tokenToAdd = Character.toString(infixExpr.charAt(i));
					} catch (NumberFormatException e) {
						tokenToAdd = tokenToAdd + Character.toString(infixExpr.charAt(i));
						int k = i + 1;
						while (k < infixExpr.length() && (Character.isDigit(infixExpr.charAt(k)) || infixExpr.charAt(k) == '.')) {
							tokenToAdd += Character.toString(infixExpr.charAt(k));
							k++;
						}
						// We already took all the intermediate characters into account
						i = k;
					} catch (ArrayIndexOutOfBoundsException e ) {
						tokenToAdd = tokenToAdd + Character.toString(infixExpr.charAt(i));
						int k = i + 1;
						while (k < infixExpr.length() && (Character.isDigit(infixExpr.charAt(k)) || infixExpr.charAt(k) == '.')) {
							tokenToAdd += Character.toString(infixExpr.charAt(k));
							k++;
						}
						// We already took all the intermediate characters into account
						i = k;
					}

					tokenizedString.add(tokenToAdd);
					System.out.println("Added " + tokenToAdd);
					break;
				case '*':
					tokenizedString.add(Character.toString(infixExpr.charAt(i)));
					System.out.println("Added " + Character.toString(infixExpr.charAt(i)));
					break;
				case '/':
					tokenizedString.add(Character.toString(infixExpr.charAt(i)));
					System.out.println("Added " + Character.toString(infixExpr.charAt(i)));
					break;
				case '=':
					tokenizedString.add(Character.toString(infixExpr.charAt(i)));
					System.out.println("Added " + Character.toString(infixExpr.charAt(i)));
					break;
				case '&':
					tokenizedString.add(Character.toString(infixExpr.charAt(i)));
					System.out.println("Added " + Character.toString(infixExpr.charAt(i)));
					break;
				case '|':
					tokenizedString.add(Character.toString(infixExpr.charAt(i)));
					System.out.println("Added " + Character.toString(infixExpr.charAt(i)));
					break;
				case '>':
					tokenizedString.add(Character.toString(infixExpr.charAt(i)));
					System.out.println("Added " + Character.toString(infixExpr.charAt(i)));
					break;
				case '<':
					tokenizedString.add(Character.toString(infixExpr.charAt(i)));
					System.out.println("Added " + Character.toString(infixExpr.charAt(i)));
					break;
				case '!':
					tokenizedString.add(Character.toString(infixExpr.charAt(i)));
					System.out.println("Added " + Character.toString(infixExpr.charAt(i)));
					break;

				case ' ':
					break;
				default:
					System.out.println(Character.toString(infixExpr.charAt(i)) + " not added");


			}
		}
		return tokenizedString;
	}
}
