package Application;

import java.sql.*;

public class Client {
    public static void add(int id_client, String nom, String prenom, String mdp, int num, String voie, int cp, String ville, String pays){
        try {
            Connection laConnexion = Connexion.creeConnexion();
            Statement requete= laConnexion.createStatement();
            String query="INSERT INTO client VALUES("+id_client+",'"+nom+"','"+prenom+"','"+mdp+"','"+num+"','"+voie+"','"+cp+"','"+ville+"','"+pays+"')";
            requete.executeUpdate(query);
            System.out.println("Produit ajoute");
        } catch(SQLException sqle){
            System.out.println("Probleme select:" +sqle.getMessage());
        }            
    }

    public static void delete(int id_client){
        try {
            Connection laConnexion = Connexion.creeConnexion();
            Statement requete= laConnexion.createStatement();
            String query="delete from client where id_client="+id_client;
            requete.executeUpdate(query);
            System.out.println("client supprime");
            } catch(SQLException sqle){
            System.out.println("Probleme select:" +sqle.getMessage());
        }          
    }

    public static void update(int id_client){
        try {
            Connection laConnexion = Connexion.creeConnexion();
            Statement requete= laConnexion.createStatement();
            String query="update from produit where id_client="+id_client;
            requete.executeUpdate(query);
            System.out.println("client mis a jour");
            } catch(SQLException sqle){
            System.out.println("Probleme select:" +sqle.getMessage());
        }  
    }
}
    

