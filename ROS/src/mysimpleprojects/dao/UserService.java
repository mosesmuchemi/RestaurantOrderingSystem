package mysimpleprojects.dao;

import java.util.ArrayList;

import mysimpleprojects.restaurant.beans.BillDetails;
import mysimpleprojects.restaurant.beans.Category;
import mysimpleprojects.restaurant.beans.Item;
import mysimpleprojects.restaurant.beans.Login;
import mysimpleprojects.restaurant.beans.OrderDetails;
import mysimpleprojects.restaurant.beans.OrderMaster;

public class UserService
{
	
	
DBConnect dbconnect = new DBConnect();
	
	public ArrayList<Category> getAllCategorys(){
		return dbconnect.getAllCategory();
	}
	public boolean checkLogin(Login login)
	{
		return  dbconnect.checkLogin(login);		
	}
	
	public ArrayList<Item> getAllItems(int catId)
	{
		return dbconnect.getAllItemsByCategory(catId);
	}
	
	public ArrayList<OrderMaster> getAllOrders(int tableNo){
		return dbconnect.getAllOrders(tableNo);
	}
	
	public ArrayList<BillDetails> getBill(int tableNo)
	{
		return dbconnect.getBill(tableNo);
	}
}