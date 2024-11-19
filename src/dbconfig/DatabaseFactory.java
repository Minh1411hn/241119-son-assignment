package src.dbconfig;

import src.dbconfig.Database;
import src.dbconfig.DatabaseType;

public class DatabaseFactory {
    public static Database getInstance(DatabaseType type) {
        switch (type) {
            case MYSQL: return new MySQLDatabase();
            case SQLITE: /* Return SQLiteDatabase instance */ break;
            default: throw new IllegalArgumentException("Invalid database type.");
        }
        return null;
    }
}
