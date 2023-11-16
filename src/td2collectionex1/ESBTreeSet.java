/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package td2collectionex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author hammi
 */
public class ESBTreeSet implements Universite {

    Set<Etudiant> s;
    Comparator<Etudiant> com = new Comparator<Etudiant>() {
     @Override 
     public int compare(Etudiant e1,Etudiant e2){
              return e1.getNom().compareTo(e2.getNom());
     }
    };

    public ESBTreeSet() {
        this.s = new TreeSet<Etudiant>();
    }

    @Override
    public void ajouterEtudiant(Etudiant e) {
        
                s.add(e);
               System.out.println("Ajout d'etudiant "+e.getNom()+" Avec succes");
            
    }

    @Override
    public boolean rechercherEtudiant(Etudiant e) {
        return s.contains(e);
    }

    @Override
    public boolean rechercherEtudiant(String nom) {
        for (Etudiant e : s) {
            if (e.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void supprimerEtudiant(Etudiant e) {
        if (rechercherEtudiant(e) ) {
            s.remove(e);
            System.out.println(e.getNom() + " A ete supprimer de la liste");

        } else {
            System.err.println("Etudiant " + e.getNom() + " n existe pas");
        }

    }

    @Override
    public void afficherEtudiants() {
        for (Etudiant e : s) {
            System.out.println(e);
        }
    }

    // maghir trie par id khater deja treeset toul taamlelhom tree dans l'insertion w hne aaml'ha bel id 
    @Override
    public void trierEtudiantsParId() {
        afficherEtudiants();
    }

    
    @Override
    public void trierEtudiantsParNom() {
        ArrayList<Etudiant> a = new ArrayList<>(s);
       Collections.sort(a,com);
       for (Etudiant e : a){
          System.out.println(e);
      }
    }
    
    
    
    }


