import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                String BDD = "VotreBaseDeDonnée";
                String url = ""+BDD;
                String user= "root";
                String passwd = "Vevyilxi2001";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn = DriverManager.getConnection(url,user,passwd);
                    System.out.println("Connecter");
                } catch (Exception e){
                    e.printStackTrace();
                    System.out.println("Erreur");
                    System.exit(0);
                }
            }
        });
    }
}
