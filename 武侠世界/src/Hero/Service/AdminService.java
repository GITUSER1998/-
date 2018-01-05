package Hero.Service;

import java.util.ArrayList;
import Hero.AdminDao.*;
import Hero.domain.*;

public class AdminService {
	private Admindao adminDao = new Admindao();	
	//查询服务
	public ArrayList<People> peopleloading() {
		ArrayList<People> data = adminDao.peopleload();
		return data;
}
	public boolean delPeopleing(String delname) {
		ArrayList<People> data=peopleloading();
		for(int i=0;i<data.size();i++){
			People people=data.get(i);
			if(delname.equals(people.getName())){
				adminDao.delPeople(delname);
				return true;
				}
			}
		return false;
	}
}
