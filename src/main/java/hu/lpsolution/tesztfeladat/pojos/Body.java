package hu.lpsolution.tesztfeladat.pojos;

public class Body {
    private final String h1 = "<h1>Teszt Feladat</h1>\n";
    private final String PLACEHOLDER = "PLACEHOLDER";
    private String repoUrl ="<p><a href=\"" + PLACEHOLDER + "\">Megoldás</a></p>\n";
    private final String adatok = "<p>A feladat elkészítőjének adatai</p>\n";
    private final String lps = "<a href=\"http://lpsolutions.hu\">L&P Solutions</a>\n";
    private Table table;

    public Body setTable(Table table) {
        this.table = table;
        return this;
    }

    public Body setRepoUrl(String url) {
        this.repoUrl = repoUrl.replace(PLACEHOLDER, url);
        return this;
    }

    @Override
    public String toString() {
        return "\t<body>\n" +
                "\t\t" + h1 +
                "\t\t" + repoUrl +
                "\t\t" + adatok +
                table +
                "\t\t" + lps;
    }
}

