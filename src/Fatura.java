
public class Fatura implements  Pagavel {
    
    
    public String numeroPeca;
    public String descricaoPeca;
    public int quantidade;
    public double precoPorItem;
    
    
    public Fatura(String peca,String descricao,int count,double preco){
    
    
    numeroPeca = peca;
    descricaoPeca = descricao;
    setQuantidade(count);
    setPrecoPorItem(preco);
    
    }

    public String getNumeroPeca() {
        return numeroPeca;
    }

    public void setNumeroPeca(String numeroPeca) {
        this.numeroPeca = numeroPeca;
    }

    public String getDescricaoPeca() {
        return descricaoPeca;
    }

    public void setDescricaoPeca(String descricaoPeca) {
        this.descricaoPeca = descricaoPeca;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoPorItem() {
        return precoPorItem;
    }

    public void setPrecoPorItem(double precoPorItem) {
        this.precoPorItem = precoPorItem;
    }
    
    @Override
    
    public String toString(){
    
    
    return String.format("%s: \n%s %s (%s)\n%s: %d \n%s: $%,.2f","fatura","numero da peça",getNumeroPeca(),getDescricaoPeca(),"quantidade",getQuantidade(),"preço por item",getPrecoPorItem());
    
    }
    
    @Override 
    
    public double obterValorPagamento(){
    
    
    
    return getQuantidade() * getPrecoPorItem();
    
    
    }
}
