package poop7;
/**
 *
 * @author Equipo H
 */
public class POOP7 {

    public static void main(String[] args) {
        Gerente ger = new Gerente();
        ger.setNombre("Pedro Escalante");
        ger.setPresupuesto(12345);
        ger.setNumEmp(1212);
        ger.setSueldo(10);
        System.out.println("Nombre: " + ger.getNombre());
        System.out.println("NumEpleado: " + ger.getNumEmp());
        System.out.println("Sueldo: " + ger.getSueldo());
        ger.setPresupuesto(100_000);
        System.out.println("Presupuesto: " + ger.getPresupuesto());
        System.out.println(ger);
    }
    
}
