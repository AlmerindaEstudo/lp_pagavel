
public class EmpregadoAssalariado extends Empregado{
    
    
    private double salarioSemanal;
    
    
    public EmpregadoAssalariado(String primeiro,String ultimo,String nss,double salario){
    
    super(primeiro,ultimo,nss);
    setSalarioSemanal(salario);
    
    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }
    
    @Override
    
    public double obterValorPagamento(){
    
    return getSalarioSemanal();
    
    
    }
    
    
    @Override
    
    public String toString(){
    
    return String.format("empregado assalariado : %s\n%s $,.2f",super.toString(),"Salario semanal ",getSalarioSemanal());
    
    }
}
