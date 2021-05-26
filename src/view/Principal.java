package view;

import java.io.IOException;

import javax.swing.JOptionPane;

import controller.SteamController;
import controller.IArquivosController;

public class Principal {

	public static void main(String[] args) {
	
		
		
	//	String dirWin="C:\\Windows";
	//	String path ="C:\\TEMP";
	//	String nome="SteamCharts.csv";
		
		
		
		
	
				int opcao = 0;
				while (opcao != 9) {

					opcao = Integer.parseInt(JOptionPane.showInputDialog("Tarefa Arquivos: "+
					"\n1- Listar jogos"+
					"\n2- Criar lista"+
					
					"\n9- Voltar  "));
					
					switch (opcao) {
						case 1:
							IArquivosController steamC = new SteamController ();
							int ano = 2020;

							String mes ="January";

							int media=30000;
							
							try {
								 steamC.BuscaJogo(ano, mes, media);
								
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						break;

						case 2:	
							int y = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano")); 
							
							
						break;

													
						case 9:
							JOptionPane.showMessageDialog(null, "Saindo");
						break;

						default:
							JOptionPane.showMessageDialog(null, "Opção inválida");
		
		
		
	
		// steamC.createFile(path, nome);
		//arqCont.readFile(path, nome);
	
	
					}
				}
	  }
	}

				


