

import javax.swing.JOptionPane;

public class CalculateTwoNumbers{
	public static void main(String args[]) {
        String strNum1, strNum2;

        strNum1 = JOptionPane.showInputDialog(null,
            "Please input the first number: ", "Input the first number",
            JOptionPane.INFORMATION_MESSAGE
        );

        strNum2 = JOptionPane.showInputDialog(null,
            "Please input the second number: ", "Input the second number",
            JOptionPane.INFORMATION_MESSAGE
        );
        
        double num1 = Double.parseDouble(strNum1),
        	num2 = Double.parseDouble(strNum2),
        	sum = num1 + num2,
        	dif = Math.abs(num1 - num2),
        	pro = num1 * num2,
        	quo = num1 / num2;

        JOptionPane.showMessageDialog(null,
        		"You've just entered " + num1 + " and " + num2 +
        		"\nSum: " + sum +
        		"\nDifference: " + dif +
        		"\nProduct: " + pro +
        		"\nQuotient: " + quo,
            "Answer ", JOptionPane.INFORMATION_MESSAGE
        );

        System.exit(0);
    }
}