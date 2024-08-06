package com.mingi.factoryPattern.factory;

import com.mingi.factoryPattern.button.Button;
import com.mingi.factoryPattern.button.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}