class Scrabble {

    int score = 0;

    Scrabble(String word) {
        for (int i = 0; i < word.length(); i++) {
            score += getLetterScore(word.charAt(i));
        }
    }

    int getScore() {
        return score;
    }

    int getLetterScore(char letter) {
        letter = Character.toLowerCase(letter);
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'l' || letter == 'n' || letter == 'r' || letter == 's' || letter == 't') {
            return 1;
        }
        if (letter == 'd' || letter == 'g') {
            return 2;
        }
        if (letter == 'b' || letter == 'c' || letter == 'm' || letter == 'p') {
            return 3;
        }
        if (letter == 'f' || letter == 'h' || letter == 'v' || letter == 'w' || letter == 'y') {
            return 4;
        }
        if (letter == 'k') {
            return 5;
        }
        if (letter == 'j' || letter == 'x') {
            return 8;
        }
        if (letter == 'q' || letter == 'z') {
            return 10;
        }
        return 0;
    }
}
