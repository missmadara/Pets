
public class MyDreamPet {
    public static void main(String[] args) {
        MyDreamPet myDreamPet = new MyDreamPet();
    }
    public String name;
    public String latin;
    public String species;
    public String location;
    public float length;
    public double kilograms;
    public int legs;

    public String introduceMyDreamPet(){
        return "\n"+"Hello again! Here is my dream pet " + name + "." +
        "\nIts latin name is "+ latin+ "." + " It comes from " + species + " family."+
        "\n"+latin+ " are located" + location + ", I hope at the nearest future I can travel there." +
        "\nThis " + species + " can grow up to " + length +"meters " + " and " + kilograms + " kilograms heavy. Beautiful isn't it?!"+
        "\nIt has " + legs + " strong legs and has a venomous bite.. how cool is that?!" +
                "\n Well.. they occasionally attack humans .. ";
    }
}
