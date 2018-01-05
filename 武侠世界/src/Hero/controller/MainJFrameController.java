package Hero.controller;

import javax.swing.ImageIcon;

import Hero.view.MainFrom;
import Hero.view.SLFrom;

@SuppressWarnings("serial")
public class MainJFrameController extends MainFrom{
@Override
public void showMoveFrom(){
	new MoveFromController(this,true).setVisible(true);
	System.gc();
}
public void showSLFrom(){
		SLFrom.jl2.setIcon(new ImageIcon("Images/读取往事.png"));
	new SLFromController(this,true).setVisible(true);
	System.gc();
}
public void showCheckFrom(){
	new CheckController(this,true).setVisible(true);
	System.gc();
}
}
