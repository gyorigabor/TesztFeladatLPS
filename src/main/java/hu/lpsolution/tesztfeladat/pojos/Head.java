package hu.lpsolution.tesztfeladat.pojos;

public class Head {

    private String nev;


    public String getTitle() {
        return nev;
    }

    public Head setNev(String nev) {
        this.nev = nev;
        return this;
    }

    @Override
    public String toString() {
        return "\t<head>\n" +
                "\t\t<meta charset=\"UTF-8\">\n" +
                "\t\t<title>" + nev + "</title>\n" +
                "\t</head>\n";
    }
}
