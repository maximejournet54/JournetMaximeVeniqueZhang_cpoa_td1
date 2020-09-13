
public class Main {

    public static void main(String[] args) {
        //test fonctions Categorie
       Categorie.delete(1);
       Categorie.add(1, "Journet");
       Categorie.update(1);

       //test fonctions client
       Client.delete(1);
       Client.add(1, "Journet", "Maxime");
       Client.update(1);

    }

}
