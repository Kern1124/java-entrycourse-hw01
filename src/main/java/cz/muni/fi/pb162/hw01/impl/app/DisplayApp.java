package cz.muni.fi.pb162.hw01.impl.app;

import cz.muni.fi.pb162.hw01.cmd.Application;
import cz.muni.fi.pb162.hw01.impl.DisplayLogic.DisplayObject;
import cz.muni.fi.pb162.hw01.impl.DisplayLogic.Printer;


/**
 * Display application
 */

public class DisplayApp implements Application<DisplayAppOptions> {

    /**
     * Runtime logic of the application
     *
     * @param options
     * @return exit status code
     */
    public int run(DisplayAppOptions options) {
        DisplayObject display = new DisplayObject(options.getSize());
        Printer p = new Printer();

        display.set(options.getText());
        p.printDisplay(display);
        return 0;
    }
}
