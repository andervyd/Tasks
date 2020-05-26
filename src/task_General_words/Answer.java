package task_General_words;

/**
 *  Random Phrase Generation Program
 * "Think of the name of your book!"
 */

public class Answer {
    public static void main(String[] args) {
        String[] firstColumn = {"Moments", "Sky", "Ocean", "Pages", "Sea", "Pain", "Scraps", "Wounds",
                             "World", "Tears", "Roses", "Veins", "Paintings", "Rain", "Miles", "Autumn",
                             "Veins", "Lies", "Reflection", "Dawn", "Palms", "Sun", "Ashes", "Angel"};
        String[] secondColumn = {"yours", "opened", "decayed", "inside", "after", "ours", "lost", "among",
                                  "in the depths", "mine", "burned out", "abandoned", "torn", "killed", "closed",
                                  "forgotten", "dying", "from the inside", "lost", "each", "broken", "burned down"};
        String[] thirdColumn = {"eternity", "life", "death", "love", "pride", "tenderness", "pain", "sadness", "hatred", "affection",
                             "hope", "envy", "grief", "euphoria", "rage", "serenity", "faith", "anxiety", "blood", "grave",
                             "game", "emptiness", "infinity", "lightness", "apathy", "stupidity", "reality", "passion"};

        int noun_length = firstColumn.length,
            adjective_length = secondColumn.length,
            verb_length = thirdColumn.length;

        double  indexRandomNoun = Math.random() * noun_length,
                    indexRandomAdjective = Math.random() * adjective_length,
                    indexRandomVerb = Math.random() * verb_length;

            System.out.println("Name of the book: " + firstColumn[(int)indexRandomNoun] + " " + secondColumn[(int)indexRandomAdjective] + " " + thirdColumn[(int)indexRandomVerb] + ".");
    }
}
