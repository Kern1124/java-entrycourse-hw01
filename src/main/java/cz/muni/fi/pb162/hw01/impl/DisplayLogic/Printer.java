package cz.muni.fi.pb162.hw01.impl.DisplayLogic;

import cz.muni.fi.pb162.hw01.impl.displays.Display;
import cz.muni.fi.pb162.hw01.impl.displays.DisplayStringifier;

public class Printer implements DisplayStringifier {
    @Override
    public boolean canStringify(Display display) {
        return true;
    }

    @Override
    public String[] asLines(Display display) {
        CharacterObject[] text = ((DisplayObject)display).getDisplayableText();
        String[] lines = new String[3];

        for (int line = 0; line < 3; line++){
            lines[line] = "";
            for (int i = 0; i < ((DisplayObject) display).getDisplaySize(); i++){
                lines[line] += text[i].getLine(line);
            }
        }

        return lines;

    }
    @Override
    public String asString(Display display) {
        String[] lines = asLines(display);
        return lines[0] + '\n' + lines[1] + '\n' + lines[2];
    }

    /**
     * Prints the display to stdout.
     * @param display The display that shall be printed.
     */
    public void printDisplay(Display display){
        System.out.print(asString(display));
    }
}
