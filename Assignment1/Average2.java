import javax.swing.*;

public class Average2 {
    public static void main(String[] args) {
        String Item1;
        String Item2;
        String Item3;
        
        String Price1;
        String Price2;
        String Price3;

        double P1;
        double P2;
        double P3; 
        double avg; 

        Item1 = JOptionPane.showInputDialog("Enter the first item: ");
        Price1 = JOptionPane.showInputDialog("Enter the price for this item: ");
        P1 = Double.parseDouble(Price1);

        Item2 = JOptionPane.showInputDialog("Enter the second item: ");
        Price2 = JOptionPane.showInputDialog("Enter the price for this item: ");
        P2 = Double.parseDouble(Price2);

        Item3 = JOptionPane.showInputDialog("Enter the third item: ");
        Price3 = JOptionPane.showInputDialog("Enter the price for this item: ");
        P3 = Double.parseDouble(Price3);

        JOptionPane.showMessageDialog(null,"The item is an " + Item1 + " and the price is: " + P1);
        JOptionPane.showMessageDialog(null,"The item is an " + Item2 + " and the price is: " + P2);
        JOptionPane.showMessageDialog(null,"The item is an " + Item3 + " and the price is: " + P3);

        avg = (P1 + P2 + P3)/3;

        if (Item1.equalsIgnoreCase("Peas") || Item2.equalsIgnoreCase("Peas") || Item3.equalsIgnoreCase("Peas"))
    {
        JOptionPane.showMessageDialog(null,"The average for these prices are: " + avg);
        
    }
    else
    {
        JOptionPane.showMessageDialog(null,"No average output");

    }


    }
}