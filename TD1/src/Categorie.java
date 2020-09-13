public class Categorie {
    
    public static void add(int id_categorie, String titre){
        //a completer
    }

    public static void delete(int id_categorie){
        //a changer
        Statement requete= laConnexion.createStatement();
        int nblignes=requete.executeUpdate("delete from categorie where id_categorie=" +id_categorie);
    }

    public static void update(int id_categorie){
        //a changer aussi
        PreparedStatement requete= laConnexion.prepareStatement("delete from categorie where id_categorie=?");
        requete.setInt(1, id_categorie);
        int nblignes=requete.executeUpdate();
    }

}
