
public class MyPet {
    public static void main(String[] args) {
        MyPet myPet = new MyPet();
    }
    public String name;
    public String gender;
    public double height;
    public float age;
    public String color;

    public String introduceMyPet(){
        return "Hello my dear reader." + " Here is an information on my favorite pet." +
        "\nMy pet's name is " + name + "." +
        "\nIt is a "+ gender+ " dog." +" "+ name + " is about "+ height+ "cm long, I would say a small dog."+
        "\n"+ name+ " is about "+ age + " years old. "+ name + " is in " + color + "." +
        "\nThat is all about my Pet :) ";
    }
  }
