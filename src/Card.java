import java.util.Arrays;
import java.util.List;

public class Card<Value,Color> {
    private List<Numero> cardNumberslist = Arrays.asList(Numero.values());
    private List<Couleur> cardColorlist = Arrays.asList(Couleur.values());
    private String couleur;
    private int numero;

    Card(String couleur,int numero) {
        if(cardColorlist.contains(couleur) && isCorectNumber(numero)) {
            this.couleur = couleur;
            this.numero = numero;
        }
    }

    public String getCouleur(){
        return couleur;
    }
    public int getNumero() {
        return numero;
    }

    private boolean isCorectNumber(int numero){
        boolean var = false;
        for(Numero num:cardNumberslist){
            if(num.getValeur() == numero){
                var = true;
            }
        }
        return var;
    }

    public void showCard(){
        System.out.println("Numero:  "+this.getNumero()+"\n Couleur: "+this.getCouleur());
    }

}
