/*
 * Jacobo Adega Tivas
 */
package cuentas;

/**
 *
 * Clase cuenta
 */
public class CCuenta {

    /**
     * Propiedades de la Clase
     */
    protected String nombre;

    /**
     * Propiedades de la Clase
     */
    protected String cuenta;

    /**
     * Propiedades de la Clase
     */
    protected double saldo;

    /**
     * Propiedades de la Clase
     */
    protected double tipoInterés;

    /**
     * Propiedades de la Clase
     */
    /**
     * Constructor sin argumentos
     */
    public CCuenta() {
    }

    /**
     * Constructor con argumentos
     *
     * @param nom nombre cliente
     * @param cue numero cuenta
     * @param sal saldo
     * @param tipo tipo interes
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * Devuelve saldo
     *
     * @return saldo
     */
    public double estado() {
        return getSaldo();
    }

    /**
     * Método para ingresar
     *
     * @param cantidad ingresar
     * @throws Exception error
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método para retirar
     *
     * @param cantidad retirar
     * @throws Exception error
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Devuelve nombre del titular
     *
     * @return nombre titular
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asigna nombre del titular
     *
     * @param nombre titular
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve número de cuenta
     *
     * @return numero cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Asignamos el número de la cuenta
     *
     * @param cuenta Numero de la cuenta del cliente
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Devuelve saldo
     *
     * @return saldo cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Asigna saldo
     *
     * @param saldo ingresado
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Devuelve el tipo de ienterés
     *
     * @return tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Asignamos el valor del tipo de interés
     *
     * @param tipoInterés Porcentaje a aplicar
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
