package oui;;
public class revision{
    public static void main(String[] args) {
        etudiant melyr = new etudiant();
        melyr.nom = "true";
        melyr.prénom = "Melyr";
        melyr.année = 1;
        melyr.cours = "Anglais";
        melyr.groupe = "A121";
        melyr.identifiant = 57968;
        melyr.titulaire = "DNA";
        System.out.println(melyr.prénom+" "+melyr.nom+" "+melyr.année+" "+melyr.cours+" "+melyr.groupe+" "+melyr.identifiant+" "+melyr.titulaire);
        etudiant louis = new etudiant();
        melyr.nom = "Aveugle";
        melyr.prénom = "Louis";
        louis.année = 3;
        louis.cours = "Math";
        louis.groupe = "B212";
        louis.identifiant = 68782;
        louis.titulaire = "MAR";
        System.out.println(melyr.prénom+" "+melyr.nom+" "+louis.année+" "+louis.cours+" "+louis.groupe+" "+louis.identifiant+" "+louis.titulaire);
        etudiant Marie = new etudiant();
        melyr.nom = "pasvu";
        melyr.prénom = "Marie";
        Marie.année = 2;
        Marie.cours = "Programmation";
        Marie.groupe = "C157";
        Marie.identifiant = 31254;
        Marie.titulaire = "LOL";
        System.out.println(melyr.prénom+" "+melyr.nom+" "+Marie.année+" "+Marie.cours+" "+Marie.groupe+" "+Marie.identifiant+" "+Marie.titulaire);

    }
}
