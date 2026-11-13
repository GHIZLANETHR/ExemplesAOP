
package org.ghizlane.metier;

import org.ghizlane.entities.Compte;
import java.util.HashMap;
import java.util.Map;

public class MetierImpl implements IMetier {

    private Map<Long, Compte> comptes = new HashMap<>();

    @Override
    public void addCompte(Long code, Compte compte) {
        comptes.put(code, compte);
        System.out.println("Compte ajouté avec succès !");
    }

    @Override
    public void verser(Long code, double solde) {
        Compte compte = getCompte(code);

        compte.setSolde(compte.getSolde() + solde);

        System.out.println("Versement effectué : " + solde + " DH");
    }

    @Override
    public void retirer(Long code, double solde) {
        Compte compte = getCompte(code);

        if (compte.getSolde() < solde) {
            throw new RuntimeException("Solde insuffisant !");
        }

        compte.setSolde(compte.getSolde() - solde);

        System.out.println("Retrait effectué : " + solde + " DH");
    }

    @Override
    public Compte getCompte(Long code) {
        Compte compte = comptes.get(code);

        if (compte == null) {
            throw new RuntimeException("Compte introuvable !");
        }

        return compte;
    }
}
