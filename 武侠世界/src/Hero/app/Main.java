package Hero.app;

import Hero.controller.MainJFrameController;
import Hero.tools.JDBC;

@SuppressWarnings("unused")
public class Main {
	public static void main(String[] args) {		
		new MainJFrameController().setVisible(true);
   }
}