public class AdapterPattern {
    
    public static void main(String args[]) {
        Kucing kucing = new Meng();
        
        Bebek SuaraBebek = new Kwek();
        System.out.println("Suara bebek asli :");
        SuaraBebek.kwek();
        System.out.println(" ");
        SuaraBebek = new MengAdapter(kucing);
        System.out.println("Suara bebek setelah di convert :");
        SuaraBebek.kwek();
    }

}
