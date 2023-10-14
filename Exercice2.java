
public class  {
     public static void main(String[] args) {
        // Instanciez un objet Scanner pour lire l'entrée
        Scanner scanner = new Scanner(System.in);

        // Demandez à l'utilisateur de saisir deux nombres
        System.out.print("Veuillez entrer le premier nombre: ");
        double num1 = scanner.nextDouble();

        System.out.print("Veuillez entrer le second nombre: ");
        double num2 = scanner.nextDouble();

        // Calculez la somme des deux nombres
        double total = 

        // Affichez le résultat
        System.out.println("La somme de " + num1 + " et " + num2 + " est: " + total);

        // Fermez le scanner pour éviter les fuites de ressources
        scanner.close();
    }
}
