public class MengAdapter implements Bebek {
    private Kucing kucing;

    public MengAdapter(Kucing kucing) {
        this.kucing = kucing;
    }

    @Override
    public void kwek() {
        kucing.Meng();
    }
}
