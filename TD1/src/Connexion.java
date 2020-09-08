import java.sql.*;

public class Connexion {
    public Connection creeConnexion(){
        String url = "jdbc:mysql://devweb.iutmetz.univ-lorraine.fr:3306/journet9u_tdcpoa";
        String login= "journet9u_appli";
        String pwd = "23JAN2001";
        Connection maConnexion=null;

        try {
            maConnexion=DriverManager.getConnection(url, login, pwd);
        } catch (SQLException sqle) {
            System.out.println("Erreur!!!!" +sqle.getMessage());
        }
        return maConnexion;
    }

    public void uneRequete(){
        try {
            Connection laConnexion = creeConnexion();
           Statement requete = laConnexion.createStatement();
           ResultSet res = requete.executeQuery("select no_etudiant, nom_etudiant from etudiant");
           while (res.next()) {
            int no = res.getInt(1);
            String nom = res.getString("nom_etudiant");
            }

            if (res != null)
            res.close();
            if (requete != null)
            requete.close();
            if (laConnexion != null)
            laConnexion.close();
            } catch (SQLException sqle) {
            System.out.println("Pb select" + sqle.getMessage());
            }
    }

   
   
}
