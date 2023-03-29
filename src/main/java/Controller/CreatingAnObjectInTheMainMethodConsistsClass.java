package Controller;

import DAO.AccessTheObjectFromDTOClass;
import DTO.CreateTable;

public class CreatingAnObjectInTheMainMethodConsistsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         CreateTable createTable=new CreateTable();
         AccessTheObjectFromDTOClass access=new AccessTheObjectFromDTOClass();
         createTable.setAcc_id(1);
         createTable.setAcc_name("Manas");
         createTable.setAcc_eid("manas@gmail.com");
         createTable.setPh_no(123456789);
         
         CreateTable createTable1=new CreateTable();
         createTable1.setAcc_id(2);
         createTable1.setAcc_name("Chandan");
         createTable1.setAcc_eid("chandan@gmail.com");
         createTable1.setPh_no(987654321);
         
         access.insert(createTable);
         access.insert(createTable1);
	}

}
