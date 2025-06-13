import java.util.*;

public class Maison {
    public Set<String> numero;
    public Set<String> couleurs;
    public Set<String> nationalites;
    public Set<String> boissons;
    public Set<String> animaux;
    public Set<String> loisirs;

    // Constructeur sans paramètre
    public Maison() {
        this.numero = new HashSet<>(List.of("un", "deux", "trois", "quatre", "cinq"));
        this.couleurs = new HashSet<>(List.of("rouge", "vert", "jaune", "bleu", "blanc"));
        this.nationalites = new HashSet<>(List.of("Anglais", "Suedois", "Allemand", "Norvegien", "Danois"));
        this.boissons = new HashSet<>(List.of("the", "cafe", "bière", "lait", "eau"));
        this.animaux = new HashSet<>(List.of("cheval", "chat", "oiseau", "chien", "poisson"));
        this.loisirs = new HashSet<>(List.of("baseball", "basketball", "piano", "violon", "football"));
    }


    public boolean containsNationalite(String nationalite) {
        return this.nationalites != null && this.nationalites.contains(nationalite);
    }
    public boolean containsCouleur(String couleur) {
        return this.couleurs != null && this.couleurs.contains(couleur);
    }
    public boolean containsBoisson(String boisson) {
        return this.boissons != null && this.boissons.contains(boisson);
    }
    public boolean containsAnimal(String animal) {
        return this.animaux != null && this.animaux.contains(animal);
    }
    public boolean containsLoisir(String loisir) {
        return this.loisirs != null && this.loisirs.contains(loisir) ;
    }
    public boolean containsNumero(String numero) {
        return this.numero != null && this.numero.contains(numero);
    }
    public Set<String> getNumero() {
        return this.numero;
    }






    public void reduireNationalite(String nationalite) {
        this.nationalites.retainAll(Set.of(nationalite));
    }

    public void reduireAnimal(String animal) {
        this.animaux.retainAll(Set.of(animal));
    }

    public void reduireCouleur(String couleur) {
        this.couleurs.retainAll(Set.of(couleur));
    }

    public void reduireBoisson(String boisson) {
        this.boissons.retainAll(Set.of(boisson));
    }

    public void reduireLoisir(String loisir) {
        this.loisirs.retainAll(Set.of(loisir));
    }
    public void reduireNumero(String numero) {
        this.numero.retainAll(Set.of(numero));
    }
    public void enleverAnimal(String animal) {
        this.animaux.remove(animal);
    }
    public void enleverNationalite(String nationalite) {
        this.nationalites.remove(nationalite);
    }
    public void enleverCouleur(String couleur) {
        this.couleurs.remove(couleur);
    }
    public void enleverBoisson(String boisson) {
        this.boissons.remove(boisson);
    }
    public void enleverLoisir(String loisir) {
        this.loisirs.remove(loisir);
    }
    public void enleverNumero(String numero) {
        this.numero.remove(numero);
    }
    public void afficher() {
        System.out.println("Maison : " + numero);
        System.out.println("Couleurs possibles : " + couleurs);
        System.out.println("Nationalités possibles : " + nationalites);
        System.out.println("Boissons possibles : " + boissons);
        System.out.println("Animaux possibles : " + animaux);
        System.out.println("Loisirs possibles : " + loisirs);
        System.out.println("Numéros possibles : " + numero);
        System.out.println("-----");
    }
}
