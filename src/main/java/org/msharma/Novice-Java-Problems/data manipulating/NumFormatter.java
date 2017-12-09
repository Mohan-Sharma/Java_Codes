import java.util.*;
import java.text.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class NumFormatter extends JFrame implements ActionListener
{
JTextField txt1,txt2,txt3,txt4;
JButton btn1,btn2;
public NumFormatter()
{
setLayout(new FlowLayout());
add(new JLabel("Language"));
add(txt1=new JTextField(15));
add(new JLabel("Country"));
add(txt2=new JTextField(15));
add(new JLabel("Number"));
add(txt3=new JTextField(15));
add(new JLabel("Formatted"));
add(txt4=new JTextField(15));
add(btn1=new JButton("Number Formatting"));
add(btn2=new JButton("Currency Formatting"));
txt4.setEditable(false);
btn1.addActionListener(this);
btn2.addActionListener(this);
setTitle("Number and Currency formatting");
setSize(225,300);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent e)
{
Object src=e.getSource();
Locale locale=new Locale(txt1.getText(),txt2.getText());
NumberFormat nf;
if(src==btn1)
nf=NumberFormat.getNumberInstance(locale);
else
nf=NumberFormat.getCurrencyInstance(locale);
double d=Double.parseDouble(txt3.getText());
txt4.setText(nf.format(d));
}
public static void main(String arr[])
{
new NumFormatter();
}
}