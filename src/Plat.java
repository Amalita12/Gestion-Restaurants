public class Plat {

    private String nom;
    private float prix;
    private String special;


    public Plat(String nom, float prix, String special) {
        this.nom = nom;
        this.prix = prix;
       if (special == null){
           this.special= "normal";

       }else{
           this.special= special;
       }


    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }



    public void AfficherInfos(){
        System.out.println("Plat: "+nom+" || Prix= "+prix+" || Special: "+special);
    }

    @Override
    public String toString() {
        return "Plat{" +
                "nom='" + nom + '\'' +
                ", prix=" + prix +
                ", special='" + special + '\'' +
                '}';
    }
}
