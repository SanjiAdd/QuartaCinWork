public class App {
    public static void main(String[] args) throws Exception {

        Player p = new Player("Mario");
        Player p2 = new Player("Luigi");
        p2.setValore(999);
        p.setValore(90);
        System.out.println(p);
        System.out.println(p2);
        p.save();
        p2.save();
    }
}