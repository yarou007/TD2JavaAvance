/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package td2collectionex1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author hammi
 */
public class L2HashSet implements Universite{

    Set<Etudiant> LH;
    
   Comparator<Etudiant> com = new Comparator<Etudiant>(){
        
       @Override 
       public int compare(Etudiant e1,Etudiant e2){
           return e1.getNom().compareTo(e2.getNom());
       }
    };
    
    public L2HashSet() {
        this.LH = new HashSet<Etudiant>();
    }
    
    
    
    @Override
    public void ajouterEtudiant(Etudiant e) {
        if (rechercherEtudiant(e) && rechercherEtudiant(e.getNom())){
            System.out.println("Etudiant "+e.getNom()+" Existe deja");
        }
        else LH.add(e);
        System.out.println("Etudiant "+e.getNom()+" a ete ajouté avec succes");
    }

    @Override
    public boolean rechercherEtudiant(Etudiant e) {
        return LH.contains(e);
    }

    @Override
    public boolean rechercherEtudiant(String nom) {
             for (Etudiant e : LH){
                return e.getNom().equals(nom);
             }
             return false;
    }

    @Override
    public void supprimerEtudiant(Etudiant e) {
       
            if (rechercherEtudiant(e) && rechercherEtudiant(e.getNom()) ){
                LH.remove(e);
            }
            else System.out.println("l'etudiant "+e.getNom()+" n existe pas");
        
    }

    @Override
    public void afficherEtudiants() {
       for (Etudiant e: LH)
       {
           System.out.println(e);
       }
    }

    // lezem ncovertiw el set to list or array list besh najmou naamlou sorting
    // fama methode okhra a travers treeSet
    // this is a wrong line : 
    // ArrayList<Etudiant> arrayList = new ArrayList<Etudiant>(LH);
   // lezem decalreha fi west methode wala taamlelha instation fil west l constructeur ( ghayr mou7abdha ) 
    @Override
    public void trierEtudiantsParId() {
    // the right way
    ArrayList<Etudiant> arrayList = new ArrayList<Etudiant>(LH);
      Collections.sort(arrayList);
      for (Etudiant e : arrayList){
          System.out.println(e);
      }
    }

    @Override
    public void trierEtudiantsParNom() {
       ArrayList<Etudiant> a = new ArrayList<>(LH);
       Collections.sort(a,com);
       for (Etudiant e : a){
          System.out.println(e);
      }
    }
    
}
