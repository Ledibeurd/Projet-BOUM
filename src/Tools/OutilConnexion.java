package Tools;

import java.sql.Connection;
import java.sql.SQLException;

public class OutilConnexion
{
	private static OutilConnexion instance;
	private static Connection conn;
	
	private OutilConnexion() {
            conn = creer();
        }
	
	public static Connection getInstance()
	{
		try
		{
			if (instance == null || conn.isClosed())
			{
				synchronized(OutilConnexion.class) {
					if (instance == null || conn.isClosed())
						instance = new OutilConnexion();
				}
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
			conn = null;
		}
		return conn;
	}
	
        public Connection creer()
	{
		String url = "jdbc:sqlserver://serveur-sql2012\\server2012; databaseName = Zero";
		try
		{
			conn = java.sql.DriverManager.getConnection(url, "bouleghlem", "bouleghlem");
		}
		catch (Exception e)
		{
			System.out.println("Connexion échouée ! " + e.getMessage());
		}
		return conn;
	}
        
	public Connection creer(String serveur, String db, String login, String pswd)
	{
		String url = "jdbc:sqlserver://serveur-sql2012\\server2012; databaseName = AirHelloWorld";
		try
		{
			conn = java.sql.DriverManager.getConnection(url, "rambaud", "12livrebleu!");
		}
		catch (Exception e)
		{
			System.out.println("Connexion échouée ! " + e.getMessage());
		}
		return conn;
	}
	
	public void close()
	{
		try
		{
                    if ( conn != null && !conn.isClosed())
			conn.close();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
        
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		throw new CloneNotSupportedException();
	}
}
