package mundo;

public class EmpleadoSinHorasExtras extends Empleado implements IPagado {

	public EmpleadoSinHorasExtras(String pNombreEmpleado, int pHorasTrabajadas, double pSueldoPorHora) {
		super(pNombreEmpleado, pHorasTrabajadas, pSueldoPorHora);
	}
	@Override
	public double CalcularSalario() {
		return gethorasTrabajadas()* getsueldoPorHora();
		/**double salario = 0.0;
		salario += (gethorasTrabajadas()* getsueldoPorHora());
		return salario;
	//return horasTrabajadas * sueldoPorHora;*/
	}
	
	
	
}
