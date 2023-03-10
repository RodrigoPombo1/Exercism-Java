class SqueakyClean {
    static String clean(String identifier) {
        // task 1
        identifier = identifier.replace(" ", "_");
        // task 3
        boolean nextCharFlag = false;
        for (int i = 0; i < identifier.length(); i++) {
            char currentChar = identifier.charAt(i);
            // task 2
            if (Character.isISOControl(currentChar)) {
                if (i + 1 != identifier.length()) {
                    identifier = identifier.substring(0, i) + "CTRL" + identifier.substring(i + 1, identifier.length());
                } else {
                    identifier = identifier.substring(0, i) + "CTRL";
                }
                i+=3;
                continue;
            }
            // task 3
            if (currentChar == '-') {
                nextCharFlag = true;
            }
            // task 4
            if (!Character.isLetter(currentChar) && currentChar != '_') {
                if (i + 1 != identifier.length()) {
                    identifier = identifier.substring(0, i) + identifier.substring(i+1, identifier.length());
                } else {
                    identifier = identifier.substring(0, i);
                }
                    i--;
                continue;
            }
            // task 5
            if ('α' <= currentChar &&  currentChar <= 'ω') {
                if (i + 1 != identifier.length()) {
                    identifier = identifier.substring(0, i) + identifier.substring(i+1, identifier.length());
                } else {
                    identifier = identifier.substring(0, i);
                }
                i--;
                continue;
            }
            // task 3
            if (nextCharFlag) {
                if (i + 1 != identifier.length()) {
                    identifier = identifier.substring(0, i) + Character.toUpperCase(identifier.charAt(i)) + identifier.substring(i+1, identifier.length());
                } else {
                    identifier = identifier.substring(0, i) + Character.toUpperCase(identifier.charAt(i));
                }
                nextCharFlag = false;
            }
        }
        return identifier;
    }
}