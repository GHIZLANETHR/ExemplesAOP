
package org.ghizlane.metier;

import org.ghizlane.entities.Compte;

public interface IMetier {

    void addCompte(Long code, Compte compte);

    void verser(Long code, double solde);

    void retirer(Long code, double solde);

    Compte getCompte(Long code);
}
