import React from "react";
import Homepage from "./pages/Homepage";
import { Routes, Route } from 'react-router-dom'
import AboutUs from "./pages/AboutUs";
import Products from "./pages/Products";
import SignIn from "./pages/SignIn";


function App() {
  return (
      <Routes>
        <Route path="/" element={<Homepage/>}/>
        <Route path="/signIn" element={<SignIn/>}/>
        <Route path="/aboutUs" element={<AboutUs/>}/>
        <Route path="/products" element={<Products/>}/>
      </Routes>
  );
}

export default App;
