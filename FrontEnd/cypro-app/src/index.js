import React from "react";
import ReactDOM from "react-dom/client";
import { BrowserRouter } from "react-router-dom";
import App from "./App";
import "./components/style/index.css";
import Homepage from "./pages/Homepage";
import { Navbar } from "./components/Navbar";
const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(
  <BrowserRouter>
    <React.StrictMode>
      <Navbar />
      <App />
    </React.StrictMode>
  </BrowserRouter>
);
