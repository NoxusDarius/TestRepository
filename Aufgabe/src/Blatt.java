public class Blatt {
    //fields
    private double _größe;
    private String _farbe;
    private String _form;

    //getter/setter

    public double getGröße() {
        return _größe;
    }
    public void setGröße(double größe) {
        this._größe = größe;
    }
    public String getFarbe() {
        return _farbe;
    }
    public void setFarbe(String farbe) {
        this._farbe = farbe;
    }
    public String getform() {
        return _form;
    }
    public void setForm(String form) {
        this._form= form;
    }
    //ctors
    public Blatt(){
        this(0.0, "", "");
    }
    public Blatt(double größe, String farbe,String form){
        this.setFarbe(farbe);
        this.setForm(form);
        this.setGröße( größe);
    }
    @Override
    public String toString(){
        return this.getFarbe() + " " + this.getform() + "\n" +
                this.getGröße() ;
    }


}
