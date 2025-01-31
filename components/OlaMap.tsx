import React from "react";
import { requireNativeComponent, View } from "react-native";

// Link the OlaMapView from the Native Android Code
const NativeOlaMapView = requireNativeComponent("OlaMapView");

const OlaMap = () => {
  return (
    <View style={{ flex: 1 }}>
      <NativeOlaMapView style={{ flex: 1 }} />
    </View>
  );
};

export default OlaMap;
