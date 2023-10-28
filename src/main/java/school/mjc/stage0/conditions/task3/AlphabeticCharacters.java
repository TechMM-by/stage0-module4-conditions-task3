package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        int ascii = character;
        if (ascii == 65 || ascii == 69 || ascii == 73 || ascii == 79 || ascii == 85 ||
                ascii == 97 || ascii == 101 || ascii == 105 || ascii == 111 || ascii == 117) {
            System.out.println("Vowel");
        }

        if (
                (ascii >= 66 && ascii <= 90 && ascii != 69 && ascii != 73 && ascii != 79 &&  ascii != 85 ) ||
                        (ascii >= 98 && ascii <= 122 && ascii != 101 && ascii != 105 && ascii != 111 && ascii != 117)
        ) {
            System.out.println("Consonant");
        }
        if ( (ascii < 65 || ascii > 90) && (ascii < 97 || ascii > 122) ) {
            System.out.println("wrong alphabet!");
        }
    }
}
