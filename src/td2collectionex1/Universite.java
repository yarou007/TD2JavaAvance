/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package td2collectionex1;

/**
 *
 * @author hammi
 */
public interface Universite {

    public void ajouterEtudiant(Etudiant e);

    public boolean rechercherEtudiant(Etudiant e);

    public boolean rechercherEtudiant(String nom);

    public void supprimerEtudiant(Etudiant e);

    public void afficherEtudiants();

    public void trierEtudiantsParId();

    public void trierEtudiantsParNom();
}
