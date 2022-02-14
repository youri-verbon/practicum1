package practicum4a;

public class Huis {
    private String adres;
    private int bouwjaar;
    private Persoon hb;

    public Huis(String adr, int bwjr){
        this.adres = adr;
        this.bouwjaar = bwjr;
    }

    public void setHuisbaas(Persoon hb){
        this.hb = hb;
    }
    public Persoon getHuisbaas(){
        return hb;
    }

    public String toString(){

        return "Huis " + adres + " is gebouwd in " + bouwjaar + "\r\n" + "en heeft huisbaas " + hb.toString();
    }
}
