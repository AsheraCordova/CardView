// start - imports

	
import CommandAttr from '../../widget/CommandAttr';
import IWidget from '../../widget/IWidget';
import ILayoutParam from '../../widget/ILayoutParam';
import {plainToClass, Type, Exclude, Expose, Transform} from "class-transformer";
import 'babel-polyfill';
import {Gravity} from '../../widget/TypeConstants';
import {ITranform, TransformerFactory} from '../../widget/TransformerFactory';
import {Event} from '../../app/Event';
import {MotionEvent} from '../../app/MotionEvent';
import {DragEvent} from '../../app/DragEvent';
import {KeyEvent} from '../../app/KeyEvent';
import { ScopedObject } from '../../app/ScopedObject';
import { Mixin, decorate } from 'ts-mixer';














import {ViewGroupImpl_LayoutParams} from './ViewGroupImpl';

// end - imports
import {ViewGroupImpl} from './ViewGroupImpl';
export abstract class CardViewImpl<T> extends ViewGroupImpl<T>{
	//start - body
	static initialize() {
    }	
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "cardUseCompatPadding" }))
	cardUseCompatPadding!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "cardBackgroundColor" }))
	cardBackgroundColor!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "contentPaddingLeft" }))
	contentPaddingLeft!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "contentPaddingRight" }))
	contentPaddingRight!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "contentPaddingTop" }))
	contentPaddingTop!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "contentPaddingBottom" }))
	contentPaddingBottom!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "contentPadding" }))
	contentPadding!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "cardCornerRadius" }))
	cardCornerRadius!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "cardElevation" }))
	cardElevation!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "cardMaxElevation" }))
	cardMaxElevation!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "cardPreventCornerOverlap" }))
	cardPreventCornerOverlap!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "measureAllChildren" }))
	measureAllChildren!:CommandAttr<boolean>| undefined;

	@decorate(Exclude())
	protected thisPointer: T;	
	protected abstract getThisPointer(): T;
	reset() : T {	
		super.reset();
		this.cardUseCompatPadding = undefined;
		this.cardBackgroundColor = undefined;
		this.contentPaddingLeft = undefined;
		this.contentPaddingRight = undefined;
		this.contentPaddingTop = undefined;
		this.contentPaddingBottom = undefined;
		this.contentPadding = undefined;
		this.cardCornerRadius = undefined;
		this.cardElevation = undefined;
		this.cardMaxElevation = undefined;
		this.cardPreventCornerOverlap = undefined;
		this.measureAllChildren = undefined;
		return this.thisPointer;
	}
	constructor(id: string, path: string[], event:  string) {
		super(id, path, event);
		this.thisPointer = this.getThisPointer();
	}
	

	public setCardUseCompatPadding(value : boolean) : T {
		this.resetIfRequired();
		if (this.cardUseCompatPadding == null || this.cardUseCompatPadding == undefined) {
			this.cardUseCompatPadding = new CommandAttr<boolean>();
		}
		
		this.cardUseCompatPadding.setSetter(true);
		this.cardUseCompatPadding.setValue(value);
		this.orderSet++;
		this.cardUseCompatPadding.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setCardBackgroundColor(value : string) : T {
		this.resetIfRequired();
		if (this.cardBackgroundColor == null || this.cardBackgroundColor == undefined) {
			this.cardBackgroundColor = new CommandAttr<string>();
		}
		
		this.cardBackgroundColor.setSetter(true);
		this.cardBackgroundColor.setValue(value);
		this.orderSet++;
		this.cardBackgroundColor.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setContentPaddingLeft(value : string) : T {
		this.resetIfRequired();
		if (this.contentPaddingLeft == null || this.contentPaddingLeft == undefined) {
			this.contentPaddingLeft = new CommandAttr<string>();
		}
		
		this.contentPaddingLeft.setSetter(true);
		this.contentPaddingLeft.setValue(value);
		this.orderSet++;
		this.contentPaddingLeft.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setContentPaddingRight(value : string) : T {
		this.resetIfRequired();
		if (this.contentPaddingRight == null || this.contentPaddingRight == undefined) {
			this.contentPaddingRight = new CommandAttr<string>();
		}
		
		this.contentPaddingRight.setSetter(true);
		this.contentPaddingRight.setValue(value);
		this.orderSet++;
		this.contentPaddingRight.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setContentPaddingTop(value : string) : T {
		this.resetIfRequired();
		if (this.contentPaddingTop == null || this.contentPaddingTop == undefined) {
			this.contentPaddingTop = new CommandAttr<string>();
		}
		
		this.contentPaddingTop.setSetter(true);
		this.contentPaddingTop.setValue(value);
		this.orderSet++;
		this.contentPaddingTop.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setContentPaddingBottom(value : string) : T {
		this.resetIfRequired();
		if (this.contentPaddingBottom == null || this.contentPaddingBottom == undefined) {
			this.contentPaddingBottom = new CommandAttr<string>();
		}
		
		this.contentPaddingBottom.setSetter(true);
		this.contentPaddingBottom.setValue(value);
		this.orderSet++;
		this.contentPaddingBottom.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setContentPadding(value : string) : T {
		this.resetIfRequired();
		if (this.contentPadding == null || this.contentPadding == undefined) {
			this.contentPadding = new CommandAttr<string>();
		}
		
		this.contentPadding.setSetter(true);
		this.contentPadding.setValue(value);
		this.orderSet++;
		this.contentPadding.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setCardCornerRadius(value : string) : T {
		this.resetIfRequired();
		if (this.cardCornerRadius == null || this.cardCornerRadius == undefined) {
			this.cardCornerRadius = new CommandAttr<string>();
		}
		
		this.cardCornerRadius.setSetter(true);
		this.cardCornerRadius.setValue(value);
		this.orderSet++;
		this.cardCornerRadius.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setCardElevation(value : string) : T {
		this.resetIfRequired();
		if (this.cardElevation == null || this.cardElevation == undefined) {
			this.cardElevation = new CommandAttr<string>();
		}
		
		this.cardElevation.setSetter(true);
		this.cardElevation.setValue(value);
		this.orderSet++;
		this.cardElevation.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setCardMaxElevation(value : string) : T {
		this.resetIfRequired();
		if (this.cardMaxElevation == null || this.cardMaxElevation == undefined) {
			this.cardMaxElevation = new CommandAttr<string>();
		}
		
		this.cardMaxElevation.setSetter(true);
		this.cardMaxElevation.setValue(value);
		this.orderSet++;
		this.cardMaxElevation.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setCardPreventCornerOverlap(value : boolean) : T {
		this.resetIfRequired();
		if (this.cardPreventCornerOverlap == null || this.cardPreventCornerOverlap == undefined) {
			this.cardPreventCornerOverlap = new CommandAttr<boolean>();
		}
		
		this.cardPreventCornerOverlap.setSetter(true);
		this.cardPreventCornerOverlap.setValue(value);
		this.orderSet++;
		this.cardPreventCornerOverlap.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetMeasureAllChildren() : T {
		this.resetIfRequired();
		if (this.measureAllChildren == null || this.measureAllChildren == undefined) {
			this.measureAllChildren = new CommandAttr<boolean>()
		}
		
		this.measureAllChildren.setGetter(true);
		this.orderGet++;
		this.measureAllChildren.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public isMeasureAllChildren() : boolean {
		if (this.measureAllChildren == null || this.measureAllChildren == undefined) {
			this.measureAllChildren = new CommandAttr<boolean>();
		}
		return this.measureAllChildren.getCommandReturnValue();
	}
	public setMeasureAllChildren(value : boolean) : T {
		this.resetIfRequired();
		if (this.measureAllChildren == null || this.measureAllChildren == undefined) {
			this.measureAllChildren = new CommandAttr<boolean>();
		}
		
		this.measureAllChildren.setSetter(true);
		this.measureAllChildren.setValue(value);
		this.orderSet++;
		this.measureAllChildren.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		
	//end - body

}
	
//start - staticinit
export abstract class CardViewImpl_LayoutParams<T> extends ViewGroupImpl_LayoutParams<T> {
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "layout_gravity" }))
	layout_gravity!:CommandAttr<Gravity[]>| undefined;
	@decorate(Exclude())
	protected thisPointer: T;	
	protected abstract getThisPointer(): T;
	reset() : T {	
		super.reset();
		this.layout_gravity = undefined;
		return this.thisPointer;
	}
	constructor() {
		super();
		this.thisPointer = this.getThisPointer();
	}
	
	public tryGetLayoutGravity() : T {
		if (this.layout_gravity == null || this.layout_gravity == undefined) {
			this.layout_gravity = new CommandAttr<Gravity[]>()
		}
		
		this.layout_gravity.setGetter(true);
		this.orderGet++;
		this.layout_gravity.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getLayoutGravity() : Gravity[] {
		if (this.layout_gravity == null || this.layout_gravity == undefined) {
			this.layout_gravity = new CommandAttr<Gravity[]>();
		}
this.layout_gravity.setTransformer('gravity');		return this.layout_gravity.getCommandReturnValue();
	}
	public setLayoutGravity(...value : Gravity[]) : T {
		if (this.layout_gravity == null || this.layout_gravity == undefined) {
			this.layout_gravity = new CommandAttr<Gravity[]>();
		}
		this.layout_gravity.setSetter(true);
		this.layout_gravity.setValue(value);
		this.orderSet++;
		this.layout_gravity.setOrderSet(this.orderSet);
this.layout_gravity.setTransformer('gravity');		return this.thisPointer;
	}
}

export class CardView_LayoutParams extends CardViewImpl_LayoutParams<CardView_LayoutParams> implements ILayoutParam {
    getThisPointer(): CardView_LayoutParams {
        return this;
    }

   	constructor() {
		super();	
	}
}

export class CardView extends CardViewImpl<CardView> implements IWidget{
    getThisPointer(): CardView {
        return this;
    }
    
   	public getClass() {
		return CardView;
	}
	
   	constructor(id: string, path: string[], event: string) {
		super(id, path, event);	
	}
}

CardViewImpl.initialize();

//end - staticinit
