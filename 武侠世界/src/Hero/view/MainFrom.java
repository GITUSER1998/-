package Hero.view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Hero.tools.GUI;

@SuppressWarnings("serial")
public abstract class MainFrom extends JFrame{
	JPanel btnPanel = new JPanel();
	private JLabel jl1=new JLabel();
	private JLabel jl2=new JLabel();
	private JLabel jl3=new JLabel();
	private JLabel ztk=new JLabel();
	private JLabel xt=new JLabel();
	private JLabel lt=new JLabel(); 
	private JLabel tx=new JLabel();
public MainFrom(){

	this.init();
	this.addComponent();
	this.mouseClicked();
	ImageIcon img=new ImageIcon("Images/封面.jpg");
	JLabel titleLabel=new JLabel(img);
	titleLabel.setBounds(-1,-1,this.getWidth(),this.getHeight());
	this.getLayeredPane().add(titleLabel,new Integer(Integer.MIN_VALUE));
	JPanel btnPanel1 =(JPanel)this.getContentPane();
	btnPanel1.setOpaque(false);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  

}

private void init(){	
	this.setTitle("武侠世界");
	this.setSize(550,390);
	GUI.center(this);
	GUI.setTitleImage(this, "Images/武.png");
	this.setResizable(false);
	
}
private void addComponent(){
	JPanel btnPanel = new JPanel();
	btnPanel.setLayout(null);
	btnPanel.setOpaque(false);
	this.add(btnPanel);
    jl1.setBounds(180,70,220,50);
    btnPanel.add(jl1);
	jl2.setBounds(180, 170, 220, 50);
	btnPanel.add(jl2);
	jl3.setBounds(180, 270, 220, 50);
	ztk.setBounds(0,0,256,105);
	xt.setBounds(84,31,144,14);
	lt.setBounds(89,49,130,13);
	tx.setBounds(28,8,90,90);
	btnPanel.add(jl3);
	btnPanel.add(xt);
	btnPanel.add(lt);	
	btnPanel.add(ztk);
	btnPanel.add(tx);
	jl1.setIcon(new ImageIcon("Images/初入江湖.png"));
	jl2.setIcon(new ImageIcon("Images/东山再起.png"));
	jl3.setIcon(new ImageIcon("Images/退隐山林.png"));
	xt.setIcon(new ImageIcon("Images/血条.png"));	
	ztk.setIcon(new ImageIcon("Images/状态框.png"));
	lt.setIcon(new ImageIcon("Images/蓝条.png"));	
	tx.setIcon(new ImageIcon("Images/头像1.jpg"));

}
private void mouseClicked() {
	jl1.addMouseListener(new MouseAdapter()
	{

		public void mouseClicked(MouseEvent e){
			showCheckFrom();
		}
		
	});
	jl2.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			showSLFrom();
		}
	});
	jl3.addMouseListener(new MouseAdapter(){
		public void mouseClicked(MouseEvent e){
			int result=JOptionPane.showConfirmDialog(null, "退隐山林", "确认退隐山林", JOptionPane.YES_NO_OPTION);
			if(result==JOptionPane.YES_OPTION){
				System.exit(0);
			}
		}
	});

}	

public abstract void showSLFrom();
public abstract void showMoveFrom();
public abstract void showCheckFrom();
}