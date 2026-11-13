
package org.ghizlane;

import org.ghizlane.entities.Compte;
import org.ghizlane.metier.IMetier;
import org.ghizlane.metier.MetierImpl;

public class Application {

    public static void main(String[] args) {

        IMetier metier = new MetierImpl();

        // Ajouter deux comptes bancaires
        metier.addCompte(1L, new Compte(1L, 5000));
        metier.addCompte(2L, new Compte(2L, 10000));

        // Afficher les comptes
        System.out.println("\n--- Comptes initiaux ---");
        System.out.println(metier.getCompte(1L));
        System.out.println(metier.getCompte(2L));

        // Versement
        System.out.println("\n--- Versement ---");
        metier.verser(1L, 2000);

        // Retrait
        System.out.println("\n--- Retrait ---");
        metier.retirer(2L, 3000);

        // Afficher les comptes après opérations
        System.out.println("\n--- Comptes après opérations ---");
        System.out.println(metier.getCompte(1L));
        System.out.println(metier.getCompte(2L));
    }
}
