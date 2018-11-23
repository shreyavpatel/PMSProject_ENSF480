package control;

import java.sql.SQLException;

public class ProcessInventoryController extends Driver {
	public ProcessInventoryController()
	{
		super();
	}
	
	//Adds order to the database
	public void order(String type, int item, int quantity, int cvv, int card )
	{
		System.out.println("In order");
		String sql = "INSERT INTO " + orderTable +
				" (`document_id`, `quantity`, `payment_type`, `card_number`, `payment_cvv` ) " +
				 " VALUES ("+ item +", " + quantity +", '" + type +"', " + card +", " + cvv + ")";
		System.out.println(sql);
		try{
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}