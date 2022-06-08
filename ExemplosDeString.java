package curso_java;

public class ExemplosDeString {
	public static void main(String args[]) {
		//Declarção de variaveis//
		String original = " O meu SAPATO E pequeno";
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2,9);
		String s06 = original.replace('a', 'x');
		int i = original.indexOf('o');
		int j = original.lastIndexOf('t');
		
		System.out.println("Original-" + original +"-");
		
		//Letras minusculas//
		System.out.println("toLowerCase-" + s01 + "-");
		
		//Letras Maiúsculas
		System.out.println("toUpperCase-" + s02+ "-");

		//Tira os espeços//
		System.out.println("trim-" + s03 + "-");
		
		//Formar uma nova string a partir do numero declarado//
		System.out.println("substring (2)-" + s04 + "-");
		
		// Mostrar uma string do começo onde vc declarou "2" ate o limite "9"//
		System.out.println("substring (2,9)-" + s05 + "-");
		
		// Trocar um caracter //
		System.out.println("Replace (a) por (x) -" + s06 + "-");
		
		//Primeira vez que esse caracter foi digitado//
		System.out.println("indexOF-" + i +"-");
		
		//Ultima vez que o caracter foi digitado// 
		System.out.println("lastIndexOf-" + j + "-");
	}
}
