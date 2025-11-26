

public abstract class Empregado implements Pagavel {
    
    
    private String primeiroNome;
    private String ultimoNome;
    private String numeroSegurancaSocial;
    
    
    
    public Empregado(String primeiro,String ultimo,String nss){
    
    primeiroNome = primeiro;
    ultimoNome = ultimo;
    numeroSegurancaSocial = nss;
    
    
    
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public String getNumeroSegurancaSocial() {
        return numeroSegurancaSocial;
    }

    public void setNumeroSegurancaSocial(String numeroSegurancaSocial) {
        this.numeroSegurancaSocial = numeroSegurancaSocial;
    }
    
    @Override
    
    
    public String toString(){
    
    return String.format("%s %s\nnumero seguranca social %s",getPrimeiroNome(),getUltimoNome(),getNumeroSegurancaSocial());
    
    }
    
    
}
