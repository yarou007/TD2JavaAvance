/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package td2collectionex1;

import java.util.Objects;

/**
 *
 * @author hammi
 */
public class Etudiant implements Comparable<Etudiant> {
    private int id;
    private String nom;
    private String prenom;

    public Etudiant() {
        this.id=0;
        this.nom="";
        this.prenom="";
    }

    public Etudiant(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Etudiant{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id;
        hash = 97 * hash + Objects.hashCode(this.nom);
        hash = 97 * hash + Objects.hashCode(this.prenom);
        return hash;
    }
    
    // utiliser pour structure de donneés ( bech tji ) 
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {  // pointé sur nafs case memoire 
            return true;
        }
        if (obj == null) { //
            return false;
        }
        if (getClass() != obj.getClass()) { // fard classe
            return false;
        }
        
       Etudiant other = (Etudiant) obj;
       
        return this.id==other.id;
    }

    @Override
    public int compareTo(Etudiant that) {
           //return this.id > that.id?1:-1;     
            return this.id - that.id;
    }

    
    
    
    
    
}
