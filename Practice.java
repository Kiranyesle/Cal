
package mode;

import javax.swing.JOptionPane;

public class Practice {


    public static void main(String[] args) {
try
{
    while (true){
    
        String n1=JOptionPane.showInputDialog("Enter number1");
        String n2=JOptionPane.showInputDialog("Enter number2");
        
        String operation=JOptionPane.showInputDialog(
                "Press 1 for Addition"+ 
                "\nPress 2 for Subtraction"+
                "\nPress 3 for Multiplication"+ 
                "\nPress 4 for Division"
        );
        int no1=Integer.parseInt(n1);
        int no2=Integer.parseInt(n2);
        int op=Integer.parseInt(operation);
        int result =0;
        
        switch(op)
        {
            case 1:result=no1+no2; break;
            case 2:result=no1-no2; break;
            case 3:result=no1*no2; break;
            case 4:result=no1/no2; break;
            
        }
    
    
        JOptionPane.showMessageDialog(null, "The answer is "+result);
           
    }
}
    catch(NumberFormatException e )
    {
         
     JOptionPane.showMessageDialog(null, "Nothing");
         
    }    
}
}
