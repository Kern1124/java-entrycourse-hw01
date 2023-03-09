package cz.muni.fi.pb162.hw01.impl.DisplayLogic;


public class CharacterObject {
    private char character;
    private String[] displayRepresentation;

    /**
     * Sets the display representation to the proper String values,
     * it first splits the 3-lined String into array of 3 Strings
     */
    private void setDisplayRepresentation(){
        switch(this.character){
            case '0':
                displayRepresentation = " _ \n| |\n|_|".split(System.lineSeparator());
                break;
            case '1':
                displayRepresentation = "   \n  |\n  |".split(System.lineSeparator());
                break;
            case '2':
                displayRepresentation = " _ \n _|\n|_ ".split(System.lineSeparator());
                break;
            case '3':
                displayRepresentation = " _ \n _|\n _|".split(System.lineSeparator());
                break;
            case '4':
                displayRepresentation = "   \n|_|\n  |".split(System.lineSeparator());
                break;
            case '5':
                displayRepresentation = " _ \n|_ \n _|".split(System.lineSeparator());
                break;
            case '6':
                displayRepresentation = "   \n|_ \n|_|".split(System.lineSeparator());
                break;
            case '7':
                displayRepresentation = " _ \n  |\n  |".split(System.lineSeparator());
                break;
            case '8':
                displayRepresentation = " _ \n|_|\n|_|".split(System.lineSeparator());
                break;
            case '9':
                displayRepresentation = " _ \n|_|\n  |".split(System.lineSeparator());
                break;
            case 'E':
                displayRepresentation = " _ \n|_ \n|_ ".split(System.lineSeparator());
                break;
            default:
                displayRepresentation = "   \n   \n   ".split(System.lineSeparator());
        }
    }

    /**
     * Checks whether the character is supported by the CharacterObject class
     * @param ch Character to be checked
     * @return Returns true if supported, else false
     */
    public boolean isSupported(char ch){
        return ((ch >= '0' && ch <= '9') || ch == '_');
    }

    /**
     * @param line The line which should be returned
     * @return Returns the specified (one of the three)
     * String line in the display representation of the character.
     */
    public String getLine(int line){
        return displayRepresentation[line];
    }

    /**
     * CharacterObject is mutable. With this method,
     * we change the character stored in the CharacterObject.
     * Display representation changes together with the character.
     * @param ch New character to be set.
     */
    public void setCharacter(char ch){
        if (this.isSupported(ch)){
            this.character = ch;
        }else {
            this.character = 'E';
        }
        setDisplayRepresentation();
    }

    /**
     * Creates a new CharacterObject
     * @param ch Character to be set in the newly created CharacterObject
     */
    public CharacterObject(char ch){
        setCharacter(ch);
    }


}
