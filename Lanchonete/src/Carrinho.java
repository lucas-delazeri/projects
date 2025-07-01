import java.util.ArrayList;

public class Carrinho {
    public ArrayList<Item> itens;

    public Carrinho() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        itens.add(item);
        System.out.println(item.getNome());
    }

    public void removerItem(int codigo) {
        for (int i=0; i<itens.size(); i++){
            if (itens.get(i).getCodigo() == codigo) {
                System.out.println(itens.get(i).getNome() + " foi removido do carrinho");
                itens.remove(i);
            }
        }
    }
    public void calcularPreco() {
        double valorTotal = 0;
        for(int i=0; i < itens.size(); i++) {
            valorTotal += itens.get(i).getPreco();
        }

        System.out.println("Valor Total a pagar: (R$) " + valorTotal);
    }
}
