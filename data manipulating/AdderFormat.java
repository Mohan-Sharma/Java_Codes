import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
class AdderFormat extends JFrame implements ActionListener
{
JTextField txt1,txt2,txt3;
JButton btn;
static ResourceBundle bundle;
public AdderFormat()
{
setLayout(new FlowLayout());
add(new JLabel(bundle.getString("lbl1")));
add(txt1=new JTextField(10));
add(new JLabel(bundle.getString("lbl2")));
add(txt2=new JTextField(10));
add(new JLabel(bundle.getString("lbl3")));
add(txt3=new JTextField(10));
add(btn=new JButton(bundle.getString("btn")));
txt3.setEditable(false);
btn.addActionListener(this);
setSize(250,300);
setvisible(true);
setTitle("Adder");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent e)
{
double a=Double.parseDouble(txt1.getText());
double b=Double.parseDouble(txt2.getText());
double c=a+b;
txt3.setText(String.valueOf(c));
}
public static void main(String arr[])
{
if(arr.length==0)
{
System.out.println("Usage:java Adder langCode");
System.exit(0);
}
Locale locale=new Locale(arrr[0]);
bundle=ResourseBundle.getBundle("Adder",locale);
new AdderFormat();
}
}