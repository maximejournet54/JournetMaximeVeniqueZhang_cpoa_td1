package Application;

public class Main {

    public static void main(String[] args, int i) {
        //test fonctions Categorie
       Categorie.delete(1);
       Categorie.add(1, "Journet", "photo.png");
       Categorie.update(1);

       //test fonctions client
       Client.delete(1);
       Client.add(1, "Journet", "Maxime", "mdp", 4, "Belle Isle", 57000, "Metz", "France");
       Client.update(1);

       //test fonctions produit
       Produit.delete(2);
       Produit.add(2, "La bible", "c'est le livre de culte des chretiens", 20.0, "bible.png", 1);
       Produit.update(2);

    }

}
