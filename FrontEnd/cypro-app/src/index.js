import React from "react";
import ReactDOM from "react-dom/client";
import { BrowserRouter } from "react-router-dom";
import App from "./App";
import "./index.css";
import { Navbar } from "./components/Navbar";
import { Box } from "@mui/material";
const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(
  <BrowserRouter>
    <React.StrictMode>
      <Navbar />
        <App />
    </React.StrictMode>
  </BrowserRouter>
);
