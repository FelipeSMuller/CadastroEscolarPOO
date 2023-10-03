package exerciciosComPOO;

import java.util.ArrayList;

import javax.swing.JOptionPane;

//Classe
public class Turma {

	private String nome;

	private String matricula;

	private int idade;

	ArrayList<String> alunos = new ArrayList<>();

	// Valores padrão para iniciar.
	public Turma() {

		this.nome = "Sem nome";

		this.matricula = "Sem matrícula";

		this.idade = 0;
	}

	// Método construtor.
	public Turma(String nome, String matricula, int idade) {

		this.nome = nome;

		this.matricula = matricula;

		this.idade = idade;

	}

	// Setter para o nome
	public void SetNome(String nome) {

		try {

			nome = JOptionPane.showInputDialog(null, "Insira a nome do aluno");

			nome = nome.trim();

			nome = nome.toLowerCase();

			if (nome.isEmpty()) {

				JOptionPane.showMessageDialog(null, " O campo não pode estar vazio!!");

			}

			else {

				JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!!");

				this.nome = nome;

				alunos.add(nome);
			}

		} catch (NullPointerException erro) {

			JOptionPane.showMessageDialog(null, "Você fechou o programa incorretamente");

		}

	}

	// Inserindo a matricula no campo de cadastro,verificando tamanho, se o campo
	// está preenchido corretamente e se o programa nao foi interrompido de forma
	// incorreta
	public void setMatricula(String matricula) {

		try {

			matricula = JOptionPane.showInputDialog(null, "Insira a matricula do aluno");

			if (matricula.length() < 10) {

				JOptionPane.showMessageDialog(null,

						"Você inseriu uma quantidade de caracteres menor do que 10, repita o processo!!");

			}

			else if (matricula.isEmpty()) {

				JOptionPane.showMessageDialog(null, "O campo não pode estar vazio, preencha corretamente");
			}

			else {

				JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!!");

				this.matricula = matricula;

				alunos.add(matricula);
			}

		} catch (NullPointerException erro) {

			JOptionPane.showMessageDialog(null, "Você fechou o programa incorretamente");

		}
	}

	// Definindo idade, se for um número negativo ou igual a 0 gera um erro, se for
	// maior que 120 gera outro erro, a idade precisa estar na faixa de 1 a 119
	public void setIdade(int idade) {

		try {

			idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a idade do aluno"));

			if (idade <= 0 || idade >= 120) {

				JOptionPane.showMessageDialog(null, "Você inseriu uma idade inválida, tente novamente");
			}

			else {

				JOptionPane.showMessageDialog(null, "Idade cadastrada com sucesso!!");

				this.idade = idade;

				alunos.add(String.valueOf(idade));

			}
		} catch (NumberFormatException | NullPointerException erro) {

			JOptionPane.showMessageDialog(null, "Você inseriu dados inválidos ou fechou o programa incorretamente");
		}

	}

	public void mostrarAlunos() {

		System.out.println();

		for (int i = 0; i < alunos.size(); i++) {

			System.out.print(alunos.get(i) + " ");
		}

	}

	public void confirmacaoCadastro() {
		JOptionPane.showMessageDialog(null,
				"Cadastro do Aluno: " + nome + "\nMatricula: " + matricula + "\nIdade: " + idade);
	}

	public void removerAluno(String buscaAluno) {

		int contagem = 0;

		try {

			buscaAluno = JOptionPane.showInputDialog(null, "Digite o nome do aluno que deseja remover");

			buscaAluno = buscaAluno.trim();

			buscaAluno = buscaAluno.toLowerCase();

			if (buscaAluno.isEmpty()) {

				JOptionPane.showMessageDialog(null, "O campo não pode estar vazio, preencha corretamente");

			}

			else {

				for (int i = 0; i < alunos.size(); i++) {

					if (alunos.get(i).contains(buscaAluno)) {

						contagem++;
					}

				}

				if (contagem > 0) {

					alunos.remove(buscaAluno);
				}

				else {

					JOptionPane.showMessageDialog(null, "Não foi possível remover nenhum aluno");

				}

				for (int i = 0; i < alunos.size(); i++) {

					System.out.print(alunos.get(i) + " ");
				}

			}

		} catch (NullPointerException erro) {

			JOptionPane.showMessageDialog(null, "Você fechou o programa incorretamente, tente novamente");

		}

	}
}
