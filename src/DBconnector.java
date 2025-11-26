import java.sql.*;

public class DBconnector {

    Connection connection;

    public void connect(String url) {
        try {
            connection = DriverManager.getConnection(url);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public void selectAllPlayers() {
        try {
            String sql = "Select * From Players";

                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery(sql);

                while (rs.next()) {
                    System.out.println(rs.getString("name"));
                }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void addPlayer(String name,int balance, int position, boolean currentplayer){
        String sql = "Insert into players(name, blaance, position, currentPlayer) VALUES (" + name + ",balance, position, currentplayer";


    }
}

