public class Blackjack {

    public int parseCard(String card) {
        if (card == "ace") {
            return 11;
        }
        if (card == "two") {
            return 2;
        }
        if (card == "three") {
            return 3;
        }
        if (card == "four") {
            return 4;
        }
        if (card == "five") {
            return 5;
        }
        if (card == "six") {
            return 6;
        }
        if (card == "seven") {
            return 7;
        }
        if (card == "eight") {
            return 8;
        }
        if (card == "nine") {
            return 9;
        }
        if (card == "ten") {
            return 10;
        }
        if (card == "jack") {
            return 10;
        }
        if (card == "queen") {
            return 10;
        }
        if (card == "king") {
            return 10;
        }
        return 0;
    } 

    public boolean isBlackjack(String card1, String card2) {
        if (parseCard(card1) + parseCard(card2) == 21) {
            return true;
        }
        return false;
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
        if (isBlackjack) {
            if (dealerScore < 10) {
                return "W";
            }
            return "S";
        }
        return "P";
    }

    public String smallHand(int handScore, int dealerScore) {
        if (handScore >= 17) {
            return "S";
        }
        if (handScore <= 11) {
            return "H";
        } 
        if (dealerScore > 6) {
            return "H";
        }
        return "S";
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
