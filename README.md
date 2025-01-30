# CardView
Project which adds support for android CardView.

## Installation
To install the plugin use:

```
cordova plugin add https://github.com/AsheraCordova/CardView.git
```

## Important Links
https://asheracordova.github.io/

https://asheracordova.github.io/doc/help-doc.html

https://asheracordova.github.io/doc/androidx/cardview/widget/CardView.html

## Widgets
* androidx.cardview.widget.CardView
* 
## CardView (ios)
IOS does not support setting cornerRadius and shadow on the same layer. Corner Radius requires clipBounds to be set on the view while setting clipBounds causes shadow to be hidden.

To overcome this, the following link [https://stackoverflow.com/questions/70465844/how-can-i-add-some-shadow-and-rounded-corners-to-my-collectionviewcell] suggests adding parent view to the view which has exactly the same frame as the child view but shadow being set to parent view and corner radius set to child view.

Ashera using simple wrapable view to achieve the same. Set attribute enableFeatures to decorator. This will create a parent view and shadow will be set on the parent view.

## CardView (swt)
Rounded corners is not supported in swt linux as setting background with clipped region does not work as expected and entire children seems to be hidden and only the background is visible.
