
//Attributes
public class Superhero {
    private String name;
    private String realName;
    private String superPower;
    private int yearCreated;
    private String isHuman;
    private String strenght;

    //konstruktør
    public Superhero (String name, String realName,
                      String superPower, int yearCreated, String isHuman, String strenght)
    {
        this.name=name;
        this.realName=realName;
        this.superPower=superPower;
        this.yearCreated=yearCreated;
        this.isHuman=isHuman;
        this.strenght=strenght;
    }

    //get metoder
    public String getName(){
        return name;
    }
    public String getRealName(){
        return realName;
    }

    public String getSuperPower(){
        return superPower;
    }

    public int getYearCreated(){
        return yearCreated;
    }

    public String getIshuman(){
        return isHuman;
    }

    public String getStrenght(){
        return strenght;
    }



    //to String
    @Override
    public String toString() {
        return "Superhero: " + " " + name + ", " + realName + ", " + superPower + " ," + yearCreated  + ", " + isHuman + " ," + strenght;
    }
}

