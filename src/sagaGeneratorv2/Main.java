package sagaGeneratorv2;

import java.util.Scanner;

import sagaGeneratorv2.util.Cores;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		System.out.println(Cores.TEXT_BLACK_BOLD + Cores.ANSI_WHITE_BACKGROUND);
		System.out.println("                                                                          ");
		System.out.println("                                                                          "
				+ "\n¨¨¨¨¨¨___¨¨¨¨" + "                                                             "
				+ "\n¨¨¨¨¨(   )¨¨¨" + "                JOGO SAGA GENERATOR                          "
				+ "\n¨¨¨¨(     )¨¨" + "                                                             "
				+ "\n¨¨¨(_______)¨" + "                                                             "
				+ "\n¨¨¨¨¨¨¨¨¨¨¨¨¨                                                             ");
		System.out.println("                                                                          ");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("                                                                          ");
		System.out.println("                             MENU PRINCIPAL                               ");
		System.out.println("                                                                          ");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Olá futuro Dev!!Estamos felizes em vê-lo por aqui!                        "
				+ "\rPensando nisso preparamos um quiz de perguntas que vai levá-lo as alturas."
				+ "\rMas antes, vem comigo...                                                  ");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("         1- Iniciar o Jogo                                                ");
		System.out.println("         2- Sair                                                          ");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println(" Escolha uma opção (1 ou 2):                                              ");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("                                                                          ");
		System.out.println("                                                            " + "¨¨¨¨___¨¨¨¨¨¨¨\n"
				+ "                                                            " + "¨¨¨(   )¨¨¨¨¨¨\n"
				+ "                                                            " + "¨¨(     )¨¨¨¨¨\n"
				+ "                                                            " + "¨(_______)¨¨¨¨\n"
				+ "                                                            " + "¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
		System.out.println("Entre com a opção desejada:                                               ");
		System.out.println("                                                                          "+ Cores.TEXT_RESET);
		

		/* Obtém a opção selecionada pelo usuário */
		int opcao = leia.nextInt();
		leia.nextLine(); // Consumir a quebra de linha

		/* Iniciar o jogo se o usuário selecionou a opção 1 */
		if (opcao == 1) {
			// Tela de configuração do personagem
			System.out.println(
					"==========================================================================================");
			System.out.println("                                                                                                         ");
			System.out.println(Cores.TEXT_WHITE_BOLD+
					"\nPrimeiro de tudo, estamos super interessados em saber como podemos chamá-lo. \rPortanto, Digite o nome do seu personagem: ");
			String nome = leia.nextLine();
			System.out.println("                                                                                                        ");
			System.out.println("                                                           ");
			System.out.println(
					"\nSeja Bem-vinde, " + nome + " !");
			System.out.println("\nBom, agora que sabemos quem você é, bora começar a nossa SAGA...");
			System.out.println("															");
		} else if (opcao == 2) {
			System.out.println("                                             ");
			System.out.println("\nSaindo do jogo....");
			System.exit(0);
		}
		System.out.println(
				"==============================!!!Estávamos te esperandooo!!!===================================\r");
		// Perguntas, opções de respostas, resposta correta
		// Fase 1
		dadosJogador[][] perguntas = { { new dadosJogador(
				"Pensando na sua rápida transição de carreira, preparamos uma perguntinha simples para começar a se familiarizar"+Cores.TEXT_WHITE_BOLD_BRIGHT+"\r\r\t\t\t''Mudar pode dar medo, Mas é uma aventura que pode levar muito longe.''"+Cores.TEXT_RESET+"\r\rResponda: Qual das opções abaixo representa corretamente a linha de código que faz a leitura dos dados digitados por um usuário?",
				new String[] { "Scanner leia = new Scanner(System.in);", "leia = scanner new scanner(system.in)",
						"scanner leia = new scanner(system.in):" },
				1),
				new dadosJogador(
						Cores.TEXT_WHITE_BOLD_BRIGHT+"Está indo muito bem!\r\r\t\t\t''Motivação é a impulsão para realizações de sonhos.''"+Cores.TEXT_RESET+"\r\rResponda: Qual das opções abaixo iremos utilizar para exibir o resultado de uma soma limitada à duas casas decimais?",
						new String[] { "System.out.println(\"O resultado da soma é: %.2f\"+resultado);",
								"System.out.printf(\"O resultado da soma é: %.2f \"+resultado);",
								"System.out.printf(\"O resultado da soma é: %.2f\",resultado);" },
						3) }, // Fase 2
				{ new dadosJogador(
						Cores.TEXT_WHITE_BOLD_BRIGHT+"Você tá mandando bem demais!\r\r\t\t\t''A motivação é uma porta que se abre por dentro.''"+Cores.TEXT_RESET+"\r\rResponda: Quais são os principais laços condicionais em lógica de programação? ",
						new String[] { "if, if-else, else-if e switch", "else-if, if, for e switch",
								"while, if-else, while, do-while", },
						1),
						new dadosJogador(
								Cores.TEXT_WHITE_BOLD_BRIGHT+"Continue assim...\r\r\t\t\t''A persistência é o caminho do êxito''"+Cores.TEXT_RESET+"\r\rResponda: Qual é a estrutura condicional mais adequada para testar várias condições?",
								new String[] { "if", "else-if", "switch-case" }, 3) }, // Fase 3
				{ new dadosJogador(
						"Bora persistir?!\r\r\t\t\t''A alegria é a fonte de todo prazer, e a satisfação da motivação.''\r\rResponda: Quais são os principais laços de repetição em lógica de programação??",
						new String[] { "For, if e while", "for, while e do-while", "for, if e switch" }, 2),
						new dadosJogador(
								Cores.TEXT_WHITE_BOLD_BRIGHT+"Estamos gostando de ver.\r\r\t\t\t''O sucesso começa quando a motivação termina e a disciplina continua.''"+Cores.TEXT_RESET+"\r\rResponda: Qual a diferença entre o laço for e o laço while em programação?",
								new String[] { "O laço for é baseado em uma condição e o while em uma contagem",
										"O laço for é baseado em uma contagem e o while em uma condição",
										"Não há diferença entre os dois laços" },
								2) }, // Fase 4
				{ new dadosJogador(
						Cores.TEXT_WHITE_BOLD_BRIGHT+"\r\r\t\t\tSe chegou até aqui, se oriente no futuro e tenha plena convicção de suas capacidades."+Cores.TEXT_RESET+"\r\rResponda: A implementação LinkedList ou Lista Vinculada é uma estrutura de dados...",
						new String[] { "Dimensional", "Abstrata", "Linear" }, 3),
						new dadosJogador(
								Cores.TEXT_WHITE_BOLD_BRIGHT+"QUE ALEGRIAAA...\r\r\t\t\t''A vida segue - com ou sem ele - com ou sem entusiasmo - com ou sem motivação.''"+Cores.TEXT_RESET+"\r\rResponda:Por quê a implementação HashSet é a mais rápida de todas?",
								new String[] { "Porque ela utiliza internamente uma HashTable",
										"Por causa da implementação TreeSet",
										"Porque ela organiza elementos da Collection automaticamente" },
								1) }, // Fase 5
				{ new dadosJogador(
						Cores.TEXT_WHITE_BOLD_BRIGHT+"Estamos muito felizes pelo seu desempenho!\r\r\t\t\t''Que a vontade de vencer seja minha maior motivação.''"+Cores.TEXT_RESET+"\r\rResponda: Qual é o tipo de estrutura de uma pilha(Stack)?",
						new String[] { "Primeiro a entrar, primeiro a sair (FIFO)",
								"Último a entrar, primeiro a sair(LIFO)", "Último a entrar, último a sair(LILO)" },
						2),
						new dadosJogador(
								Cores.TEXT_WHITE_BOLD_BRIGHT+"\r\r\t\t\t''O fraco reclama e fica inerte, o guerreiro faz e transforma.''"+Cores.TEXT_RESET+"\r\rResponda: Em uma Array do tipo String qual é a maneira correta de se usar a Interface Iterator?",
								new String[] { "Iterator<T> nomeDoIterator = nomeDaCollection.iterator();","Iterator<G> nomeDoIterator = nomeDoIterator.iterator();","Iterator<T> nomeDaCollection = nomeDoIerator.iterator();\r\n"},
								1) }, // Fase 6
				{ new dadosJogador(
						Cores.TEXT_CYAN_BOLD_BRIGHT+"\r\r\t\t\tVocê está prestes a finalizar a SAGA. Chegue ao Céu!!!"+Cores.TEXT_RESET+"\r\r\t\t\t\r\rResponda: Quais são os modificadores de acesso de métodos e atributos?",
						new String[] { "padrão, public, protected e private", "public, private, pattern e padrão",
								"abstract, final, public e private" },
						1),
						new dadosJogador(
								Cores.TEXT_WHITE_BOLD_BRIGHT+"Você está no auge, Mas não pare por aqui. Estamos chegando ao fim. Mas ainda não é o fim!"+Cores.TEXT_RESET+"\r\r\t\t\t\r\rResponda: Quais são os modificadores de acesso de classes?",
								new String[] { "abstract e public", "padrão e public", "abstract e final" }, 2) }

		};

		int pontuacao = 0;

		// Primeiro índice [i] para as perguntas
		for (int x = 0; x < 6; x++) {
			
			System.out.println(Cores.TEXT_GREEN_BOLD );
			System.out.println("===================================   FASE " + (x + 1)
					+ "   =================================================\r");
			System.out.println( Cores.TEXT_RESET);
			for (int i = 0; i < 2; i++) {
				System.out.println("                                                               ");
				System.out.println("                                ___ PERGUNTA " + (i + 1) + "___");
				System.out.println("                                                                     ");
				dadosJogador perguntaAtual = perguntas[x][i];
				System.out.println(perguntaAtual.getPergunta());
				String[] opcoesResposta = perguntaAtual.getOpcoesResposta();

				// Segundo índice para [j] para as opções de resposta
				for (int j = 0; j < 3; j++) {
					System.out.println("\n	" + (j + 1) + ") " + opcoesResposta[j]);
				}

				// Faz a leitura da resposta e compara se é a correta
				int resposta = leia.nextInt();
				if (resposta == perguntaAtual.getRespostaCorreta()) {
					pontuacao += 10;
					System.out.println("                                                                   ");
					System.out.println(Cores.TEXT_GREEN_BOLD_BRIGHT+"Muito bem, resposta certa!  Sua pontuação atual é de " + pontuacao + " pontos! "+Cores.TEXT_RESET);
					System.out.println("                                                                   ");
					System.out.println("                                                                   ");
					// Caso não seja a resposta certa, imprimir a mensagem
				} else {
					System.out.println(
							Cores.TEXT_RED_BOLD_BRIGHT+"\r\nNão foi dessa vez. Mas, tenha paciência com os BUGUINHOS. Sem eles não teria emoção!"+Cores.TEXT_RESET+Cores.TEXT_WHITE_BOLD+"\r\r''O sucesso é ir de BUGUINHO em BUGUINHO sem perder o entusiasmo!!!'' "+Cores.TEXT_RESET);
				}

			} // for (int i = 0; i < perguntas.length; i++)

		}
		
		System.out.println(Cores.TEXT_CYAN_BOLD_BRIGHT );
		System.out.println("\r==========================================================================================");
		System.out.println("\rParabéns ! Você chegou ao fim da sua jornada da Saga Generator e conseguiu obter "
				+ pontuacao
				+ " pontos!\r\r\t\t\tDaqui em diante é só pra frente. Até porque, FOGUETE NÃO DÁ RÉ. - SR GUERREIRO");

	}
}