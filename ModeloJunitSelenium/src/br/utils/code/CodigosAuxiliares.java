package br.utils.code;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import br.main.code.ContentDriver;

public class CodigosAuxiliares extends ContentDriver {

	// 1- Metodo tempo por parametro em segundos
	public static void tempoSegundos(int valorSegundos) {

		valorSegundos = valorSegundos * 1000;

		try {
			Thread.sleep(valorSegundos);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	// 2- Metodo para criar pasta para evidencias
	public static void criarPasta(String localDiretorio) {
		// apresentar diretorio a ser criado
		File file = new File(localDiretorio);
		// Se não existir criar o diretorio
		if (!file.exists()) {
			if (file.mkdir()) {
				System.out.println("Diretorio Criado");
			} else {
				System.out.println("Diretório não Criado");
			}
		}
	}

	// 3- Metodo para criar prints das evidencias
	public static void evidencias(String nomePrint, String caminhoPrint) throws IOException {
		File scrFile = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File(caminhoPrint + nomePrint + ".png"));
	}

	// 4- Metodo para converter strings em numeros
	public static String converterNumeros(String texto) {
		if (texto != null) {
			return texto.replaceAll("[^0123456789]", "");
		} else {
			return "";
		}
	}

}
