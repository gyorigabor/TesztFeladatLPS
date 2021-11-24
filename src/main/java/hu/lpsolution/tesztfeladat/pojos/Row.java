package hu.lpsolution.tesztfeladat.pojos;

public class Row {
    private String nev;
    private String ertek;

    public Row() {
    }

    public Row setNev(String nev) {
        this.nev = nev;
        return this;
    }

    public Row setErtek(String ertek) {
        this.ertek = ertek;
        return this;
    }

    @Override
    public String toString() {
        return "\t\t\t<tr>\n" +
                "\t\t\t\t<td>" + nev + "</td>\n" +
                "\t\t\t\t<td>" + ertek + "</td>\n" +
                "\t\t\t</tr>\n";
    }
}
