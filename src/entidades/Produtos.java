package entidades;

public class Produtos {

    public String nome;
    public double preco;
    public int quantidade;

    // Multiplicar o preço unitario pela quantidade, então saberá a quantidade total.
    public double valorTotalDoEstoque(){
        return preco * quantidade; // Retornar o valor total.

    }
    // Alterar o valor do atributo 'quantidade' e somar com a 'quantidade que recebeu como argumento'
    public void adiconarQuantidadesDeProdutos(int quantidade){
        this.quantidade += quantidade; // Quantidade recebe oque tinha + quantidade que vai ser dada.
    }
    public void removerProdutos(int quantidade){
        this.quantidade -= quantidade; // Remover quantidade quantidade
    }
    public String toString(){
        return nome + ", $ " + String.format("%.2f", preco) + ", " + quantidade + " unidades, Total: $ " + String.format("%.2f", valorTotalDoEstoque());
    }
}
