package Hero.view;

import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;

import Hero.tools.GUI;

@SuppressWarnings("serial")
public class MoveFrom extends JDialog {
public String Map1;
public String Map2;
public String Map3;
public String Map4;
public String Map5;
private JMenuBar s1=new JMenuBar();
private JMenuBar s2=new JMenuBar();
private JLabel jl1=new JLabel();
private JLabel jl2=new JLabel();
private JLabel jl3=new JLabel();
private JLabel jl4=new JLabel();
private JButton btn1=new JButton(Map1);
private JButton btn2=new JButton(Map2);
private JButton btn3=new JButton(Map3);
private JButton btn4=new JButton(Map4);
private JButton btn5=new JButton(Map5);
public MoveFrom(){
	this(null,true);
}
public MoveFrom(Frame owner,boolean modal){
	super(owner,modal);
	this.init();
	this.addComponent();
	this.addListener();
}
public void init(){
	this.setTitle("世界");
	this.setSize(500,750);
	GUI.center(this);
	this.setResizable(false);
}
private void addComponent(){
	jl1.setBounds(100,100,100,100);
}
private void addListener(){

}
}
