import { Box } from "@mui/material";
import React from "react";
import "./style/navbar.css";
import userImage from "../images/UserImage.webp"
export function Navbar() {
  return (
    <Box className="navbar">
      <Box className="logoBox">
        <img src="https://i.imgur.com/Aeon9mu.png" alt="Logo" />
        <h3>Cypro</h3>
      </Box>
        <Box className="textBoxes">
          <Box>
            <h4>Cart</h4>
          </Box>
          <Box>
            <h4>Wallet</h4>
          </Box>
          <Box>
            <h4>About Us</h4>
          </Box>
          <Box className="profileBox">
            <img src={userImage} alt="userImage" />
          </Box>
        </Box>
    </Box>
  );
}
