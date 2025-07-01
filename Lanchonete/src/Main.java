import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ItemNaoEncontradoException {
        Item item1 = new Item("Passaporte de carne bovina", 12.99, 1);
        Item item2 = new Item("Passaporte de frango", 11.99, 2);
        Item item3 = new Item("Coca-cola", 10.99, 3);
        Item item4 = new Item("Guaraná", 7.99, 4);

        Carrinho c = new Carrinho();
        Scanner sc = new Scanner(System.in);

        c.adicionarItem(item2);
        c.adicionarItem(item3);
        c.adicionarItem(item1);
        c.adicionarItem(item4);

        c.calcularPreco();

        System.out.println("Deseja remover algum item? ");
        String remover = sc.nextLine();


        // REMOVE ITEM
        if (remover.equalsIgnoreCase("sim")) {
            System.out.println("Selecione o codigo do item para ser removido");
            int codigo = sc.nextInt();
            sc.nextLine();

            boolean ItemRemovido = false;

            for (Item item : c.itens) {
                if (item.getCodigo() == codigo) {
                    c.removerItem(codigo);
                    ItemRemovido = true;
                    break;
                }
            }
            if (!ItemRemovido) {
                throw new ItemNaoEncontradoException("O item selecionado não foi encontrado");
            }
        }


        // ADICIONA ITEM
        System.out.println("Deseja adicionar algum item? ");
        String adicionar = sc.nextLine();

        while(adicionar.equalsIgnoreCase("sim")) {
                System.out.println("Nome do item: ");
                String nome = sc.nextLine();

                System.out.println("preco do item: ");
                double preco = sc.nextDouble();

                System.out.println("Codigo do item: ");
                int codigo = sc.nextInt();
                sc.nextLine();

                Item novoItem = new Item(nome, preco, codigo);
                c.adicionarItem(novoItem);

                System.out.println("Item adicionado com sucesso!");

                System.out.println("Deseja adicionar outro item? ");
                adicionar = sc.nextLine();
        }
        c.calcularPreco();
        sc.close();
    }
}
