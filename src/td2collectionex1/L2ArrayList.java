/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package td2collectionex1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author hammi
 */
public class L2ArrayList implements Universite {
    
    List<Etudiant> LE ;
    Comparator<Etudiant> com = new Comparator<Etudiant>() {
        
        @Override
        public int compare(Etudiant e1,Etudiant e2){
             return e1.getNom().compareTo(e2.getNom());
        }
    };
    public L2ArrayList() {
        this.LE = new ArrayList<Etudiant>();
    }
    
    @Override
    public void ajouterEtudiant(Etudiant e) {
      
            if (rechercherEtudiant(e) && rechercherEtudiant(e.getNom())){
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
   
            if (rechercherEtudiant(e) && rechercherEtudiant(e.getNom())){
                LE.remove(e);
                System.out.println(e.getNom()+" A ete supprimer de la liste");
               
            }
            else System.err.println("Etudiant "+e.getNom()+" n existe pas");
        
    }

    @Override
    public void afficherEtudiants() {
        for(Etudiant e:LE){
            System.out.println(e);
        }
    }

    @Override
    public void trierEtudiantsParId() {
        Collections.sort(LE);
    }

    @Override
    public void trierEtudiantsParNom() {
        Collections.sort(LE,com);
    }
    
}
