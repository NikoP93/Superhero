public class Database {

    //Array
    private Superhero[] superherolist;
    int count =0;

    //array
    public Database(){
        this.superherolist = new Superhero[5];
    }

    //metode til at adde til array
    public void addSuperhero(Superhero superhero){
        superherolist[count] = superhero;
        count = count +1;
    }


}
