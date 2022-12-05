package oui;
import java.time.Year;

public class Person{
    String nom ;
    String prenom;
    String identifiant;
    String email;
    int Anneenaissance;
        public  String ewi(){
        return nom;
    }
    public String getFullName() {
        return prenom + " " + nom;
    }

    public boolean Equals(Person other) {
        return identifiant.equals(other.identifiant);
    }

    public int getAge() {
        return Year.now().getValue() - Anneenaissance;
    }
}

