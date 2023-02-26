import React from "react";
import Homepage from "./pages/Homepage";
import { Routes, Route } from 'react-router-dom'
import AboutUs from "./pages/AboutUs";


function App() {
  return (
      <Routes>
        <Route path="/" element={<Homepage/>}/>
        <Route path="/aboutUs" element={<AboutUs/>}/>
      </Routes>
  );
}

export default App;
