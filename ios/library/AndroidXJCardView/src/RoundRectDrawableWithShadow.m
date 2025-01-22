//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\AndroidXJCardView\src\main\java\androidx\cardview\widget\RoundRectDrawableWithShadow.java
//

#include "Drawable.h"
#include "J2ObjC_source.h"
#include "RoundRectDrawableWithShadow.h"
#include "java/lang/Math.h"


inline jdouble ADXRoundRectDrawableWithShadow_get_COS_45(void);
static jdouble ADXRoundRectDrawableWithShadow_COS_45;
J2OBJC_STATIC_FIELD_PRIMITIVE_FINAL(ADXRoundRectDrawableWithShadow, COS_45, jdouble)

inline jfloat ADXRoundRectDrawableWithShadow_get_SHADOW_MULTIPLIER(void);
#define ADXRoundRectDrawableWithShadow_SHADOW_MULTIPLIER 1.5f
J2OBJC_STATIC_FIELD_CONSTANT(ADXRoundRectDrawableWithShadow, SHADOW_MULTIPLIER, jfloat)

J2OBJC_INITIALIZED_DEFN(ADXRoundRectDrawableWithShadow)

@implementation ADXRoundRectDrawableWithShadow

- (instancetype)initPackagePrivate {
  ADXRoundRectDrawableWithShadow_initPackagePrivate(self);
  return self;
}

+ (jfloat)calculateVerticalPaddingWithFloat:(jfloat)maxShadowSize
                                  withFloat:(jfloat)cornerRadius
                                withBoolean:(jboolean)addPaddingForCorners {
  return ADXRoundRectDrawableWithShadow_calculateVerticalPaddingWithFloat_withFloat_withBoolean_(maxShadowSize, cornerRadius, addPaddingForCorners);
}

+ (jfloat)calculateHorizontalPaddingWithFloat:(jfloat)maxShadowSize
                                    withFloat:(jfloat)cornerRadius
                                  withBoolean:(jboolean)addPaddingForCorners {
  return ADXRoundRectDrawableWithShadow_calculateHorizontalPaddingWithFloat_withFloat_withBoolean_(maxShadowSize, cornerRadius, addPaddingForCorners);
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x0, -1, -1, -1, -1, -1, -1 },
    { NULL, "F", 0x8, 0, 1, -1, -1, -1, -1 },
    { NULL, "F", 0x8, 2, 1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(initPackagePrivate);
  methods[1].selector = @selector(calculateVerticalPaddingWithFloat:withFloat:withBoolean:);
  methods[2].selector = @selector(calculateHorizontalPaddingWithFloat:withFloat:withBoolean:);
  #pragma clang diagnostic pop
  static const J2ObjcFieldInfo fields[] = {
    { "COS_45", "D", .constantValue.asLong = 0, 0x1a, -1, 3, -1, -1 },
    { "SHADOW_MULTIPLIER", "F", .constantValue.asFloat = ADXRoundRectDrawableWithShadow_SHADOW_MULTIPLIER, 0x1a, -1, -1, -1, -1 },
  };
  static const void *ptrTable[] = { "calculateVerticalPadding", "FFZ", "calculateHorizontalPadding", &ADXRoundRectDrawableWithShadow_COS_45 };
  static const J2ObjcClassInfo _ADXRoundRectDrawableWithShadow = { "RoundRectDrawableWithShadow", "androidx.cardview.widget", ptrTable, methods, fields, 7, 0x0, 3, 2, -1, -1, -1, -1, -1 };
  return &_ADXRoundRectDrawableWithShadow;
}

+ (void)initialize {
  if (self == [ADXRoundRectDrawableWithShadow class]) {
    ADXRoundRectDrawableWithShadow_COS_45 = JavaLangMath_cosWithDouble_(JavaLangMath_toRadiansWithDouble_(45));
    J2OBJC_SET_INITIALIZED(ADXRoundRectDrawableWithShadow)
  }
}

@end

void ADXRoundRectDrawableWithShadow_initPackagePrivate(ADXRoundRectDrawableWithShadow *self) {
  ADDrawable_init(self);
}

ADXRoundRectDrawableWithShadow *new_ADXRoundRectDrawableWithShadow_initPackagePrivate() {
  J2OBJC_NEW_IMPL(ADXRoundRectDrawableWithShadow, initPackagePrivate)
}

ADXRoundRectDrawableWithShadow *create_ADXRoundRectDrawableWithShadow_initPackagePrivate() {
  J2OBJC_CREATE_IMPL(ADXRoundRectDrawableWithShadow, initPackagePrivate)
}

jfloat ADXRoundRectDrawableWithShadow_calculateVerticalPaddingWithFloat_withFloat_withBoolean_(jfloat maxShadowSize, jfloat cornerRadius, jboolean addPaddingForCorners) {
  ADXRoundRectDrawableWithShadow_initialize();
  if (addPaddingForCorners) {
    return (jfloat) (maxShadowSize * ADXRoundRectDrawableWithShadow_SHADOW_MULTIPLIER + (1 - ADXRoundRectDrawableWithShadow_COS_45) * cornerRadius);
  }
  else {
    return maxShadowSize * ADXRoundRectDrawableWithShadow_SHADOW_MULTIPLIER;
  }
}

jfloat ADXRoundRectDrawableWithShadow_calculateHorizontalPaddingWithFloat_withFloat_withBoolean_(jfloat maxShadowSize, jfloat cornerRadius, jboolean addPaddingForCorners) {
  ADXRoundRectDrawableWithShadow_initialize();
  if (addPaddingForCorners) {
    return (jfloat) (maxShadowSize + (1 - ADXRoundRectDrawableWithShadow_COS_45) * cornerRadius);
  }
  else {
    return maxShadowSize;
  }
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ADXRoundRectDrawableWithShadow)
