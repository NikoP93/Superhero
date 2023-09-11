public class Database {

    private Superhero[] superherolist;
    int count =0;

    public Database(){
        this.superherolist = new Superhero[5];
    }

    public void addSuperhero(Superhero superhero){
        superherolist[count] = superhero;
        count = count +1;
    }


}
