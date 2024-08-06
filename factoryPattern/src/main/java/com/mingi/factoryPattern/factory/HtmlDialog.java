package com.mingi.factoryPattern.factory;

import com.mingi.factoryPattern.button.Button;
import com.mingi.factoryPattern.button.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}