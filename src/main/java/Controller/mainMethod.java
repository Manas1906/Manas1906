package Controller;

import DAO.UpdateTheObjectFromDTOClass;
import DTO.CreateTable;

public class mainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateTable createTable=new CreateTable();
		UpdateTheObjectFromDTOClass updated=new UpdateTheObjectFromDTOClass();
		
		createTable.setAcc_id(2);
		createTable.setAcc_name("Mohit");
		createTable.setAcc_eid("Mohit@gmail.com");
		createTable.setPh_no(872732124);
		
		updated.update(createTable);
		System.out.println("Updated Successfully");
	}

}
