package practicum4a;

public class Persoon {
    private String naam;
    private int leeftijd;

    public Persoon(String nm, int lft){
        this.naam = nm;
        this.leeftijd = lft;
    }

    public String toString(){
        return naam +  "; " + "leeftijd " + leeftijd + " jaar";
    }
}
