package practicum2b;

public class Voetbalclub {
    private String clubnaam;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;

    public Voetbalclub(String clubnaam) {
        if (clubnaam == "" || clubnaam == null) {
            this.clubnaam = "FC";
        } else {
            this.clubnaam = clubnaam;
        }
    }

    public String getClubnaam() {
        return this.clubnaam;

    }

    public int aantalPunten() {
        int punten = aantalGewonnen * 3;
        return punten = aantalGelijk + punten;
    }

    public int aantalGespeeld() {
        return aantalGewonnen + aantalGelijk + aantalVerloren;
    }

    public int getAantalGewonnen() {
        return aantalGewonnen;
    }

    public int getAantalGelijk() {
        return aantalGelijk;
    }

    public int getAantalVerloren() {
        return aantalVerloren;
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
        else {
            return;
        }
    }


    public String toString() {
        return clubnaam + "    " + aantalGespeeld() + " " + aantalGewonnen + " " + aantalGelijk + " " + aantalVerloren + " " + aantalPunten();
    }
}
