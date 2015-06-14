import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Bdd {
	private static Connection connDb;
	public static void openConnexion(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://192.168.56.101/ContactFinder";
			connDb = DriverManager.getConnection(url, "root", "teop1607");

			if (connDb != null){
				System.out.println("DataBase connectée");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e){
			e.printStackTrace();
		}

	}

	public static void closeConnexion(){
		try {
			connDb.close();
			System.out.println("DataBase déconnectée");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static ResultSet executeQuery(String pSqlQuery){
		Statement stmt = null;
		ResultSet retVal = null;
		try {
			stmt = connDb.createStatement();
			retVal = stmt.executeQuery(pSqlQuery);
		} catch (SQLException e) {
			stmt = null;
		}

		return retVal;
	}


	public static int executeUpdate(String pSQLUpdate) {
		// A utiliser pour toutes les requêtes de type INSERT, DELETE et UPDATE
		Statement stmt = null;
		int retVal = 0;
		try {
			stmt = connDb.createStatement();
			retVal = stmt.executeUpdate(pSQLUpdate);
		} catch (SQLException e) {
			stmt = null;
		}

		return retVal;
	}
	

}