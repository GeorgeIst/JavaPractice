package project.polimorfism;

public class Main {
    public static void main(String[] args) {

        Pet caine = new Dog();
        Pet psisica = new Cat();
        Pet leu = new Lion();
        Pet ciupacapra = new Ciupacapra();

        Pet [] petsList = {leu , psisica, caine, ciupacapra };

        for(Pet i : petsList){
            i.sleep();
        }
    }


}
