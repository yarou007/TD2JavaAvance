/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package td2collectionex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author hammi
 */
public class TD2CollectionEx1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //// Classe Vector
        // Instantation
       /* Etudiant e1 = new Etudiant (2,"Yassine","P");
        Etudiant e2 = new Etudiant (9,"Eya","P");
        Etudiant e3 = new Etudiant (7,"Slim","P");
        Etudiant e4 = new Etudiant (3,"Salma","P");
        Etudiant e5 = new Etudiant (8,"Nour","P");
         
        //Tester methode equals 
       // System.out.println(e1.equals(e2));
       
        L2Vector vec = new L2Vector();
        vec.ajouterEtudiant(e1);
        vec.ajouterEtudiant(e2);
        vec.ajouterEtudiant(e3);
        vec.ajouterEtudiant(e4);
        vec.ajouterEtudiant(e5);
        vec.afficherEtudiants();
      //  System.out.println(vec.rechercherEtudiant(e4));
      // System.out.println(vec.rechercherEtudiant("Ahmed"));
       vec.supprimerEtudiant(e4);
       // vec.afficherEtudiants();
      
        vec.trierEtudiantsParId();
          System.out.println("Trier par id: ");
        vec.afficherEtudiants();
        System.out.println("--------------------");
        System.out.println("Trier par nom: ");
        vec.trierEtudiantsParNom();
        vec.afficherEtudiants();
        */
        
        /// Instantiation de classe L2ArrayList
       /* L2ArrayList l = new L2ArrayList();
        Etudiant e1 = new Etudiant (2,"Yassine","P");
        Etudiant e2 = new Etudiant (9,"Eya","P");
        Etudiant e3 = new Etudiant (7,"Slim","P");
        Etudiant e4 = new Etudiant (3,"Aroua","P");
        Etudiant e5 = new Etudiant (8,"Nour","P");
        Etudiant e6 = new Etudiant (10,"Ahmed","P");
        l.ajouterEtudiant(e1);
        l.ajouterEtudiant(e2);
        l.ajouterEtudiant(e3);
        l.ajouterEtudiant(e4);
        l.ajouterEtudiant(e5);
        l.afficherEtudiants();
        System.out.println("Suppression: ");
        l.supprimerEtudiant(e2);

        l.afficherEtudiants();
        System.out.println("Trier par ID : ");
        l.trierEtudiantsParId();
        l.afficherEtudiants();
        System.out.println("Trier par Nom : ");
        l.trierEtudiantsParNom();
        l.afficherEtudiants();
       
       // HashSet
       /* Etudiant e1 = new Etudiant (2,"Yassine","P");
        Etudiant e2 = new Etudiant (1,"Eya","P");
        Etudiant e3 = new Etudiant (7,"Slim","P");
        Etudiant e4 = new Etudiant (3,"Aroua","P");
        Etudiant e5 = new Etudiant (8,"Nour","P");
        Etudiant e6 = new Etudiant (10,"Ahmed","P");
        L2HashSet h =  new L2HashSet();
         h.ajouterEtudiant(e1);
        h.ajouterEtudiant(e2);
        h.ajouterEtudiant(e3);
        h.ajouterEtudiant(e4);
        h.ajouterEtudiant(e5);
        h.afficherEtudiants();
        System.out.println("Trier par id: ");
        h.trierEtudiantsParId();
      //  h.afficherEtudiants();
       System.out.println("Trier par NOM: ");
        h.trierEtudiantsParNom();*/
       
       // TreeSet
        Etudiant e1 = new Etudiant (2,"Yassine","P");
        Etudiant e2 = new Etudiant (1,"Eya","P");
        Etudiant e3 = new Etudiant (7,"Slim","P");
        Etudiant e4 = new Etudiant (3,"Aroua","P");
        Etudiant e5 = new Etudiant (8,"Nour","P");
        Etudiant e6 = new Etudiant (10,"Ahmed","P");
        ESBTreeSet t =  new ESBTreeSet();
         t.ajouterEtudiant(e1);
       t.ajouterEtudiant(e2);
        t.ajouterEtudiant(e3);
        t.ajouterEtudiant(e4);
        t.ajouterEtudiant(e5);
        t.afficherEtudiants();
        System.out.println("Trier par id: ");
        t.trierEtudiantsParId();
      //  h.afficherEtudiants();
       System.out.println("Trier par NOM: ");
        t.trierEtudiantsParNom();
       
    }
    
}
