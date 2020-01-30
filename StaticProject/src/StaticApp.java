class StaticApp {

    public static void main(String[] args) {
        //verwenden der Statischen Konstante MYPi
        System.out.printf("MyPi= %.2\n", MyMath.MyPI);
        // verwenden der nicht statischen Konstante
        MyMath myM=new MyMath();
        System.out.printf("MYPi_Nicht Static: 5.2f\n", myM.MyPI_NonStatic);


        // die nicht statische Mehtode muss über die Instanz Variable myM aufgerufen werden
        System.out.println(myM.NonStatic());


    }

}
