

import java.util.ArrayList;
import java.util.List;


public class Baum {
// fields
    private double _anzahlWurzeln;
    private Ort _ort;
    private int _alter;
    private String _art;
    private List<Blatt> _blatt = new ArrayList<Blatt>();
//getter/setter
public double getAnzahlWurzeln() {
    return _anzahlWurzeln;
}
    public void setAnzahlWurzeln(double anzahlwurzeln) {
        this._anzahlWurzeln = anzahlwurzeln;
    }
    public int getAlter() {
        return _alter;
    }
    public void setAlter(int alter) {
        this._alter = alter;
    }
    public String getArt() {
        return _art;
    }
    public void setArt(String art) {
        this._art = art;
    }
    public List<Blatt> getBlatt() {
        return _blatt;
    }
    public boolean addBlatt(Blatt AddBlatt){
        if(AddBlatt == null){
            return false;
        }
        return this._blatt.add(AddBlatt);
    }
    public boolean removeBlatt(Blatt RemoveBlatt){
        if(RemoveBlatt == null){
            return false;
        }
        return this._blatt.remove(RemoveBlatt);
    }
    public Ort getOrt() {
        return _ort;
    }
    public void setOrt(Ort ort) {
        this._ort = ort;
    }
    public Baum(){
        this(0, 0.0, "", Ort.Welt);
    }
    public Baum(int alter, double anzahlwurzeln, String art, Ort ort){
        this.setAlter(alter);
        this.setAnzahlWurzeln(anzahlwurzeln);
        this.setArt(art);
        this.setOrt(ort);

    }


}
