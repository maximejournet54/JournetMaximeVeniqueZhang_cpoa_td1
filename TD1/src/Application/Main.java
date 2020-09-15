package Application;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
	  
	   int id_categorie=0;
	   int id_client=0;
	   int id_produit=0;
       System.out.println("faites un choix: 1=Categorie, 2=Client, 3=Produit");
       Scanner sc=new Scanner(System.in);
       int i=sc.nextInt();
      
       if(i==1) {
    	   System.out.println("choisissez une action: 1= Ajouter, 2= Supprimer, 3= Mettre a jour, 4= Afficher");
    	  int choix=sc.nextInt();
    	   if (choix==1) {
    		   System.out.println("Saisir id_categorie, titre et visuel");
    		   id_categorie=sc.nextInt();
    		   String titre=sc.next();
    		   String visuel=sc.next();
    		   
    		   Categorie.add(id_categorie, titre, visuel);
    	   }
    	   if (choix==2) {
    		   System.out.println("Saisir id_categorie");
    		   System.out.println("Saisir id_categorie");
    		   id_categorie=sc.nextInt();
    		   Categorie.delete(id_categorie);
    	   }
    	   if (choix==3) {
    		   System.out.println("Saisir id_categorie");
    		   id_categorie=sc.nextInt();
    		   Categorie.update(id_categorie);
    	   }
    	   
    	   if (choix==4) {
    		   Categorie.AfficherCategorie();
    	   }
       }
    	   
    	   
    	   else if(i==2) {
    		   System.out.println("choisissez une action: 1= Ajouter, 2= Supprimer, 3=Mettre a jour");
    		   int choix2=sc.nextInt();
    		   if(choix2==1){
        		   System.out.println("Saisir id_client, nom, prenom, identifiant, mdp, numero de rue, rue, cp, ville,pays");
        		   id_client=sc.nextInt();
        		   String nom=sc.next();
        		   String prenom=sc.next();
        		   
        		   Categorie.add(id_client, nom, prenom);
        	   }
    		   
        	   if (choix2==2) {
        		   System.out.println("Saisir id_client");
        		   id_client=sc.nextInt();
        		   Client.delete(id_client);
        	   }
        	   
        	   if (choix2==3) {
        		   System.out.println("Saisir id_client");
        		   id_client=sc.nextInt();
        		   Client.update(id_client);
        	   }
        	   
        	   if (choix2==4) {
        		   Client.AfficherClient();
        	   }
    	   }
    	   
    	   else if(i==3) {
    		   System.out.println("choisissez une action: 1= Ajouter, 2= Supprimer, 3=Mettre a jour, 4= Afficher");
    		   int choix3=sc.nextInt();
    		   if(choix3==1){
        		   System.out.println("Saisir id_produit, nom, description, tarif, visuel, id_categorie");
        		   id_produit=sc.nextInt();
        		   String nom=sc.next();
        		   String prenom=sc.next();
        		   String description=sc.next();
        		   int tarif=sc.nextInt();
        		   String visuel=sc.next();
        		   int id_categorie2=sc.nextInt();
        		   
        		   Produit.add(id_produit, nom, description, tarif, visuel, id_categorie2);
        	   }
    		   
        	   if (choix3==2) {
        		   System.out.println("Saisir id_produit");
        		   id_produit=sc.nextInt();
        		   Client.delete(id_produit);
        	   }
        	   
        	   if (choix3==3) {
        		   System.out.println("Saisir id_client");
        		   id_produit=sc.nextInt();
        		   Client.update(id_produit);
        	   }
        	   
        	   if (choix3==4) {
        		   Produit.AfficherProduit();
        	   }
    		   
    	   }
       
       }
   
   
       
   }
       
       
      
       
       

    


