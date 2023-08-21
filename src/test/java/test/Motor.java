package test;

public class Motor {
	int numeroCilindros ;
	string tipo ;
	int registro ; 
	
	void cambiarRegistro(int registro) // indica que el método acepta un parámetro de tipo int llamado registro.
	{
		this.registro = registro; //copia el valor del parámetro registro en el atributo registro de la instancia actual.
	}
	
	void asignarTipo(string tipo) 
	{
		if (tipo == "electrico"|| tipo == "gasolina")
		{
			this.tipo = tipo ;

		}
	}
}
