import React from "react";
import Homepage from "./pages/Homepage";
import { Routes, Route } from 'react-router-dom'
import AboutUs from "./pages/AboutUs";
import Products from "./pages/Products";
import SignIn from "./pages/SignIn";
import Signup from "./pages/Signup";

function App() {
  return (
      <Routes>
        <Route path="/" element={<Homepage/>}/>
        <Route path="/signIn" element={<SignIn/>}/>
        <Route path="/aboutUs" element={<AboutUs/>}/>
        <Route path="/products" element={<Products/>}/>
        <Route path="/signup" element={<Signup/>}/>
      </Routes>
  );
}

export default App;
