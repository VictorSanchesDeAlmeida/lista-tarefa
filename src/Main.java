import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TreeMap<Integer, String> listaTarefa = new TreeMap<>();

        System.out.println("Lista de tarafas");

        int key = 1;

        while (true){
            System.out.println("=====================Menu======================");
            System.out.println("Selecione uma opção:\n");
            System.out.println("1 para Add uma tarefa;");
            System.out.println("2 para Listar suas tarefas;");
            System.out.println("3 para Editar uma tarefa;");
            System.out.println("4 para Excluir uma tarefa;");
            System.out.println("5 para sair do programa;");
            System.out.println("================================================");


            int opcao = sc.nextInt();
            int id = 0;

            sc.nextLine();
            switch (opcao) {

                case 1:
                    System.out.println("======================Add=======================");
                    System.out.println("Digite o nome do tarefa: ");
                    String nome = sc.nextLine();
                    listaTarefa.put(key++, nome);

                    System.out.println("\nTarefa adicionada com sucesso!");
                    System.out.println("================================================");

                    break;
                case 2:
                    System.out.println("======================Lista====================");

                    System.out.println("\nSuas tarefas são:");

                    for(Map.Entry<Integer, String> entry : listaTarefa.entrySet()){
                        System.out.println(entry.getKey() + " - " + entry.getValue());
                    }
                    System.out.println("================================================");

                    break;
                case 3:
                    System.out.println("======================Editar====================");
                    System.out.println("\nDigite o ID do tarefa: ");
                    for(Map.Entry<Integer, String> entry : listaTarefa.entrySet()){
                        System.out.println(entry.getKey() + " - " + entry.getValue());
                    }

                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("\nDigite um novo nome para a tarefa: ");
                    String newNome = sc.nextLine();

                    listaTarefa.put(id, newNome);

                    System.out.println("\nTarefa editada com sucesso!");
                    System.out.println("================================================");
                    break;
                case 4:
                    System.out.println("======================Remover====================");
                    System.out.println("\nDigite o ID da tarefa a ser excluida: ");
                    for(Map.Entry<Integer, String> entry : listaTarefa.entrySet()){
                        System.out.println(entry.getKey() + " - " + entry.getValue());
                    }

                    id = sc.nextInt();
                    sc.nextLine();
                    listaTarefa.remove(id);

                    System.out.println("\nTarefa removida com sucesso!");

                    System.out.println("================================================");
                    break;
                case 5:
                    System.out.println("Saindo do programa...");
                    return;
            }
        }

    }
}