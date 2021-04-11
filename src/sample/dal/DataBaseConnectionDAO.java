package sample.dal;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import sample.utils.config.DBConfigReader;

import java.io.IOException;
import java.sql.Connection;
import java.io.IOException;
import java.sql.SQLException;

public class DataBaseConnectionDAO {

    private static SQLServerDataSource dataSource;

    public DataBaseConnectionDAO() {

        dataSource = new SQLServerDataSource();
        dataSource.setServerName( "10.176.111.31" );
        dataSource.setDatabaseName( "Compulsory_Assignment_2" );
        dataSource.setUser( "CSe20B_7" );
        dataSource.setPassword( "CSe20B_7" );
        dataSource.setPortNumber( 1433 );
    }

    public static Connection getConnection() throws SQLServerException {
        return dataSource.getConnection();
    }

    public static void main(String[] args) throws SQLException {

        DataBaseConnectionDAO dataBaseConnectionDAO = new DataBaseConnectionDAO();
        Connection connection = dataBaseConnectionDAO.getConnection();

        System.out.println( "Is it Open?" + !connection.isClosed() );

        connection.close();
    }
}
