/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codelanx.bugexample;

import com.codelanx.codelanxlib.command.TabInfo;
import java.util.ArrayList;


/**
 * Class description for {@link BugExample}
 *
 * @since 1.0.0
 * @author 1Rogue
 * @version 1.0.0
 */
public class BugExample {

    public void foo() {
        TabInfo info = new TabInfo();
        info.map(0, () -> new ArrayList<>());
    }

}
