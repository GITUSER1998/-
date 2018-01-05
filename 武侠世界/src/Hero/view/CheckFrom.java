package Hero.view;

import java.awt.CheckboxGroup;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import Hero.tools.GUI;

@SuppressWarnings("serial")
public abstract class CheckFrom extends JDialog{
	public int x=1;
	public String LB;
	public String Lb1;
	public String Lb2;
	public String Lb3;
	JLabel lb1 = new JLabel(LB);
	CheckboxGroup cg = new CheckboxGroup(); 
	JRadioButton r1=new JRadioButton(Lb1,false);
	JRadioButton r2=new JRadioButton(Lb2,false);
	JRadioButton r3=new JRadioButton(Lb3,false);
	ImageIcon img1=new ImageIcon("Images/下一页.png");
	ImageIcon img2=new ImageIcon("Images/上一页.png");
	ImageIcon img3=new ImageIcon("Images/生成人物.png");
	JLabel xyx =new JLabel(img1);
	JLabel syx =new JLabel(img2);
	JLabel rwsd =new JLabel(new  ImageIcon("Images/人物初始设定.png"));
	ButtonGroup bg=new ButtonGroup();
public CheckFrom(){
	this(null,true);
}

public CheckFrom(Frame owner, boolean modal) {
	super(); 
	this.init();
	this.addComponent();
	this.addLister();
	this.CheckInformation();
	this.setUndecorated(true); 
	ImageIcon img=new ImageIcon("Images/check.png");
	JLabel titleLabel=new JLabel(img);
	titleLabel.setBounds(0,0,this.getWidth(),this.getHeight());
	this.getLayeredPane().add(titleLabel,new Integer(Integer.MIN_VALUE));
	JPanel btnPanel1 =(JPanel)this.getContentPane();
	btnPanel1.setOpaque(false);
	System.out.println(x);
}

private void CheckInformation() {
	switch(x){
	case 1:{
		lb1.setText("你是");
		r1.setText("束发");
		r2.setText("豆蔻");
		syx.setVisible(false);
		r3.setVisible(false);break;
	}
	case 2:{
		lb1.setText("出生于");
		r1.setText("武林世家");
		r2.setText("商贾之家");
		r3.setText("名门大派");
		syx.setVisible(true);
		r3.setVisible(true);break;
	}
	case 3:{
		lb1.setText("已春秋");
		r1.setText("10载");
		r2.setText("15载");
		r3.setText("20载");
		
		r3.setVisible(true);break;
	}

	case 4:{
		lb1.setText("立志成为");
		r1.setText("撒金钱，乱抛坠");
		r2.setText("铁骑绕龙城");
		r3.setText("云深不知处");
		img1.getImage().flush();
		xyx.setIcon(img1);
		r3.setVisible(true);break;
	}
	
	
	case 5:{
		lb1.setText("即便为此");
		r1.setText("苟富贵，勿相忘");
		r2.setText("舞剑器动四方");
		r3.setText("采菊东篱下");
	    img3.getImage().flush();
		xyx.setIcon(img3);break;
	}
	}
	
}

private void init() {
	this.setSize(499,299);
	GUI.center(this);
	
	
}

private void addComponent() {
	JPanel xx=new JPanel();
	xx.setLayout(null);
	xx.setOpaque(false);

	
	bg.add(r1); 
	bg.add(r2); 
	bg.add(r3); 
	
	r1.setOpaque(false);
	r2.setOpaque(false);
	r3.setOpaque(false);
	xx.add(lb1);
	xx.add(rwsd);
	xx.add(r1);
	xx.add(r2);
	xx.add(r3);
	xx.add(xyx);
	xx.add(syx);
	
	this.add(xx);
	
	rwsd.setBounds(10,7,200,30);
	lb1.setBounds(90,60,400,20);
	r1.setBounds(90,100,300,20);
	r2.setBounds(90,160,300,20);
	r3.setBounds(90,220,300,20);
	xyx.setBounds(270,220,100,100);
	syx.setBounds(170,220,100,100);
	lb1.setFont(new Font("华文新魏", Font.PLAIN, 25));
	r1.setFont(new Font("华文新魏", Font.PLAIN, 20));
	r2.setFont(new Font("华文新魏", Font.PLAIN, 20));
	r3.setFont(new Font("华文新魏", Font.PLAIN, 20));
}

private void addLister() {
	syx.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			x=x-1;
			CheckInformation();
			System.out.println(x);
		}
	});

	xyx.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			if(x<5){
			x=x+1;
			CheckInformation();
			System.out.println(x);}
			else{
				showPeopleInformation();
			}
		}


	});
}
public  abstract void showPeopleInformation();
}
