package modelo;

public class SalarioEmpleado
{
    //--------------------------
    //Atributos
    //--------------------------
    private static int salariosMinimos = 2000000;
    private static int añoActual = 2022;
    private static int auxilioTransporte = 0;
    private int edadEmpleado;
    private int tiempoEmpresa;
    private int salario;
    private int añoNacimiento;
    private int añoIngresoEmpresa;
    
    //--------------------------
    //Métodos
    //--------------------------
    
    //Constructor
    public SalarioEmpleado(int pAñoNacimiento, int pSalario, int pAñoIngresoEmpresa)
    {
        this.añoNacimiento = pAñoNacimiento;
        this.añoIngresoEmpresa = pAñoIngresoEmpresa;
        this.salario = pSalario;
        this.edadEmpleado = 0;
        this.tiempoEmpresa = 0;
    }
    
    public static int getSalariosMinimos()
    {
        return salariosMinimos;
    }

    public static int getAñoActual()
    {
        return añoActual;
    }

    public static int getAxilioTransporte()
    {
        return auxilioTransporte;
    }
    
    public int getEdad()
    {
        return this.edadEmpleado;
    }
    
    public int getTiempoEmpresa()
    {
        return this.tiempoEmpresa;
    }

    public int getSalario()
    {
        return this.salario;
    }
    
    public int getAñoNacimiento()
    {
        return this.añoNacimiento;
    }

    public int getAñoIngresoEmpresa()
    {
        return this.añoIngresoEmpresa;
    }

    public void empleadoAuxilioTransporte()
    {
        if(salario<salariosMinimos)
        {
            auxilioTransporte = 117100;
        }

        else
        {
            auxilioTransporte = 0;
        }

    }

    public void empleadoEdad()
    {
        edadEmpleado= añoActual-añoNacimiento;
    }

    public void tiempoEmpresa()
    {
        tiempoEmpresa = añoActual-añoIngresoEmpresa;

    }

}
