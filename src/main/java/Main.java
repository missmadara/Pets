
public class Main {

    public static void main(String[] args) {
        MyPet pet = new MyPet();

        pet.name = "Roko";
        pet.gender = "male";
        pet.height = 70d;
        pet.age = 3f;
        pet.color = "mainly brown but with some other shades, like black, red";

        System.out.println(pet.introduceMyPet());



    MyDreamPet myDreamPet = new MyDreamPet();

    myDreamPet.name ="Sweetie";
    myDreamPet.latin ="Varanus komodoensis";
    myDreamPet.species ="lizard";
    myDreamPet.location ="Indonesian islands of Komodo, Rinca, Flores and Gili Montag";
    myDreamPet.length =3f;
    myDreamPet.kilograms =70f;
    myDreamPet.legs =4;

        System.out.println(myDreamPet.introduceMyDreamPet());
}

}
