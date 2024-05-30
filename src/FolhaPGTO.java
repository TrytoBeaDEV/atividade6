public class FolhaPGTO {

    public static void main(String[] args) throws Exception {
        Mensalista men1, men2;
        Horista hora1, hora2;

        men1 = new Mensalista("Renata", "Rua da brisa", 2700, "Junior");
        men1.calcularSalario();
        men1.calcINSS();

        men1.imprimir();

        System.out.println("");

        men2 = new Mensalista("Letícia", "Rua da Vitória", 0, "Senior");
        men2.calcularSalario();
        men2.calcINSS();

        men2.imprimir();

        System.out.println("");

        hora1 = new Horista("Renatha", "Rua Floriano Peixoto", 0, 180, 27.50);
        hora1.calcularSalarioHoras();

        hora1.imprimir();

        System.out.println("");

        hora2 = new Horista("Alexandre", "Rua Coronel Pereira Neto", 0, 10, 28);
        hora2.calcularSalarioHoras();

        hora2.imprimir();

    }
}
