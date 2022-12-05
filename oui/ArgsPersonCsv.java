package oui;
public class ArgsPersonCsv {
    public static void main(String[] args) {
        if(args.length!=5){
            throw new IllegalArgumentException(
        "Veuillez entrez le numéro national,le prénom,nom de famille, mail et année de naissance : ");
        }
        Person non = new Person();
        non.identifiant = args[0];
        non.prenom = args[1];
        non.nom = args[2];
        non.email = args[3];
        non.Anneenaissance = Integer.parseInt(args[4]);
        System.out.println(args[0]+";"+args[1]+";"+args[2]+";"+args[3]+";"+args[4]);
    }
}
