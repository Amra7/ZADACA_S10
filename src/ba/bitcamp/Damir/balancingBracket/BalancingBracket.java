package ba.bitcamp.Damir.balancingBracket;

/*
 * Text zadatka: 
 * 
 * Napraviti program koji nudi korisniku da unese izraz koji može sadržavati zagrade. 
 * Zatim ispitati unijeti izraz i provjeriti da li su unutar njega zagrade dobro balansirane.
 * "Dobro balansirane" zagrade definišemo na sljedeæi naèin: svaka zagrada je zatvorena nakon 
 * što je adekvatna zagrada zatvorena. Svaka otvorena zagrada je zatvorena tek nakon što su sve zagrade unutar nje zatvorene. Primjer je jasniji od objašnjenja:

 Primjeri dobro balansiranih zagrada:
 * ( 3 + 5 ) * 15
 * array[(3 + 5) * 15]
 * [ { ( ) } ( ) ]

 Primjeri loše balansiranih zagrada:
 * (
 * [ ) ( ]
 * [ ( ] )
 * 
 * Dakle, izraz koji korisnik unese može sadržavati brojeve, tekst i zagrade. 
 * Prilikom provjere balansiranosti zagrada, možete ignorisati sve ostale karaktere. 
 * Ako je izraz dobro balansiran, ispisati potvrdu, a ako nije ispisati i to.

 Bonus*: Dozvoliti da se unutar zagrada naðu i "stringovi", 
 tj. tekst pod navodnicima. Sve znakove koji su dio stringa treba ignorisati, 
 **ukljuèujuæi zagrade**. Naprimjer, i ovo bi bio ispravno balansiran izraz:

 * print(" [ zagrade u stringu } ")
 */
public class BalancingBracket {

	public static void main(String[] args) {
		
		System.out.println("Unesi zagrade i razmak kada zavrsis");
        String braces = TextIO.getlnString();
		char [] charStack = braces.toCharArray();
		
		StackChar stack = new StackChar();
		
		for ( int i =0; i<charStack.length; i++){
			if( charStack[i] == '{' || charStack[i] == '[' || charStack[i] == '(' ){
				stack.push(charStack[i]);
				return;
			}
			
			if ( charStack[i] == ')' ){
				if(stack.peek() == '(' ){
					stack.pop();
				} else {
					System.out.println("Not balanced");
					return;
				}
			}
				
				if ( charStack[i] == ']' ){
					if(stack.peek() == '[' ){
						stack.pop();
					} else {
						System.out.println("Not balanced");
						return;
					}
				}
					
					if ( charStack[i] == '}' ){
						if(stack.peek() == '{' ){
							stack.pop();
						} else {
							System.out.println("Not balanced");
							return;
						}
					}
				
			} 
					
				if (stack.isEmpty()){
					System.out.println("Stack je prazan!");
				} else {
					System.out.println("Stack nije prazan!");
				}
		 
		}

	}
		


