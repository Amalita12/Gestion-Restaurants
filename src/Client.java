
public class Client {
    private String nom;

    private  static int idClient=1;
    List<Commande>commandes;

    public Client(String nom) {
        this.nom = nom;
        this.commandes = new ArrayList<>();
    }

    public List<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(List<Commande> commandes) {
        this.commandes = commandes;
    }

    public static int getIdClient() {
        return idClient;
    }

    public static void setIdClient(int idClient) {
        Client.idClient = idClient;
    }

    public String getNom() {
        return nom;
    }
    public void afficher() {
        System.out.println("Client : " + nom);
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void ajouterCommend(Commande c){
        if(!commandes.contains(c)){
            commandes.add(c);

        }

    }
}