package project.testPlayingCards;

public class Deck {

    Cards[] carti;

    public void prinDeck() {
        System.out.println("Deck: ");
        for (Cards cards : carti) {
            cards.printCards();

        }

    }

    public Deck() {
        this.carti = new Cards[52];
    }

    public void deckCreator() {
        int counter = 0;
        CardsType[] type = CardsType.values();
        CardsNumber[] numar = CardsNumber.values();
        for (int i = 0; i < type.length; i++) {
            for (int j = 0; j < numar.length; j++) {

                Cards a1 = new Cards(type[i], numar[j]);
                carti[counter] = a1;
                counter++;


            }

        }
    }


}
