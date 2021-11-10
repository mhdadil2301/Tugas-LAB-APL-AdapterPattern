class Main {
    public static void main(String args[]) {
        SuaraBebek suaraBebek = new SuaraBebek();
        Kucing kucing = new SuaraKucing();

        Kucing BebekAdapter = new BebekAdapter(suaraBebek);

        System.out.print("Suara Bebek\t\t : ");
        suaraBebek.kwek();

        System.out.print("Suara Kucing\t\t : ");
        kucing.meow();

        System.out.print("Suara kucing sekarang\t : ");
        BebekAdapter.meow();
    }
}