package view;

import java.util.Scanner;

import model.Docente;
import model.Tecnico;
import model.Terceirizados;

public class Menu {

    private String cpf;
    private String nome;
    private String endereco;
    private String dataAdm;
    private String titulacao;
    private float salarioBase;
    private Scanner in;

    public Menu() {
        in = new Scanner(System.in);
    }

    private void dadosFuncionario() {
        System.out.print("CPF: ");
        cpf = in.nextLine();
        System.out.print("Nome: ");
        nome = in.nextLine();
        System.out.print("Endereco: ");
        endereco = in.nextLine();
        System.out.print("Data de admissao: ");
        dataAdm = in.nextLine();
        System.out.print("Titulacao: ");
        titulacao = in.nextLine();
        System.out.print("Salario base: ");
        salarioBase = Float.parseFloat(in.nextLine());
    }

    public Docente dadosDocente() {
        this.dadosFuncionario();
        System.out.print("Siape: ");
        String siape = in.nextLine();
        System.out.print("Area: ");
        String area = in.nextLine();
        Docente d = new Docente(cpf, nome, endereco, dataAdm, titulacao, salarioBase, siape, area);
        return d;
    }

    public Tecnico dadosTecnico() {
        this.dadosFuncionario();
        System.out.print("Siape: ");
        String siape = in.nextLine();
        System.out.print("Departamento: ");
        String departamento = in.nextLine();
        Tecnico t = new Tecnico(cpf, nome, endereco, dataAdm, titulacao, salarioBase, siape, departamento);
        return t;
    }

    public Terceirizados dadosTerceirizados() {
        this.dadosFuncionario();
        System.out.print("Data de fim de contrato: ");
        String dataFimContrato = in.nextLine();
        System.out.print("Funcao: ");
        String funcao = in.nextLine();
        Terceirizados t = new Terceirizados(cpf, nome, endereco, dataAdm, titulacao, salarioBase, dataFimContrato, funcao);
        return t;
    }

    public int mainMenu() {
        System.out.println("----------- OPÇÕES DO MENU --------");
        System.out.println("1 - Cadastrar um novo funcionario");
        System.out.println("2 - Pesquisar por um funcionario e retornar todos os seus dados");
        System.out.println("3 - Listar todos os funcionarios com todos os seus dados");
        System.out.println("0 - Sair");
        int opcao = Integer.parseInt(in.nextLine());
        return opcao;
    }

    public int menuFuncionario() {
        System.out.println("* Informe a titulação do funcionário *");
        System.out.println("1 - Docente");
        System.out.println("2 - Tecnico");
        System.out.println("3 - Terceirizado");
        System.out.println("0 - Sair");
        int tipo = Integer.parseInt(in.nextLine());
        return tipo;
    }

    public String nomeFuncionario() {
        System.out.print("Nome do funcionario: ");
        String nome = in.nextLine();
        return nome;
    }

    public void close() {
        in.close();
    }
}
