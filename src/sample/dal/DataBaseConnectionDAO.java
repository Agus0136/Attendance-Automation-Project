package sample.dal;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import sample.utils.config.DBConfigReader;

import java.io.IOException;
import java.sql.Connection;
import java.io.IOException;

public class DataBaseConnectionDAO {

    private DBConfigReader config;
    private SQLServerDataSource dataSource;

    public DataBaseConnectionDAO() {
        try {
            config = new DBConfigReader("db.properties");
            dataSource = new SQLServerDataSource();

            dataSource.setServerName(config.getIP());
            dataSource.setDatabaseName(config.getDBName());
            dataSource.setUser(config.getUsername());
            dataSource.setPassword(config.getPassword());
            dataSource.setPortNumber(1433);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
    }
}