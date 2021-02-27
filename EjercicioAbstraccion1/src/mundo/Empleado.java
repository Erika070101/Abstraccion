package mundo;

public abstract class Empleado  {
	//Atributos
	protected String nombreEmpleado;
	protected int horasTrabajadas;
	protected double sueldoPorHora;
	protected boolean pagado = false;
	
	//Contructor
	public Empleado(String pNombreEmpleado, int pHorasTrabajadas, double pSueldoPorHora) {
		nombreEmpleado  = pNombreEmpleado;
		horasTrabajadas = pHorasTrabajadas;
		sueldoPorHora   = pSueldoPorHora;	
	}
	//Metodos Getter y Setters
	public String getnombreEmpleado() {
		return nombreEmpleado;
	}
	public void setnombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}
	public double gethorasTrabajadas() {
		return horasTrabajadas;
	}
	public double getsueldoPorHora() {
		return sueldoPorHora;
	}
	public void sethorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	public void setsueldoPorHora(double sueldoPorHora) {
		this.sueldoPorHora = sueldoPorHora;
	}
	public boolean isPagado() {
		return pagado;
	}
	public void setPagado(boolean pagado) {
		this.pagado = pagado;
	}
	public abstract double CalcularSalario();
	
	public void marcarPagado(){
		// TODO Auto-generated method stub
		pagado = true;	
	}
	
	public boolean esPagado() {
		// TODO Auto-generated method stub
		marcarPagado();
		return false;
	}
	
}

