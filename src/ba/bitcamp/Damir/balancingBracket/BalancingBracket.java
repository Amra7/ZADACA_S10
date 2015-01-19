package ba.bitcamp.Damir.balancingBracket;

/*
 * Text zadatka: 
 * 
 * Napraviti program koji nudi korisniku da unese izraz koji mo�e sadr�avati zagrade. 
 * Zatim ispitati unijeti izraz i provjeriti da li su unutar njega zagrade dobro balansirane.
 * "Dobro balansirane" zagrade defini�emo na sljede�i na�in: svaka zagrada je zatvorena nakon 
 * �to je adekvatna zagrada zatvorena. Svaka otvorena zagrada je zatvorena tek nakon �to su sve zagrade unutar nje zatvorene. Primjer je jasniji od obja�njenja:

 Primjeri dobro balansiranih zagrada:
 * ( 3 + 5 ) * 15
 * array[(3 + 5) * 15]
 * [ { ( ) } ( ) ]

 Primjeri lo�e balansiranih zagrada:
 * (
 * [ ) ( ]
 * [ ( ] )
 * 
 * Dakle, izraz koji korisnik unese mo�e sadr�avati brojeve, tekst i zagrade. 
 * Prilikom provjere balansiranosti zagrada, mo�ete ignorisati sve ostale karaktere. 
 * Ako je izraz dobro balansiran, ispisati potvrdu, a ako nije ispisati i to.

 Bonus*: Dozvoliti da se unutar zagrada na�u i "stringovi", 
 tj. tekst pod navodnicima. Sve znakove koji su dio stringa treba ignorisati, 
 **uklju�uju�i zagrade**. Naprimjer, i ovo bi bio ispravno balansiran izraz:

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
		


