import javax.swing.*;
public class Average3 {
    public static void main(String[] args) {
        String Items;
        int itemAmount; 
        double sum;
        String products;
        String price;
        double itemPrice;
        double avg;
        int numberofpeas; 
        boolean isPeas;
        Items = JOptionPane.showInputDialog("Enter the amount of items: ");
        itemAmount = Integer.parseInt(Items);
        double[] priceArray = new double[itemAmount];
        String[] itemArray = new String[itemAmount];
        for(int k=0;k<itemAmount;k++)
        {

            products = JOptionPane.showInputDialog("Enter the item");
            itemArray [k] = products;

            price = JOptionPane.showInputDialog("Enter the price of the item");
            itemPrice = Double.parseDouble(price);
            priceArray[k]= itemPrice;

        }
       

    

        for(int i = itemAmount-1; i >= 0;i = i - 1) {
            
            JOptionPane.showMessageDialog(null,"The item is an " + itemArray[i] + " and the price for this item is " + priceArray[i] );
           
    }
    sum = 0;
    numberofpeas = 0;
    for(int i=0;i < itemAmount;i++) {
        if(itemArray[i].equalsIgnoreCase("Peas"))
        {
        isPeas = true;
        numberofpeas++;
        }
     
        }
       if(isPeas = true)
       {
       for (int i =0; i<itemAmount;i++)
       {
        sum = sum + priceArray[i];
       }

       }
       avg = sum/itemAmount;

    if(numberofpeas == 0)
    {
        JOptionPane.showMessageDialog(null,"No average output");
    }
    else
    {
        JOptionPane.showMessageDialog(null,"Average price for the items: " + avg);

    }
    }
}