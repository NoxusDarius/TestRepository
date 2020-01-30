public class MyMath {

    //WIchtig
        /*Statische  Members (Felder und Methoden) können inm Hauptprogramm oder in anderen Klassen ohne erzeugung einer Instanz verwendet werden -es muss nur der Klassenname
        und durhc Punkt getrennt der Membername angeg. werden

        statische Members werden nur ein einziges mal erzeugt
        werden im Hauptprogramm z.b. 10 Instanzen einer Klasse mit statischen Feldern erzeugt existiert dieses Feld nur ein einziges Mal für alle Instanzen
        Normale Members (Felder) werden pro Instanz erzeugt; bei 10 Instanzen existiert dieses Feld (z.b. Firstname) 10 mal im Speicher

        //in einer Statischen Methde darf man nur auf statische Felder oder Methoden zugreifen oder verwenden



         */
   //statische Members(Methoden bzw Felder)
    public static  final double MyPI=3.141415;
    //WÜrde mann so nicht machen
    public  final double MyPI_NonStatic =3.141415;

    public double wert=10;

    //statische Methode
    public static  double DegreeToRadiant(double degree){
    //z.b. wert darf in dieser Methode nicht verwendet werden da Wert nicht statisch ist und die Methode aber schon
        return degree *2*Math.PI/360;
    }
    public static  double RadiantToDegree(double radiant){

        return radiant * 360 /(2*Math.PI);
    }


    //nicht statische Methode
    public double NonStatic(){
        //wichtig: in einer nicht statischen Methoden dürfen normale und nicht statische Members verwendet werden
        return wert*MyPI*RadiantToDegree((wert));
    }



}
