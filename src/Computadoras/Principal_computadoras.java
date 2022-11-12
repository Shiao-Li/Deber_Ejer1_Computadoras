package Computadoras;

public class Principal_computadoras {
    public static void main(String[] args) {
        laptop lp = new laptop();
        System.out.println("\t\t\t Laptop cliente 1");
        System.out.println("\nMarca: " + lp.marca);
        System.out.println("Modelo: " +lp.modelo);
        System.out.println("Sistema operativo: " +lp.sistemaOperativo);
        System.out.println("Color: " +lp.color);

        System.out.println("\n\t\t\t Capacidades");
        System.out.println("\nCapacidad de memoria RAM: " +lp.capMemRAM);
        System.out.println("Capacidad alamacenamiento: " +lp.capAlmacenamiento);

        laptop lp1 = new laptop();
        lp1.setMarca("Asus");
        lp1.setModelo("AUX112");
        System.out.println("--------------------------------------------------------");
        System.out.println("\n\t\t\t Laptop cliente 2");
        System.out.println("\nMarca: " + lp1.marca);
        System.out.println("Modelo: " +lp1.modelo);
        System.out.println("Sistema operativo: " +lp.sistemaOperativo);
        System.out.println("Color: " +lp.color);

        System.out.println("\n\t\t\t Capacidades");
        System.out.println("\nCapacidad de memoria RAM: " +lp.capMemRAM);
        System.out.println("Capacidad alamacenamiento: " +lp.capAlmacenamiento);
        System.out.println("--------------------------------------------------------");
    }
}
