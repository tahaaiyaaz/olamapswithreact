import React from "react";
import { SafeAreaView } from "react-native";
import OlaMap from "./components/OlaMap"; // Import Ola Map Component

export default function App() {
  return (
    <SafeAreaView style={{ flex: 1 }}>
      <OlaMap />
    </SafeAreaView>
  );
}