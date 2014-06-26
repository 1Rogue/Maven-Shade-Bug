/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codelanx.bugexample;

import com.codelanx.codelanxlib.config.ConfigMarker;

/**
 * Class description for {@link ConfigValue}
 *
 * @since 1.0.0
 * @author 1Rogue
 * @version 1.0.0
 */
public enum ConfigValue implements ConfigMarker<ConfigValue> {
    
    TEST;

    @Override
    public String getPath() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object getDefault() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
