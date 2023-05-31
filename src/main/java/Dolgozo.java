public class Dolgozo {
    private String nev;
    private boolean ferfi;
    private double fizetes;

    public Dolgozo(String nev, boolean ferfi, double fizetes) {
        this.nev = nev;
        this.ferfi = ferfi;
        this.fizetes = fizetes;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public boolean isFerfi() {
        return ferfi;
    }

    public void setFerfi(boolean ferfi) {
        this.ferfi = ferfi;
    }

    public double getFizetes() {
        return fizetes;
    }

    public void setFizetes(double fizetes) {
        this.fizetes = fizetes;
    }

    @Override
    public String toString() {
        return "Dolgozo{" +
                "nev='" + nev + '\'' +
                ", ferfi=" + ferfi +
                ", fizetes=" + fizetes +
                '}';
    }
}
