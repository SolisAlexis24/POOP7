package poop7;

/**
 *
 * @author Equipo H
 */
public class Gerente extends Empleado{
    private int presupuesto;

    public Gerente() {
    }
    /**
     * Constrcutor de la clase
     * @param nombre Nombre del gerente
     * @param numEmp Número de empleado del gerente
     * @param sueldo Sueldo del gerente
     * @param presupuesto Presupuesto del gerente
     */
    public Gerente(String nombre, int numEmp, int sueldo, int presupuesto) {
        super(nombre, numEmp, sueldo);
        this.presupuesto = presupuesto;
    }
    /**
     * 
     * @return Retorna el presupuesto asignado
     */
    public int getPresupuesto() {
        return presupuesto;
    }
    /**
     * Asigna un presupuesto siempre positivo 
     * @param presupuesto Presupuesto modificadi
     */
    public void setPresupuesto(int presupuesto) {
        if(presupuesto < 0){
            System.out.println("El presupuesto no puede ser negativo");
            presupuesto = 0;
        }
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        
        return "Gerente{" + super.toString() + "presupuesto=" + presupuesto + '}';
    }
    
}
