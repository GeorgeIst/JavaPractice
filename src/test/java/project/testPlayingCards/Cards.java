package project.testPlayingCards;

public class Cards {

    CardsType type;
    CardsNumber number;

    @Override
    public String toString() {
        return number + " of " + type;
    }

    public Cards(CardsType type, CardsNumber number) {
        this.type = type;
        this.number = number;

    }
    public void printCards(){
        System.out.println(toString());
    }
}
