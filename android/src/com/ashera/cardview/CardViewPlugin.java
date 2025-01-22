package com.ashera.cardview;

import com.ashera.widget.WidgetFactory;

public class CardViewPlugin  {
    public static void initPlugin() {
    	//start - widgets
        WidgetFactory.register(new com.ashera.cardview.CardViewImpl());
        //end - widgets
    }
}
