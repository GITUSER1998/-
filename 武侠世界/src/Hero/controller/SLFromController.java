package Hero.controller;

import java.awt.Frame;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import Hero.domain.People;
import Hero.Service.AdminService;
import Hero.view.SLFrom;

@SuppressWarnings("serial")
public  class SLFromController extends SLFrom{
	private Hero.Service.AdminService adminService=new AdminService();
	public SLFromController() {
		super();

		}	
	public SLFromController(Frame owner, boolean modal) {
			super(owner, modal);
			peopleloading();
	}
	@Override
	public void peopleloading() {
		String[] thead = {"姓名","等级","性别","年龄"};
		ArrayList<People> dataList = adminService.peopleloading();
		String[][] tbody = list2Array(dataList);
		TableModel dataModel = new DefaultTableModel(tbody, thead);
		table.setModel(dataModel);
	}
	public String[][] list2Array(ArrayList<People> list){		
		String[][] tbody = new String[list.size()][4];	
		for (int i = 0; i < list.size(); i++) {
			People people = list.get(i);
			tbody[i][0] = people.getName();
			tbody[i][1] = people.getLevel();
			tbody[i][2] = people.getSex();
			tbody[i][3] = people.getAge();
		}		
		return tbody;
	}
	@Override
	public void delpeople(String delname) {
		// TODO Auto-generated method stub
		
				boolean delSuccess=adminService.delPeopleing(delname);
		if(delSuccess) {
			peopleloading();
		}else {
			JOptionPane.showMessageDialog(this, "没有这件往事！");
		}
	}
}
