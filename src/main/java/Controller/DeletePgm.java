package Controller;

import DAO.DeleteTheData;
import DTO.CreateTable;

public class DeletePgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateTable createTable6=new CreateTable();
		DeleteTheData deleted=new DeleteTheData();
		
//		createTable6.setAcc_id(2);
		
		deleted.delete(createTable6);
		System.out.println("deleted successfully");
	}

}
