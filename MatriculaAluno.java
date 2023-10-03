package exerciciosComPOO;

import javax.swing.JOptionPane;

public class MatriculaAluno {

	public static void main(String[] args) {

		int contagem = 0;

		Turma cadastro1 = new Turma();

		int userInput = 0;

		do {

			try {

				userInput = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Escolha uma opção \n1-Cadastrar aluno \n2-Remover aluno \n3-Listar turma"));

				switch (userInput) {

				case 1:

					cadastro1.SetNome(null);

					cadastro1.setIdade(0);

					cadastro1.setMatricula(null);

					cadastro1.confirmacaoCadastro();

					contagem++;

					break;

				case 2:

					cadastro1.removerAluno(null);

					break;

				case 3:

					cadastro1.mostrarAlunos();

					break;

				default:

					JOptionPane.showMessageDialog(null,
							"Você não selecionou nenhuma opção, portanto o programa foi finalizado");

					break;
				}

			} catch (NumberFormatException | NullPointerException erro) {

				JOptionPane.showMessageDialog(null, "Você inseriu dados inválidos ou fechou o programa incorretamente");
			}

		} while (userInput > 0 && contagem < 5);

	}

}
