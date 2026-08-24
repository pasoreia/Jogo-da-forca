import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Forca {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("carro");
        palavras.add("cozinha");
        palavras.add("chape");
        palavras.add("palmeiras");

        Random random = new Random();
        int indiceAleatorio = random.nextInt(palavras.size());
        String escolha = palavras.get(indiceAleatorio);

        char[] progresso = new char[escolha.length()];
        for(int i =0; i < escolha.length() ; i++){
            progresso[i]= '_';
        }

        int tentativas = 6;
        Scanner scanner = new Scanner(System.in);

        do { 
            System.out.println("Palavra: " + String.valueOf(progresso));
            System.out.println("Tentativas restantes: " + tentativas);
            System.out.println("Tente descobrir a palavra: ");
            char letra = scanner.next().charAt(0);

            Boolean acerto = false;
            for(int i =0 ; i < escolha.length(); i++){
                if(escolha.charAt(i) == letra){
                    progresso[i] = letra;
                    acerto = true;
                }
            }
            if(!acerto){
                tentativas--;
            }

            if(String.valueOf(progresso).equals(escolha)){
                System.out.println("Voce acertou, a palavra era: " + escolha);
                break;
            }

            if(tentativas == 0){
                System.out.println("Vove errou, a palavra era: " + escolha);
            }

        } while (tentativas > 0);




    }
}
