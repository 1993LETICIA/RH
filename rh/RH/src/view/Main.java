package view;

import java.util.List;

import model.Docente;
import model.Funcionario;
import model.Rh;
import model.Tecnico;
import model.Terceirizados;

public class Main {

    public static void main(String[] args) {

        int op;
        int tipo;

        Menu menu = new Menu();
        Rh rh = new Rh();

        do {
            op = menu.mainMenu();
            switch (op) {
                case 1: {
                    tipo = menu.menuFuncionario();
                    switch (tipo) {
                        case 1: {
                            Docente d = menu.dadosDocente();
                            rh.adicionaFuncionario(d);
                            System.out.println("** Dados do Docente **");
                            System.out.println(d.dadosFormatados());
                            System.out.println("--- Calculo do salario do Docente ---");
                            System.out.println("R$" + d.calculaSalario());
                        }
                        break;
                        case 2: {
                            Tecnico t = menu.dadosTecnico();
                            rh.adicionaFuncionario(t);
                            System.out.println("=== Dados do Tecnico ===");
                            System.out.println(t.dadosFormatados());
                            System.out.println("--- Calculo do salario do Tecnico ---");
                            System.out.println("R$" + t.calculaSalario());
                        }
                        break;
                        case 3: {
                            Terceirizados t = menu.dadosTerceirizados();
                            rh.adicionaFuncionario(t);
                            System.out.println("=== Dados do Terceirizado ===");
                            System.out.println(t.dadosFormatados());
                            System.out.println("--- Calculo do salario do Terceirizado ---");
                            System.out.println("R$" + t.calculaSalario());
                        }
                        break;
                        case 0: {
                            System.out.println("Voltando...");
                        }
                        break;
                        default: {
                            System.out.println("Opcao invalida");
                        }
                        break;
                    }
                }
                break;
                case 2: {
                    String nome = menu.nomeFuncionario();
                    List<Funcionario> pesquisa = rh.buscaFuncionario(nome);
                    if (pesquisa.isEmpty()) {
                        System.out.println("Nao ha funcionarios com esse nome...");
                    } else {
                        for (Funcionario f : pesquisa) {
                            System.out.println(f.dadosFormatados());
                            System.out.println("********************");
                        }
                    }
                }
                break;
                case 3: {
                    List<Funcionario> lista = rh.listarFuncionarios();
                    if (lista.isEmpty()) {
                        System.out.println("Nao ha funcionarios cadastrados...");
                    } else {
                        for (Funcionario f : lista) {
                            System.out.println(f.dadosFormatados());
                            System.out.println("********************");
                        }
                    }
                }
                break;
                case 0: {
                    System.out.println("Saindo...");
                }
                break;
                default: {
                    System.out.println("Opcao invalida");
                }
                break;
            }
        } while (op != 0);

        menu.close();
    }
}
