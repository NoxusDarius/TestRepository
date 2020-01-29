public class MyMath {
   //statische Members(Methoden bzw Felder)
    public static  final double MyPI=3.141415;
    //WÜrde mann so nicht machen
    public  final double MyPI_NonStatic =3.141415;

    //statische Methode
    public static  double DegreeToRadiant(double degree){

        return degree *2*Math.PI/360;
    }
    public static  double RadiantToDegree(double radiant){

        return radiant * 360 /(2*Math.PI);
    }


}
