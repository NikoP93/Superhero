import java.util.ArrayList;

public class Database {

    //Array
    private ArrayList<Superhero> superherolist;
    //int count;

    //array
    public Database() {
        this.superherolist = new ArrayList<>();
    }

    //get metode
    public ArrayList<Superhero> getSuperherolist() {
        return superherolist;
    }

    //metode til at adde til arraylist
    public void addSuperhero(Superhero superhero) {
        //superherolist[count] = superhero;
        //count = count +1;
        superherolist.add(superhero);
    }

    public ArrayList<String> findSuperhero(String name){
        ArrayList<String> superhero = new ArrayList<>();

        for (Superhero hero : superherolist){
            if (hero.getName().toLowerCase().contains(name.toLowerCase())) {
                if (!name.contains(hero.getName())){
                    superhero.add(hero.getName());
                }
            }
        }
        return superhero;
    }


}
