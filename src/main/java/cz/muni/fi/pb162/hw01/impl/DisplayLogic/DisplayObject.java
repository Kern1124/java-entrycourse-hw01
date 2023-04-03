package cz.muni.fi.pb162.hw01.impl.DisplayLogic;

import cz.muni.fi.pb162.hw01.impl.displays.Display;

public class DisplayObject implements Display {
    private int displaySize;
    private char[] charsToDisplay;
    private CharacterObject[] displayableText;

    /**
     *
     * @return Returns the size of the display.
     */
    public int getDisplaySize(){
        return this.displaySize;
    }

    /**
     * Creates a new DisplayObject.
     * @param size Determines how many slots for symbols shall the DisplayObject have,
     *             therefore, the size of the display
     */
    public DisplayObject(int size){
        this.displaySize = size;
        displayableText = new CharacterObject[displaySize];
        for (int i = 0; i < size; i++){
            displayableText[i] = new CharacterObject('_');
        }
    }

    /**
     *
     * @return Returns the array of characters represented by the CharacterObject objects,
     * these objects have a display representation.
     */
    public CharacterObject[] getDisplayableText(){
        return displayableText;
    }

    @Override
    public void set(String text) {
        this.charsToDisplay = text.toCharArray();
        for (int i = 0; i < charsToDisplay.length && i < this.displaySize; i++) {
            displayableText[i].setCharacter(charsToDisplay[i]);
        }
    }

    @Override
    public void set(int pos, String text) {
        for (int i = 0; i < text.length() && pos < this.displaySize; i++){
            displayableText[pos].setCharacter(text.toCharArray()[i]);
            pos++;
        }
        for (int i = pos; i < this.displaySize; i++){
            displayableText[i].setCharacter('_');
        }
    }
    @Override
    public void clear() {
        for (CharacterObject ch : this.displayableText){
            ch.setCharacter('_');
        }
    }

    @Override
    public void clear(int pos) {
        displayableText[pos].setCharacter('_');
    }
}
