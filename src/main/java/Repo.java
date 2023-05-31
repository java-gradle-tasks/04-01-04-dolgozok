import java.util.ArrayList;
import java.util.List;

public class Repo {
    private List<Dolgozo> dolgozok = new ArrayList<Dolgozo>();

    public Repo()
    {
        dolgozok = new ArrayList<Dolgozo>();
        dolgozok.add(new Dolgozo("Buktató Bence",true,5730));
        dolgozok.add(new Dolgozo("Hangos Helga",false,4970));
        dolgozok.add(new Dolgozo("Felfeltető Ferenc",true,6100));
        dolgozok.add(new Dolgozo("Mérges Margó",false,5825));
        dolgozok.add(new Dolgozo("Szelíd Szonja",false,4980));

    }

    public List<Dolgozo> getDolgozok() {
        return dolgozok;
    }
}
