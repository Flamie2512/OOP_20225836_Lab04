import javax.swing.JOptionPane;
public class CalculateTwoNumbers{
	public static void main(String[] args){
		String strnum1, strnum2;

		strnum1 = JOptionPane.showInputDialog(null,
			"Please input the first number: ", "Input the first number",
			JOptionPane.INFORMATION_MESSAGE);
		
		
		strnum2 = JOptionPane.showInputDialog(null,
			"Please input the second number: ", "Input the second number",
			JOptionPane.INFORMATION_MESSAGE);
		
		double num1 = Double.parseDouble(strnum1);
		double num2 = Double.parseDouble(strnum2);

		double sum = num1 + num2;
		double difference = num1 - num2;
		double product = num1 * num2;
		String quotient;
		if(num2 == 0){
			quotient = "Loi:Khong chia duoc";
			}
		else{
			quotient = String.valueOf(num1/num2);
			}
		
		String result;
		result = "Results: " + "\n" +
			"sum: " + sum + "\n" +
			"difference: " + difference + "\n" +
			"product: " + product + "\n" +
			"quotient: " + quotient;

		JOptionPane.showMessageDialog(null, result, 
		"Calculation Results",JOptionPane.INFORMATION_MESSAGE);

		System.exit(0);

	}
}