

public class Categorie {
    
    public void Add(int id_categorie, String titre){
        PreparedStatement requete = prepareStatement("select id_categorie, titre from categorie where titre=? and id_categorie=?");
        requete.setString(1, id_categorie);
        requete.setString(2, titre);
        ResultSet res = requete.executeQuery();
    }

    public void Modify(int id_categorie, String titre){
        PreparedStatement req = laConnexion.prepareStatement("insert into categorie (id_categorie, titre) values(?, ?)");
    }

    public void Delete(int id_categorie){
        Statement requete = laConnexion.createStatement();
        int nbLignes = requete.executeUpdate("delete from categorie where id_categorie=" + id_categorie);
    }

}
