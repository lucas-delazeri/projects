public class Item {
    private int codigo;
    private String nome;
    private double preco;

    public Item(String nome, double preco, int codigo) {
        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void apresentar() {
        System.out.println("Nome do item: " + nome + "," + "Preco do item: R$ " + preco + "Código do item" + codigo);
    }
}

