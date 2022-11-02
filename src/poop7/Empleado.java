package poop7;
/**
 *
 * @author Equipo H
 */
public class Empleado extends Object{
    private String nombre;
    private int numEmp, sueldo;

    public Empleado() {
        this.sueldo = 10_000;
    }
    /**
     * Constructor de la clase
     * @param nombre Nombre del empleado
     * @param numEmp Número de empleado
     * @param sueldo Sueldo del empleado
     */
    public Empleado(String nombre, int numEmp, int sueldo) {
        this.nombre = nombre;
        this.numEmp = numEmp;
        this.sueldo = sueldo;
    }
    /**
     * 
     * @return Devuelve el nombre del empleado
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Método que modifica el nombre del empleado
     * @param nombre Nuevo nombre de empleado
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * 
     * @return Regresa el nùmero del empleado
     */
    public int getNumEmp() {
        return numEmp;
    }
    /**
     * Modifica el numero de empleado
     * @param numEmp Nuevo número de empleado
     */
    public void setNumEmp(int numEmp) {
        this.numEmp = numEmp;
    }
    /**
     * 
     * @return Devuelve el sueldo del empleado
     */
    public int getSueldo() {
        return sueldo;
    }
    /**
     * Aumenta en un pocentaje el sueldo de un empleado
     * @param porcentaje Porcentaje en el que se aumenta el sueldo
     */
    public void setSueldo(int porcentaje){
        sueldo += (int)((sueldo * porcentaje)/100);
    }

    @Override
    public String toString() {
        return "Empleado{" + super.toString() + "nombre=" + nombre + ", numEmp=" + numEmp + ", sueldo=" + sueldo + '}';
    }
    
}
