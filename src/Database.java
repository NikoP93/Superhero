import java.util.ArrayList;

public class Database {

    //Array
    private ArrayList<Superhero> superherolist;
    //int count;

    //array
    public Database(){
        this.superherolist = new ArrayList<>();
    }


    //metode til at adde til array
    public void addSuperhero(Superhero superhero){
        //superherolist[count] = superhero;
        //count = count +1;
        superherolist.add(superhero);
    }


}
