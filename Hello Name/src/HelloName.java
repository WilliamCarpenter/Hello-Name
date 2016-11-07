import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class HelloName extends JFrame
	{
		private static final long serialVersionUID = 1L;
		static String name; 
		static JFrame frame = new JFrame();

	public static void main(String[] args) 
		{
		// TODO Auto-generated method stub
			name = JOptionPane.showInputDialog("What is your name?");  
			Scanner userInput = new Scanner(System.in);
			System.out.println("What is your name?");
			String name = userInput.nextLine();
			System.out.println("Hello, " + name + "!");

			System.out.println("What is your favorite color?");
			String color = userInput.nextLine();
			System.out.println(color + " is my favorite too!");

			System.out.println("What is your favorite animal?");
			String animal = userInput.nextLine();
			System.out.println(animal + " is my favorite animal!");
			

			



		}
}

