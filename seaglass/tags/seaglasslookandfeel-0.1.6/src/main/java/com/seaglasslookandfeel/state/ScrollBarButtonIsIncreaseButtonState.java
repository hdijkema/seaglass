/*
 * Copyright (c) 2009 Kathryn Huxtable and Kenneth Orr.
 *
 * This file is part of the SeaGlass Pluggable Look and Feel.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * $Id$
 */
package com.seaglasslookandfeel.state;

import javax.swing.JComponent;
import javax.swing.JScrollBar;

import com.seaglasslookandfeel.ui.SeaGlassScrollBarUI;

/**
 * Is scroll bar button the increase button (right or down)?
 */
public class ScrollBarButtonIsIncreaseButtonState extends State {
    public ScrollBarButtonIsIncreaseButtonState() {
        super("IncreaseButton");
    }

    public boolean isInState(JComponent c) {
        if (c != null && c.getParent() != null) {
            SeaGlassScrollBarUI ui = (SeaGlassScrollBarUI) ((JScrollBar) c.getParent()).getUI();
            if (ui.getIncreaseButton() == c) {
                return true;
            }
        }
        return false;
    }
}