package Conversor;

import static javax.swing.JOptionPane.*;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {

		ConversorDeMoedas conversor = new ConversorDeMoedas();
		String mensagem = "";

		while (true) {
			try {
				mensagem = showInputDialog("Digite o valor a ser convertido");

				double valor = Double.parseDouble(mensagem);

				double valorConvertido = 0;

				String str = showInputDialog("Digite o valor correspondente a conversão desejada\n1 - Reais a Dólar\n2 - Reais a Euro\n3 - Reais a Libras Esterlinas\n4 - Reais a Peso argentino\n5 - Reais a Peso Chileno\n6 - Dólar a Reais\n7 - Euro a Reais\n8 - Libras Esterlinas a Reais\n9 - Peso argentino a  Reais\n10 - Peso Chileno a Reais\n11 - Sair");

				if (Integer.parseInt(str) == 11) {
					break;
				}

				switch (Integer.parseInt(str)) {
				case 1:
					valorConvertido = conversor.realParaDolar(valor);
					JOptionPane.showMessageDialog(null,valor + " Convertido equivale a: " + String.format("%.2f", valorConvertido));
					break;
				case 2:
					valorConvertido = conversor.realParaEuro(valor);
					JOptionPane.showMessageDialog(null,valor + " Convertido equivale a: " + String.format("%.2f", valorConvertido));
					break;
				case 3:
					valorConvertido = conversor.realParaLibrasEsterlina(valor);
					JOptionPane.showMessageDialog(null,valor + " Convertido equivale a: " + String.format("%.2f", valorConvertido));
					break;
				case 4:
					valorConvertido = conversor.realParaPesoArgentino(valor);
					JOptionPane.showMessageDialog(null,valor + " Convertido equivale a: " + String.format("%.2f", valorConvertido));
					break;
				case 5:
					valorConvertido = conversor.realParaPesoChileno(valor);
					JOptionPane.showMessageDialog(null,valor + " Convertido equivale a: " + String.format("%.2f", valorConvertido));
					break;
				case 6:
					valorConvertido = conversor.dolarParaReal(valor);
					JOptionPane.showMessageDialog(null,valor + " Convertido equivale a: " + String.format("%.2f", valorConvertido));
					break;
				case 7:
					valorConvertido = conversor.euroParaReal(valor);
					JOptionPane.showMessageDialog(null,valor + " Convertido equivale a: " + String.format("%.2f", valorConvertido));
					break;
				case 8:
					valorConvertido = conversor.librasEsterlinasParaReal(valor);
					JOptionPane.showMessageDialog(null,valor + " Convertido equivale a: " + String.format("%.2f", valorConvertido));
					break;
				case 9:
					valorConvertido = conversor.pesoArgentinoParaReal(valor);
					JOptionPane.showMessageDialog(null,valor + " Convertido equivale a: " + String.format("%.2f", valorConvertido));
					break;
				case 10:
					valorConvertido = conversor.pesoChilenoParaReal(valor);
					JOptionPane.showMessageDialog(null,valor + " Convertido equivale a: " + String.format("%.2f", valorConvertido));
					break;
				default:
					showMessageDialog(null, "Opção invalida!");
				}
			} catch (NumberFormatException nfe) {
				showMessageDialog(null, "Digite apenas numeros!");
			}
		}
	}
}
