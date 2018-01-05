package Hero.controller;

import java.awt.Frame;

import Hero.Service.AdminService;
import Hero.view.MoveFrom;

@SuppressWarnings("serial")
public class MoveFromController extends MoveFrom{
	@SuppressWarnings("unused")
	private Hero.Service.AdminService adminService=new AdminService();
	public MoveFromController(){
		super();
	}
	public MoveFromController(Frame owner, boolean modal) {
		super(owner,modal);
	}
}
