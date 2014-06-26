/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codelanx.bugexample;

import com.codelanx.codelanxlib.CodelanxPlugin;
import com.codelanx.codelanxlib.config.ConfigMarker;

/**
 * Class description for {@link BugExample}
 *
 * @since 1.0.0
 * @author 1Rogue
 * @version 1.0.0
 */
public class BugExample extends CodelanxPlugin<BugExample> {

    public <T extends Enum<T> & ConfigMarker<T>> BugExample(String command, Class<T> config) {
        super(command, config);
    }

}
