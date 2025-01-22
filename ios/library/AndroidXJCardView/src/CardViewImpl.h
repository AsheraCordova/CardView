//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\AndroidXJCardView\src\main\java\androidx\cardview\widget\CardViewImpl.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_CardViewImpl")
#ifdef RESTRICT_CardViewImpl
#define INCLUDE_ALL_CardViewImpl 0
#else
#define INCLUDE_ALL_CardViewImpl 1
#endif
#undef RESTRICT_CardViewImpl

#if __has_feature(nullability)
#pragma clang diagnostic push
#pragma GCC diagnostic ignored "-Wnullability"
#pragma GCC diagnostic ignored "-Wnullability-completeness"
#endif

#if !defined (ADXCardViewImpl_) && (INCLUDE_ALL_CardViewImpl || defined(INCLUDE_ADXCardViewImpl))
#define ADXCardViewImpl_

@class ADColorStateList;
@class ADContext;
@protocol ADXCardViewDelegate;

/*!
 @brief Interface for platform specific CardView implementations.
 */
@protocol ADXCardViewImpl < JavaObject >

- (void)initialize__WithADXCardViewDelegate:(id<ADXCardViewDelegate>)cardView
                              withADContext:(ADContext *)context
                       withADColorStateList:(ADColorStateList *)backgroundColor
                                  withFloat:(jfloat)radius
                                  withFloat:(jfloat)elevation
                                  withFloat:(jfloat)maxElevation OBJC_METHOD_FAMILY_NONE;

- (void)setRadiusWithADXCardViewDelegate:(id<ADXCardViewDelegate>)cardView
                               withFloat:(jfloat)radius;

- (jfloat)getRadiusWithADXCardViewDelegate:(id<ADXCardViewDelegate>)cardView;

- (void)setElevationWithADXCardViewDelegate:(id<ADXCardViewDelegate>)cardView
                                  withFloat:(jfloat)elevation;

- (jfloat)getElevationWithADXCardViewDelegate:(id<ADXCardViewDelegate>)cardView;

- (void)initStatic OBJC_METHOD_FAMILY_NONE;

- (void)setMaxElevationWithADXCardViewDelegate:(id<ADXCardViewDelegate>)cardView
                                     withFloat:(jfloat)maxElevation;

- (jfloat)getMaxElevationWithADXCardViewDelegate:(id<ADXCardViewDelegate>)cardView;

- (jfloat)getMinWidthWithADXCardViewDelegate:(id<ADXCardViewDelegate>)cardView;

- (jfloat)getMinHeightWithADXCardViewDelegate:(id<ADXCardViewDelegate>)cardView;

- (void)updatePaddingWithADXCardViewDelegate:(id<ADXCardViewDelegate>)cardView;

- (void)onCompatPaddingChangedWithADXCardViewDelegate:(id<ADXCardViewDelegate>)cardView;

- (void)onPreventCornerOverlapChangedWithADXCardViewDelegate:(id<ADXCardViewDelegate>)cardView;

- (void)setBackgroundColorWithADXCardViewDelegate:(id<ADXCardViewDelegate>)cardView
                             withADColorStateList:(ADColorStateList *)color;

- (ADColorStateList *)getBackgroundColorWithADXCardViewDelegate:(id<ADXCardViewDelegate>)cardView;

@end

J2OBJC_EMPTY_STATIC_INIT(ADXCardViewImpl)

J2OBJC_TYPE_LITERAL_HEADER(ADXCardViewImpl)

#define AndroidxCardviewWidgetCardViewImpl ADXCardViewImpl

#endif


#if __has_feature(nullability)
#pragma clang diagnostic pop
#endif
#pragma pop_macro("INCLUDE_ALL_CardViewImpl")
