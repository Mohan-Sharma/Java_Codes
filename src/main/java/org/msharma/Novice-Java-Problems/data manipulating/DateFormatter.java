import java.util.*;
import java.text.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class DateFormatter extends JFrame implements ActionListener
{
JTextField txt1,txt2,txt3,txt4;
JButton btn1,btn2;
public DateFormatter()
{
setLayout(new FlowLayout());
add(new JLabel("Language"));
add(txt1=new JTextField(15));
add(new JLabel("Country"));
add(txt2=new JTextField(15));
add(new JLabel("Date"));
add(txt3=new JTextField(15));
add(new JLabel("Time"));
add(txt4=new JTextField(15));
add(btn1=new JButton("Apply Formatting"));
txt4.setEditable(false);
btn1.addActionListener(this);
setTitle("Date and Time formatting");
setSize(250,300);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent e)
{
Object src=e.getSource();
Locale locale=new Locale(txt1.getText(),txt2.getText());
DateFormat df=DateFormat.getDateInstance(DateFormat.FULL,locale);
DateFormat tf=DateFormat.getTimeInstance(DateFormat.LONG,locale);
Date d=new Date();
txt3.setText(df.format(d));
txt4.setText(tf.format(d));
}
public static void main(String arr[])
{
new DateFormatter();
}
}