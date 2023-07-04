/**
 * 
 */
package clases;

/**
 * 
 */
public class CuentaBancaria
{
	//Variables miembro o de instancia
	private long numCuenta;
	private long dni;
	private double saldo;
	private double interes;
	
	//Variables de clase
	private static long generadorCuenta = 100001;
	
	public static final double INTERESNORMAL = 0.05;
	
	//Constructor por defecto
	public CuentaBancaria() //Mismo nombre que la clase
	{
		this.numCuenta = CuentaBancaria.generadorCuenta;
		CuentaBancaria.generadorCuenta++;
		//Así hacemos una especie de autoincrement
		this.dni = 0;
		this.saldo = 0;
		this.interes = INTERESNORMAL;
	}
	
	//Constructor pasando atributos
	public CuentaBancaria(long dni, double saldo, double interes) //Mismo nombre que la clase
	{
		this.numCuenta = CuentaBancaria.generadorCuenta;
		CuentaBancaria.generadorCuenta++;
		//Así hacemos una especie de autoincrement
		this.dni = dni;
		this.saldo = saldo;
		this.interes = interes;
	}
	
	// Getters y Setters
	public long getNumCuenta()
	{
		return this.numCuenta;
	}

	public long getDni()
	{
		return this.dni;
	}

	public void setDni(long dni)
	{
		this.dni = dni;
	}

	public double getInteres()
	{
		return this.interes;
	}

	public double getSaldo()
	{
		return this.saldo;
	}
	/**
	 * Método de la clase que actualiza el saldo de la cuenta
	 * añadiendo los intereses diarios
	 */
	public void actualizarSaldo()
	{
		this.saldo = this.saldo + (this.saldo * this.interes)/365;
	}

	public boolean ingresar(double cantidad)
	{
		if (cantidad > 0)
		{
			this.saldo += cantidad;
			return true;
		}
		return false;
	}

	public void setInteres(double interes)
	{
		this.interes = interes;
	}
	
	public String toString()
	{
		return "[Número de cuenta = " + numCuenta + ", DNI = " + dni +
				", saldo actual = " + saldo + ", interés = " + interes + "]";
	}

	public boolean retirar(double cantidad)
	{
		if (this.saldo >= cantidad)
		{
			this.saldo -= cantidad;
			return true;
		}
		return false;
	}
}
