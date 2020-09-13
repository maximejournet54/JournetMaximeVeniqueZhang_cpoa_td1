public class Produit {
    
    public void Add(int id_produit, String nom){
        PreparedStatement requete = prepareStatement("select id_categorie, titre from categorie where nom=? and id_produit=?");
        requete.setString(1, id_produit);
        requete.setString(2, nom);
        ResultSet res = requete.executeQuery();
    }

    public void Modify(int id_produit, String nom){
        PreparedStatement req = laConnexion.prepareStatement("insert into produit (id_produit, nom) values(?, ?)");
    }

    public void Delete(int id_produit){
        Statement requete = laConnexion.createStatement();
        int nbLignes = requete.executeUpdate("delete from categorie where id_produit=" + id_produit);
    }
}
