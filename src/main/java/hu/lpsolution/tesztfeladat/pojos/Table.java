package hu.lpsolution.tesztfeladat.pojos;

public class Table {
    private Row row1;
    private Row row2;

    public Table() {
    }

    public Table setRow1(Row row1) {
        this.row1 = row1;
        return this;
    }

    public Table setRow2(Row row2) {
        this.row2 = row2;
        return this;
    }

    public Row getRow1() {
        return row1;
    }

    public Row getRow2() {
        return row2;
    }

    @Override
    public String toString() {
        return "\t\t<table border=\"1px solid black\">\n" +
                row1 +
                row2 +
                "\t\t</table>\n";
    }
}
