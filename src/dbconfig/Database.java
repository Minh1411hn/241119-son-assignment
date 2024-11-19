package src.dbconfig;

import java.sql.Connection;

public interface Database {
    Connection connect();
    void disconnect();
}
