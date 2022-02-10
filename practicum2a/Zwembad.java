package practicum2a;


public class Zwembad {
    double breedte;
    double lengte;
    double diepte;

    public Zwembad(double breedte, double lengte, double diepte){
        this.breedte = breedte;
        this.lengte = lengte;
        this.diepte = diepte;
    }
    public Zwembad(){

    }

    public double getBreedte(){
        return breedte;
    }

    public double getLengte(){
        return lengte;
    }

    public double getDiepte(){
        return diepte;
    }

    public void setBreedte(double br){
        this.breedte = br;
    }

    public void setLengte(double lengte){
        this.lengte = lengte;
    }

    public void setDiepte(double diepte){
        this.diepte = diepte;
    }

    public double inhoud(){
        return lengte * breedte * diepte;
    }
    public String toString(){
        return(" Breedte is: " + breedte + " Lengte is: " + lengte + " Diepte is: " + diepte);
    }

}
