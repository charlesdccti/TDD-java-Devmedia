package br.devmedia.bo;

public class ManipulaString {

	private static final String VOGAIS = "aeiouAEIOU";

	public String manipular(String string) {
		int posicao;
		for (char c : string.toCharArray()) {
			if (isVogal(c)) {
				string = string.replace(String.valueOf(c), "9");
				return string;
			}
		}
		return string;
	}

	public boolean isVogal(char caractere) {
		return VOGAIS.contains(String.valueOf(caractere));
	}

}
