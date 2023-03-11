abstract class Fighter {
    boolean isVulnerable() {
        return false;
    }

    abstract int damagePoints(Fighter fighter);

}

class Warrior extends Fighter {

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    int damagePoints(Fighter wizard) {
        if (wizard.isVulnerable()) {
            return 10;
        }
        return 6;
    }
}

class Wizard extends Fighter {
    boolean spellPrepared = false;

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

    @Override
    boolean isVulnerable() {
        if (spellPrepared) {
            return false;
        }
        return true;
    }

    @Override
    int damagePoints(Fighter warrior) {
        if (spellPrepared) {
            return 12;
        }
        return 3;
    }

    void prepareSpell() {
        spellPrepared = true;
    }
}
