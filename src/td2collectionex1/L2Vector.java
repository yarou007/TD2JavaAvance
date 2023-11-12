/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package td2collectionex1;

import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

/**
 *
 * @author hammi
 */
public class L2Vector implements Universite {

    Vector<Etudiant> v; 
    Comparator<Etudiant> com = new Comparator<Etudiant>() {
        @Override
        public int compare(Etudiant o1, Etudiant o2) {
              return o1.getNom().compareTo(o2.getNom());
                    
    }
    };
    
    public L2Vector(){
        this.v = new Vector<Etudiant>();  
    }
    @Override
    public void ajouterEtudiant(Etudiant e) {
            if (rechercherEtudiant(e) && rechercherEtudiant(e.getNom())){
                System.err.println("Etudiant " +e.getNom()+ "Existe deja ");
            } else  
            {
                v.add(e);
                System.out.println("ajout succés");
            }
        }
      
    @Override
    public boolean rechercherEtudiant(Etudiant e) {
          return v.contains(e);
             
    }

    @Override
    public boolean rechercherEtudiant(String nom) {
    for (Etudiant e : v){
      if( e.getNom().equals(nom)){
          return true;
      }
       
     }return false;
    }

    @Override
    public void supprimerEtudiant(Etudiant e) {
 
        for (int i=0;i<v.size();i++){
            if (rechercherEtudiant(e) ){
                System.err.println(e.getId()+ " A ete supprimer");
                v.remove(e);
                
                break;
            }  
        }
    }
    @Override
    public void afficherEtudiants() {
        for (Etudiant e : v ){
            System.out.println(e);
        }
    }
    
    @Override
    public void trierEtudiantsParId() {
        Collections.sort(v);       
    }

    @Override
    public void trierEtudiantsParNom() {
        Collections.sort(v,com);
    }
    
}
