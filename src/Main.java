public class Main {
    public static void main(String[] args) {
 System.out.println("Hello world");

 DBconnector db = new DBconnector();
 String url = "jdbc:sqlite:C:/Users/lullu/IntProjects/Databasetrening/identifier.sqlite";

 db.connect(url);
 db.selectAllPlayers();
 db.addPlayer("Kjeld", 2000, 20, false);
    }
}
