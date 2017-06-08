package com.oracle.tutorial1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.beans.Person;

public class ConnectToOracle {

	public static void main(String[] args) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection = null;
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "soujanya", "Hello123");
			Statement statement = connection.createStatement();
			ResultSet rs=statement.executeQuery("select * from EMPLOYEE_TABLE");
			//System.out.println(statement.executeUpdate("INSERT INTO EMPLOYEE_TABLE (ID, FIRST_NAME, LAST_NAME, AGE, DESIGNATION, SUPERVISOR_EMPLOYEE_ID) values (6, 'SHARADA', '', 25,'MD',5)"));
			//*System.out.println(statement.executeUpdate("UPDATE EMPLOYEE_TABLE SET LAST_NAME='Panda' where LAST_NAME='PANDALU'"));*/

			//Initialize a list here
			List<Person> personList= new ArrayList<Person>();
			while (rs.next()) {
				Person p=new Person(rs.getString("FIRST_NAME"),rs.getString("LAST_NAME"));
				/*p.setFirstName(rs.getString("FIRST_NAME"));
				p.setLastName(rs.getString("LAST_NAME"));
				p.setDesignation(rs.getString("DESIGNATION"));
				p.setAge(rs.getInt("AGE"));
				p.setSupervisorID(rs.getInt("SUPERVISOR_EMPLOYEE_ID"));*/
				//Add the person p to the list here
				personList.add(p);
				
			}
			
			//write a for loop and print the parson
			/*for(int i=0;i<personList.size();i++){
				System.out.println(personList.get(i).getFirstName());
				System.out.println(personList.get(i).getLastName());
				System.out.println(personList.get(i).getAge());
			}*/
			
			//advanced for loop
			for(Person person: personList){
				System.out.println(person);
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {

		}

	}
}
