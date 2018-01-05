package Hero.view;

import java.awt.Font;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import Hero.tools.GUI;

@SuppressWarnings("serial")
public abstract class SLFrom extends JDialog{
	private JLabel jl= new JLabel();
	private JScrollPane Js=new JScrollPane();
	protected JTable table=new JTable();
	public static  JLabel jl2=new JLabel();
	private JLabel jl3=new JLabel();
	public SLFrom() {
		this(null,true);
	}
	public SLFrom(Frame owner,boolean modal){
		
		super(owner,modal);
		this.init();
		this.addComponent();
		this.addMouseClicked();
	}
	private void init(){
		this.setTitle("东山再起");
		this.setSize(600,400); 
		GUI.center(this);	
		/*File s=new File("2.wav");
		Playmusic.PlayMusic(s);*/
		ImageIcon img=new ImageIcon("Images/存档框.png");
		JLabel titleLabel=new JLabel(img);
		titleLabel.setBounds(-1,-1,this.getWidth(),this.getHeight());
		this.getLayeredPane().add(titleLabel,new Integer(Integer.MIN_VALUE));
		JPanel btnPanel1 =(JPanel)this.getContentPane();
		btnPanel1.setOpaque(false);
		
	}

	private void addComponent(){
		this.setLayout(null);
		jl.setBounds(175,0,220,70);
		jl3.setBounds(420,250,120,30);
		jl2.setBounds(50,250,120,30);
		jl.setIcon(new ImageIcon("Images/漫漫往事.png"));
		jl3.setIcon(new ImageIcon("Images/删除往事.png"));
		this.add(jl);
		this.add(jl2);
		this.add(jl3);
		table.getTableHeader().setReorderingAllowed(false);	//列不能移动
		table.getTableHeader().setResizingAllowed(false); 	//不可拉动表格
		table.getTableHeader().setFont(new Font("楷体", Font.PLAIN, 25));
		table.setFont(new Font("楷体",Font.PLAIN,18));
		 table.setRowHeight(30);
		Js.setBounds(40, 80, 500, 168);	
		Js.setOpaque(false);
		Js.getViewport().setOpaque(false);
		Js.setBorder(BorderFactory.createEmptyBorder());
		table.setSelectionBackground(new java.awt.Color(85, 171, 237));//
		Js.setViewportView(table);					//视口装入表格
		this.add(Js);
	}
	private void addMouseClicked(){
		jl3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int selIndex = table.getSelectedRow() ;//得到所选行号
				String mingzi=(String)table.getValueAt(selIndex, 0);
				System.out.println(mingzi);
				delpeople(mingzi);
			}
		});
	}
	public abstract void peopleloading();
	public abstract void delpeople(String delname);

}
