public class Main {
    public static void main(String[] args) {
    Matrica mc = new Matrica(2, 2);
    Matrica mc2 = new Matrica(2, 2);
    Matrica mc3 = new Matrica(2,2);
    Matrica mc4 = new Matrica(2,2);
    Matrica mc5 = new Matrica(2,2);
    mc.vivod();
    System.out.println();
    mc2.vivod();
    System.out.println();
    mc3 = mc.sloz(mc2);
    mc3.vivod();
    System.out.println();
    mc4 = mc.unch(2);
    mc4.vivod();
    System.out.println();
    mc5 = mc.umMat(mc2);
    mc5.vivod();
    }
}
