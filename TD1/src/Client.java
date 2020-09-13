public class Client {

    public void Add(int id_client, String nom, String prenom){
        PreparedStatement requete = 
        prepareStatement("select id_client, nom, prenom from categorie where id_client=? and nom=? and prenom=? ");
        requete.setString(1, id_client);
        requete.setString(2, nom);
        requete.setString(3, prenom);
        ResultSet res = requete.executeQuery();
    }

    public void Modify(int id_client, String nom, String prenom){
        PreparedStatement req = laConnexion.prepareStatement("insert into client (id_client, nom, prenom) values(?, ?, ?)");
    }

    public void Delete(int id_client){
        Statement requete = laConnexion.createStatement();
        int nbLignes = requete.executeUpdate("delete from categorie where id_client=" + id_client);
    }
}
