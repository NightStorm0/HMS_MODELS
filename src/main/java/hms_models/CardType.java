package hms_models;

public class CardType {
    public static enum Type {
        FAMILY_CARD,
        INDIVIDUAL_CARD,
        TEMPORARY_CARD,
        SINGLE_CARD,
        ANTENATAL_CARD
    }

    public Type[] getAllTypes() {
        return Type.values();
    }
}