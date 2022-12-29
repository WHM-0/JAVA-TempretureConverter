import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
 
public class TempretureConverter extends JFrame implements ActionListener{ 
     
    JLabel promet; //JLabel objects  
    JTextField textField; //JTextField objects  
    JButton calculateBtn; //JButton objects  
   
    public TempretureConverter() 
    { 
        super.setTitle("C to F Converter"); 
        super.setSize(300, 200); 
        super.setDefaultCloseOperation(3); 
        super.setLocationRelativeTo(this); 
        super.setLayout(new FlowLayout()); 
         
        promet = new JLabel("Enter a tempreture in Celsius"); 
        textField = new JTextField(10); 
         
        calculateBtn = new JButton("Calculate"); 
        calculateBtn.addActionListener(this); 
         
        super.add(promet); 
        super.add(textField); 
        super.add(calculateBtn); 
        super.setVisible(true); 
    } 
 
     
    public void actionPerformed(ActionEvent ae) { 
         
        if(ae.getSource() == calculateBtn) 
        { 
            //Convert input to a double 
            double celsius = Double.parseDouble(textField.getText()); 
             
            double fahrenheit =  (celsius * 9/5) + 32; //fahrenheit formula 
             
            //promet the result  
            JOptionPane.showMessageDialog(null,  
                    "Tempreture in Fahrenheit is: " + fahrenheit); 
        } 
         
    } 
     
    
    public static void main(String[] args) { 
        TempretureConverter tempretureConverter = new TempretureConverter(); 
    } 
}