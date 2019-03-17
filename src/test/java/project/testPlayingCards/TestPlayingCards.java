package project.testPlayingCards;

import org.junit.Test;

public class TestPlayingCards {

    @Test
    public void testCards(){

        Cards cards1 = new Cards(CardsType.HEARTS, CardsNumber.THREE);
        Cards cards2 = new Cards(CardsType.DIAMOND, CardsNumber.ACE);
        Deck deck1 = new Deck();
        deck1.deckCreator();
        deck1.prinDeck();


    }
}
