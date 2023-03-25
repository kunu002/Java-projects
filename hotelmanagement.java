import java.awt.*;
import java.awt.event.*;
class hotelm extends Frame implements ActionListener
{
Checkbox c1,c2,c3;
Label l1,l2,l3,l4,l5,l6,l7,l8;
TextField t1,t2,t3;
Button b1;
String c4;
hotelm()
{
setLayout(null);
l1=new Label("MENU");
add(l1);
l2=new Label("Tea : 25Rs");
add(l2);
l3=new Label("Coffee : 30Rs");
add(l3);
l4=new Label("Cold Coffee : 35Rs");
add(l4);
c1=new Checkbox("Tea");
add(c1);
c2=new Checkbox("Coffee");
add(c2);
c3=new Checkbox("Cold Coffee");
add(c3);

l5=new Label("Tea");
add(l5);
t1=new TextField("0");
add(t1);

l6=new Label("Coffee");
add(l6);
t2=new TextField("0");
add(t2);

l7=new Label("Cold Coffee");
add(l7);
t3=new TextField("0");
add(t3);

l8=new Label(" ");
add(l8);
b1=new Button("Submit");
add(b1);
b1.addActionListener(this);

l1.setBounds(10,30,100,30);
l2.setBounds(10,60,100,30);
l3.setBounds(10,90,100,30);
l4.setBounds(10,120,100,30);
c1.setBounds(10,190,10,30);
c2.setBounds(10,220,10,30);
c3.setBounds(10,250,10,30);
l5.setBounds(30,190,60,30);
l6.setBounds(30,220,60,30);
l7.setBounds(30,250,60,30);
t1.setBounds(120,190,50,30);
t2.setBounds(120,220,50,30);
t3.setBounds(120,250,50,30);
b1.setBounds(100,300,50,30);
l8.setBounds(100,350,100,30);




addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
dispose();
}
});
}

public void actionPerformed(ActionEvent e)
{     
     int a,b,c;
int total;
a=Integer.parseInt(t1.getText())*25;
b=Integer.parseInt(t2.getText())*30;
c=Integer.parseInt(t3.getText())*35;
total=a+b+c;
l8.setText("total price:-"+Integer.toString(total));

}
public static void main(String args[])
{
hotelm hm=new hotelm();
hm.setSize(500,500);
hm.setTitle("hotel management");
hm.setVisible(true);
}
}
