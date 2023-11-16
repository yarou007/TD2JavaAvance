/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package td2collectionex1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author hammi
 */
public class L2ArrayList implements Universite {
    
     private List<Etudiant> LE ;
    
    // instastiation interface compartor 
    Comparator<Etudiant> com = new Comparator<Etudiant>() {
        @Override
        public int compare(Etudiant e1,Etudiant e2){
             return e1.getNom().compareTo(e2.getNom());
        }
    };
    
    //Constructeur par defaut pour initialise el list avec new ArrayList
    public L2ArrayList() {
        this.LE = new ArrayList<Etudiant>();
    }
    
    @Override
    public void ajouterEtudiant(Etudiant e) {
      
            if (rechercherEtudiant(e) ){
                System.out.println("Etudiant "+e.getNom()+" Existe deja ");
            }
            else {
                LE.add(e);
                System.out.println("Ajout d'etudiant "+e.getNom()+" Avec succes");
            }
        
    }

    @Override
    public boolean rechercherEtudiant(Etudiant e) {
        return LE.contains(e);
    }

    @Override
    public boolean rechercherEtudiant(String nom) {
        for (Etudiant e : LE){
            if (e.getNom().equals(nom)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void supprimerEtudiant(Etudiant e) {
   
            if (rechercherEtudiant(e)){
                LE.remove(e);
                System.out.println(e.getNom()+" A ete supprimer de la liste");
               
            }
            else System.err.println("Etudiant "+e.getNom()+" n existe pas");
    }

    @Override
    public void afficherEtudiants() {
       /* for(Etudiant e:LE){
            System.out.println(e);
        }*/
        Iterator<Etudiant> it = this.LE.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        /* Parcours fil list w vector mayjish fil hashet
        for (int i = 0; i < LE.size(); i++) {
            System.out.println(LE.get(i));
        }*/
        //System.out.println(LE);
        
    }

    @Override
    public void trierEtudiantsParId() {
        
        Collections.sort(LE);
    }

    @Override
    public void trierEtudiantsParNom() {
        Collections.sort(LE,com);
        
        /*Collections.sort(LE, new Comparator<Etudiant>(){
            @Override
           public int compare(Etudiant e1,Etudiant e2){
             return e1.getNom().compareTo(e2.getNom());
        }
            
        });*/
    }
    
}
