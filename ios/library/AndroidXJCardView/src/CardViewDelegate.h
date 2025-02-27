//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\AndroidXJCardView\src\main\java\androidx\cardview\widget\CardViewDelegate.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_CardViewDelegate")
#ifdef RESTRICT_CardViewDelegate
#define INCLUDE_ALL_CardViewDelegate 0
#else
#define INCLUDE_ALL_CardViewDelegate 1
#endif
#undef RESTRICT_CardViewDelegate

#if !defined (ADXCardViewDelegate_) && (INCLUDE_ALL_CardViewDelegate || defined(INCLUDE_ADXCardViewDelegate))
#define ADXCardViewDelegate_

@class ADDrawable;
@class ADView;

/*!
 @brief Interface provided by CardView to implementations.
 <p>
  Necessary to resolve circular dependency between base CardView and platform implementations.
 */
@protocol ADXCardViewDelegate < JavaObject >

- (void)setCardBackgroundWithADDrawable:(ADDrawable *)drawable;

- (ADDrawable *)getCardBackground;

- (jboolean)getUseCompatPadding;

- (jboolean)getPreventCornerOverlap;

- (void)setShadowPaddingWithInt:(jint)left
                        withInt:(jint)top
                        withInt:(jint)right
                        withInt:(jint)bottom;

- (void)setMinWidthHeightInternalWithInt:(jint)width
                                 withInt:(jint)height;

- (ADView *)getCardView;

@end

J2OBJC_EMPTY_STATIC_INIT(ADXCardViewDelegate)

J2OBJC_TYPE_LITERAL_HEADER(ADXCardViewDelegate)

#define AndroidxCardviewWidgetCardViewDelegate ADXCardViewDelegate

#endif

#pragma pop_macro("INCLUDE_ALL_CardViewDelegate")
