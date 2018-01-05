package Hero.tools;

import java.awt.Component;
import java.awt.Toolkit;

import javax.swing.JFrame;

import Hero.view.MainFrom;
import Hero.view.SLFrom;

public class GUI {
		static Toolkit kit = Toolkit.getDefaultToolkit();
		public static void center(Component c) {
			int x = (kit.getScreenSize().width - c.getWidth()) / 2;
			int y = (kit.getScreenSize().height - c.getHeight()) / 2;
			c.setLocation(x, y);
		}
		public static void setTitleImage(MainFrom mainFrame,String titleIconPath) {
			mainFrame.setIconImage(kit.createImage(titleIconPath));
		}

		} 
