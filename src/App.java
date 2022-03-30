public class App {
    public static void main(String[] args) throws Exception {
        Time t1 = new Time(13, 35, 25);
        Time t2 = new Time(48925);

        System.out.println(t1.toString());
        System.out.println(t1.convertiSecondi());


        t2.addSecondi(125);
        t2.normalize();
        System.out.println(t2.toString());
    }
}
