public enum Numero {
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9);

    private int valeur;

    Numero(int valeur){
        this.valeur=valeur;
    }

    public  int getValeur() {
        return valeur;
    }


}
