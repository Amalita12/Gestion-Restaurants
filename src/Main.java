public class Main {
    public static void main(String[] args) {



        Plat plat1 = new Plat("Pizza", 45, "Plat du jour");
        Plat plat2 = new Plat("Salade", 25, "Végétarien");
        Plat plat3 = new Plat("Pâtes", 30, null);

        System.out.println("====== Liste des plats =======");
        plat1.AfficherInfos();
        plat2.AfficherInfos();
        plat3.AfficherInfos();
    }
}

