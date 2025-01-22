package com.ashera.cardview;
// start - imports
import java.util.*;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.view.*;
import android.widget.*;
import android.view.View.*;

import com.ashera.widget.BaseHasWidgets;

import android.annotation.SuppressLint;

import com.ashera.core.IFragment;
import com.ashera.widget.bus.*;
import com.ashera.converter.*;
import com.ashera.widget.bus.Event.*;
import com.ashera.widget.*;
import com.ashera.widget.IWidgetLifeCycleListener.*;
import com.ashera.layout.*;

import android.graphics.Canvas;
import android.widget.*;
import androidx.core.view.*;
import android.view.*;

import static com.ashera.widget.IWidget.*;
//end - imports

import android.content.res.ColorStateList;

public class CardViewImpl extends BaseHasWidgets {
	//start - body
	public final static String LOCAL_NAME = "androidx.cardview.widget.CardView"; 
	public final static String GROUP_NAME = "androidx.cardview.widget.CardView";
	private androidx.cardview.widget.CardView cardView;
	

	
	@Override
	public void loadAttributes(String localName) {
		ViewGroupImpl.register(localName);

		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("foregroundGravity").withType("gravity"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("measureAllChildren").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("cardUseCompatPadding").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("cardBackgroundColor").withType("colorstate"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("contentPaddingLeft").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("contentPaddingRight").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("contentPaddingTop").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("contentPaddingBottom").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("contentPadding").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("cardCornerRadius").withType("dimensionfloat"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("cardElevation").withType("dimensionfloat"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("cardMaxElevation").withType("dimensionfloat"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("cardPreventCornerOverlap").withType("boolean"));
	
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_gravity").withType("gravity").forChild());
	}
	
	public CardViewImpl() {
		super(GROUP_NAME, LOCAL_NAME);
	}
	public  CardViewImpl(String localname) {
		super(GROUP_NAME, localname);
	}
	public  CardViewImpl(String groupName, String localname) {
		super(groupName, localname);
	}

	@Override
	public IWidget newInstance() {
		return new CardViewImpl(groupName, localName);
	}
	
	@SuppressLint("NewApi")
	@Override
	public void create(IFragment fragment, Map<String, Object> params) {
		super.create(fragment, params);
Context context = (Context) fragment.getRootActivity();
	Object systemStyle = params.get("systemStyle");
	Object systemAndroidAttrStyle = params.get("systemAndroidAttrStyle");
	
	if (systemStyle == null && systemAndroidAttrStyle == null) {
		cardView = new CardViewExt(context);
	} else {
		int defStyleAttr = 0;
		int defStyleRes = 0;
		
		if (systemStyle != null) {
			defStyleRes = context.getResources().getIdentifier((String) systemStyle, "style", context.getPackageName());	
		}
		
		if (systemAndroidAttrStyle != null) {
			defStyleAttr = context.getResources().getIdentifier((String) systemAndroidAttrStyle, "attr", "android");	
		}
		
		if (defStyleRes == 0) {
			cardView = new CardViewExt(context, null, defStyleAttr);	
		} else {
		}
		
	}

		
		nativeCreate(params);
		
		
		ViewGroupImpl.registerCommandConveter(this);

	}

	@Override
	public Object asWidget() {
		return cardView;
	}

	@Override
	public boolean remove(IWidget w) {
		boolean remove = super.remove(w);
		cardView.removeView((View) w.asWidget());
		return remove;
	}
	
	@Override
    public boolean remove(int index) {
		IWidget widget = widgets.get(index);
        boolean remove = super.remove(index);

        if (index + 1 <= cardView.getChildCount()) {
            cardView.removeViewAt(index);
        }    
        return remove;
    }

	
	@Override
	public void add(IWidget w, int index) {
		if (index != -2) {
			View view = (View) w.asWidget();
			createLayoutParams(view);
			    if (index == -1) {
			        cardView.addView(view);
			    } else {
			        cardView.addView(view, index);
			    }
		}
		
		ViewGroupImpl.nativeAddView(asNativeWidget(), w.asNativeWidget());
		super.add(w, index);
	}
	
	private void createLayoutParams(View view) {
		androidx.cardview.widget.CardView.LayoutParams layoutParams = (androidx.cardview.widget.CardView.LayoutParams) view.getLayoutParams();
		
		layoutParams = (androidx.cardview.widget.CardView.LayoutParams) view.getLayoutParams();
		if (layoutParams == null) {
			layoutParams = new androidx.cardview.widget.CardView.LayoutParams(-2, -2);
			view.setLayoutParams(layoutParams);
		}  else {
			layoutParams.height = -2;
			layoutParams.width = -2;
		}
	}
	
	private androidx.cardview.widget.CardView.LayoutParams getLayoutParams(View view) {
		return (androidx.cardview.widget.CardView.LayoutParams) view.getLayoutParams();		
	}
	
	@SuppressLint("NewApi")
	@Override
	public void setChildAttribute(IWidget w, WidgetAttribute key, String strValue, Object objValue) {
		View view = (View) w.asWidget();
		androidx.cardview.widget.CardView.LayoutParams layoutParams = getLayoutParams(view);
		ViewGroupImpl.setChildAttribute(w, key, objValue, layoutParams);		
		
		switch (key.getAttributeName()) {
		case "layout_width":
			layoutParams.width = (int) objValue;
			break;	
		case "layout_height":
			layoutParams.height = (int) objValue;
			break;
			case "layout_gravity": {
				
							layoutParams.gravity = ((int)objValue);
				
			}
			break;
		default:
			break;
		}
		
		
		view.setLayoutParams(layoutParams);		
	}
	
	@SuppressLint("NewApi")
	@Override
	public Object getChildAttribute(IWidget w, WidgetAttribute key) {
		Object attributeValue = ViewGroupImpl.getChildAttribute(w, key);		
		if (attributeValue != null) {
			return attributeValue;
		}
		View view = (View) w.asWidget();
		androidx.cardview.widget.CardView.LayoutParams layoutParams = getLayoutParams(view);

		switch (key.getAttributeName()) {
		case "layout_width":
			return layoutParams.width;
		case "layout_height":
			return layoutParams.height;
			case "layout_gravity": {
return layoutParams.gravity;			}

		}
		
		return null;

	}
	
		
	public class CardViewExt extends androidx.cardview.widget.CardView implements ILifeCycleDecorator, com.ashera.widget.IMaxDimension{
		private MeasureEvent measureFinished = new MeasureEvent();
		private OnLayoutEvent onLayoutEvent = new OnLayoutEvent();
		
		public IWidget getWidget() {
			return CardViewImpl.this;
		}
		private int mMaxWidth = -1;
		private int mMaxHeight = -1;
		@Override
		public void setMaxWidth(int width) {
			mMaxWidth = width;
		}
		@Override
		public void setMaxHeight(int height) {
			mMaxHeight = height;
		}
		@Override
		public int getMaxWidth() {
			return mMaxWidth;
		}
		@Override
		public int getMaxHeight() {
			return mMaxHeight;
		}

		public CardViewExt(Context context, android.util.AttributeSet attrs, int defStyleAttr) {
	        super(context, attrs, defStyleAttr);
	    }

		public CardViewExt(Context context) {
			super(context);
			
		}
		
		@Override
		public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

			if(mMaxWidth > 0) {
	        	widthMeasureSpec = MeasureSpec.makeMeasureSpec(mMaxWidth, MeasureSpec.AT_MOST);
	        }
	        if(mMaxHeight > 0) {
	            heightMeasureSpec = MeasureSpec.makeMeasureSpec(mMaxHeight, MeasureSpec.AT_MOST);

	        }

	        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
			IWidgetLifeCycleListener listener = (IWidgetLifeCycleListener) getListener();
			if (listener != null) {
			    measureFinished.setWidth(getMeasuredWidth());
			    measureFinished.setHeight(getMeasuredHeight());
				listener.eventOccurred(EventId.measureFinished, measureFinished);
			}
		}
		
		@Override
		protected void onLayout(boolean changed, int l, int t, int r, int b) {
			super.onLayout(changed, l, t, r, b);
			
			ViewImpl.nativeMakeFrame(asNativeWidget(), l, t, r, b);
			
			replayBufferedEvents();
			
			IWidgetLifeCycleListener listener = (IWidgetLifeCycleListener) getListener();
			if (listener != null) {
				onLayoutEvent.setB(b);
				onLayoutEvent.setL(l);
				onLayoutEvent.setR(r);
				onLayoutEvent.setT(t);
				onLayoutEvent.setChanged(changed);
				listener.eventOccurred(EventId.onLayout, onLayoutEvent);
			}
			
			if (isInvalidateOnFrameChange() && isInitialised()) {
				CardViewImpl.this.invalidate();
			}
		}	
		
		@Override
		public void onDraw(Canvas canvas) {
			Runnable runnable = () -> super.onDraw(canvas);
			executeMethodListeners("onDraw", runnable, canvas);
		}

		@Override
		public void draw(Canvas canvas) {
			Runnable runnable = () -> super.draw(canvas);
			executeMethodListeners("draw", runnable, canvas);
		}

		@SuppressLint("WrongCall")
		@Override
		public void execute(String method, Object... args) {
			switch (method) {
				case "onDraw":
					setOnMethodCalled(true);
					super.onDraw((Canvas) args[0]);
					break;

				case "draw":
					setOnMethodCalled(true);
					super.draw((Canvas) args[0]);
					break;

				default:
					break;
			}
		}

		public void updateMeasuredDimension(int width, int height) {
			setMeasuredDimension(width, height);
		}


		@Override
		public ILifeCycleDecorator newInstance(IWidget widget) {
			throw new UnsupportedOperationException();
		}

		@Override
		public void setAttribute(WidgetAttribute widgetAttribute,
				String strValue, Object objValue) {
			throw new UnsupportedOperationException();
		}		
		

		@Override
		public List<String> getMethods() {
			throw new UnsupportedOperationException();
		}
		
		@Override
		public void initialized() {
			throw new UnsupportedOperationException();
		}
		
        @Override
        public Object getAttribute(WidgetAttribute widgetAttribute) {
            throw new UnsupportedOperationException();
        }
        @Override
        public void drawableStateChanged() {
        	super.drawableStateChanged();
        	if (!isWidgetDisposed()) {
        		ViewImpl.drawableStateChanged(CardViewImpl.this);
        	}
        }
        
    	public void setState0(float value) {
    		ViewImpl.setState(CardViewImpl.this, 0, value);
    	}
    	public void setState0(int value) {
    		ViewImpl.setState(CardViewImpl.this, 0, value);
    	}
    	public void setState0(double value) {
    		ViewImpl.setState(CardViewImpl.this, 0, value);
    	}
    	
    	public void setState0(Float value) {
    		ViewImpl.setState(CardViewImpl.this, 0, value);
    	}
    	public void setState0(Integer value) {
    		ViewImpl.setState(CardViewImpl.this, 0, value);
    	}
    	public void setState0(Double value) {
    		ViewImpl.setState(CardViewImpl.this, 0, value);
    	}
    	public void setState0(Object value) {
    		ViewImpl.setState(CardViewImpl.this, 0, value);
    	}
    	public void setState1(float value) {
    		ViewImpl.setState(CardViewImpl.this, 1, value);
    	}
    	public void setState1(int value) {
    		ViewImpl.setState(CardViewImpl.this, 1, value);
    	}
    	public void setState1(double value) {
    		ViewImpl.setState(CardViewImpl.this, 1, value);
    	}
    	
    	public void setState1(Float value) {
    		ViewImpl.setState(CardViewImpl.this, 1, value);
    	}
    	public void setState1(Integer value) {
    		ViewImpl.setState(CardViewImpl.this, 1, value);
    	}
    	public void setState1(Double value) {
    		ViewImpl.setState(CardViewImpl.this, 1, value);
    	}
    	public void setState1(Object value) {
    		ViewImpl.setState(CardViewImpl.this, 1, value);
    	}
    	public void setState2(float value) {
    		ViewImpl.setState(CardViewImpl.this, 2, value);
    	}
    	public void setState2(int value) {
    		ViewImpl.setState(CardViewImpl.this, 2, value);
    	}
    	public void setState2(double value) {
    		ViewImpl.setState(CardViewImpl.this, 2, value);
    	}
    	
    	public void setState2(Float value) {
    		ViewImpl.setState(CardViewImpl.this, 2, value);
    	}
    	public void setState2(Integer value) {
    		ViewImpl.setState(CardViewImpl.this, 2, value);
    	}
    	public void setState2(Double value) {
    		ViewImpl.setState(CardViewImpl.this, 2, value);
    	}
    	public void setState2(Object value) {
    		ViewImpl.setState(CardViewImpl.this, 2, value);
    	}
    	public void setState3(float value) {
    		ViewImpl.setState(CardViewImpl.this, 3, value);
    	}
    	public void setState3(int value) {
    		ViewImpl.setState(CardViewImpl.this, 3, value);
    	}
    	public void setState3(double value) {
    		ViewImpl.setState(CardViewImpl.this, 3, value);
    	}
    	
    	public void setState3(Float value) {
    		ViewImpl.setState(CardViewImpl.this, 3, value);
    	}
    	public void setState3(Integer value) {
    		ViewImpl.setState(CardViewImpl.this, 3, value);
    	}
    	public void setState3(Double value) {
    		ViewImpl.setState(CardViewImpl.this, 3, value);
    	}
    	public void setState3(Object value) {
    		ViewImpl.setState(CardViewImpl.this, 3, value);
    	}
    	public void setState4(float value) {
    		ViewImpl.setState(CardViewImpl.this, 4, value);
    	}
    	public void setState4(int value) {
    		ViewImpl.setState(CardViewImpl.this, 4, value);
    	}
    	public void setState4(double value) {
    		ViewImpl.setState(CardViewImpl.this, 4, value);
    	}
    	
    	public void setState4(Float value) {
    		ViewImpl.setState(CardViewImpl.this, 4, value);
    	}
    	public void setState4(Integer value) {
    		ViewImpl.setState(CardViewImpl.this, 4, value);
    	}
    	public void setState4(Double value) {
    		ViewImpl.setState(CardViewImpl.this, 4, value);
    	}
    	public void setState4(Object value) {
    		ViewImpl.setState(CardViewImpl.this, 4, value);
    	}
        	public void state0() {
        		ViewImpl.state(CardViewImpl.this, 0);
        	}
        	public void state1() {
        		ViewImpl.state(CardViewImpl.this, 1);
        	}
        	public void state2() {
        		ViewImpl.state(CardViewImpl.this, 2);
        	}
        	public void state3() {
        		ViewImpl.state(CardViewImpl.this, 3);
        	}
        	public void state4() {
        		ViewImpl.state(CardViewImpl.this, 4);
        	}
                        
        public void stateYes() {
        	ViewImpl.stateYes(CardViewImpl.this);
        	
        }
        
        public void stateNo() {
        	ViewImpl.stateNo(CardViewImpl.this);
        }
     
	
	}
	@Override
	public Class getViewClass() {
		return CardViewExt.class;
	}
	
	@SuppressLint("NewApi")
	@Override
	public void setAttribute(WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {
				ViewGroupImpl.setAttribute(this,  key, strValue, objValue, decorator);
		Object nativeWidget = asNativeWidget();
		switch (key.getAttributeName()) {
			case "foregroundGravity": {


	cardView.setForegroundGravity((int)objValue);



			}
			break;
			case "measureAllChildren": {


	cardView.setMeasureAllChildren((boolean)objValue);



			}
			break;
			case "cardUseCompatPadding": {


	cardView.setUseCompatPadding((boolean)objValue);



			}
			break;
			case "cardBackgroundColor": {


	cardView.setCardBackgroundColor((ColorStateList)objValue);



			}
			break;
			case "contentPaddingLeft": {


		setContentPaddingLeft(objValue);



			}
			break;
			case "contentPaddingRight": {


		setContentPaddingRight(objValue);



			}
			break;
			case "contentPaddingTop": {


		setContentPaddingTop(objValue);



			}
			break;
			case "contentPaddingBottom": {


		setContentPaddingBottom(objValue);



			}
			break;
			case "contentPadding": {


		setContentPadding(objValue);



			}
			break;
			case "cardCornerRadius": {


	cardView.setRadius((float)objValue);



			}
			break;
			case "cardElevation": {


	cardView.setCardElevation((float)objValue);



			}
			break;
			case "cardMaxElevation": {


	cardView.setMaxCardElevation((float)objValue);



			}
			break;
			case "cardPreventCornerOverlap": {


	cardView.setPreventCornerOverlap((boolean)objValue);



			}
			break;
		default:
			break;
		}
		
	}
	
	@Override
	@SuppressLint("NewApi")
	public Object getAttribute(WidgetAttribute key, ILifeCycleDecorator decorator) {
		Object attributeValue = ViewGroupImpl.getAttribute(this, key, decorator);
		if (attributeValue != null) {
			return attributeValue;
		}
		Object nativeWidget = asNativeWidget();
		switch (key.getAttributeName()) {
			case "measureAllChildren": {
if (Build.VERSION.SDK_INT >= 14) {
return cardView.getMeasureAllChildren();
}
break;			}
		}
		return null;
	}


	@Override
    public Object asNativeWidget() {
        return cardView;
    }
    private void nativeCreate(Map<String, Object> params) {
    }
    
    @Override
    public void requestLayout() {
    	if (isInitialised()) {
    		ViewImpl.requestLayout(this, asNativeWidget());
    	}
    }
    
    @Override
    public void invalidate() {
    	if (isInitialised()) {
    		ViewImpl.invalidate(this, asNativeWidget());
    	}
    }
    
	

	@Override
	public void setId(String id){
		if (id != null && !id.equals("")){
			super.setId(id);
			cardView.setId((int) quickConvert(id, "id"));
		}
	}
	
    

		//end - body

//start - contentpadding
private void setContentPadding(Object objValue) {
	setContentPaddingBottom(objValue);
	setContentPaddingTop(objValue);
	setContentPaddingRight(objValue);
	setContentPaddingLeft(objValue);
	
}

private void setContentPaddingBottom(Object objValue) {
	cardView.setContentPadding(cardView.getContentPaddingLeft(), cardView.getContentPaddingTop(), cardView.getContentPaddingRight(), (int) objValue);
	
}

private void setContentPaddingTop(Object objValue) {
	cardView.setContentPadding(cardView.getContentPaddingLeft(), (int) objValue, cardView.getContentPaddingRight(), cardView.getContentPaddingBottom());
}

private void setContentPaddingRight(Object objValue) {
	cardView.setContentPadding(cardView.getContentPaddingLeft(), cardView.getContentPaddingTop(), (int) objValue, cardView.getContentPaddingBottom());
}

private void setContentPaddingLeft(Object objValue) {
	cardView.setContentPadding((int) objValue, cardView.getContentPaddingTop(), cardView.getContentPaddingRight(), cardView.getContentPaddingBottom());
}
//end - contentpadding
}
