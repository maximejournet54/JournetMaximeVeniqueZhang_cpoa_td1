/*  
 *  Il est important d'importer ces classe inclus dans l'extension 
 *  MySQL Connector que je vous ai fait récupérer auparavant.
 */
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                // Votre fonction Run
                // Vos information de connexion à une base de données
                String BDD = "journet9u_tdcpoa";
                String url = "jdbc:mysql://localhost:3306/" + BDD;
                String user = "root";
                String passwd = "root";
                // L'essai de connexion à votre base de données
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn = DriverManager.getConnection(url, user, passwd);
                    System.out.println("Connecter");
                } catch (Exception e){
                    e.printStackTrace();
                    System.out.println("Erreur");
                    System.exit(0);
                }
            }
        });
        Connexion c=new Connexion();
}
}
