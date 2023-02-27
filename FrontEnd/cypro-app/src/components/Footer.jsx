import { Box, Typography } from "@mui/material";
import React from "react";
import "./style/footer.css";
export default function Footer() {
  return (
    <Box id="footerBox">
      <Box className="footerInsideBox">
        <Box className='footerLogoBox'>
          <img src="https://i.imgur.com/Aeon9mu.png" alt="Logo" />
          <h2>Cypro</h2>
        </Box>
        <Box className='footerIconBox'>
          <Typography varient='h3' style={{color:'blue'}}><i class="fa-brands fa-facebook"></i></Typography>
          <Typography varient='h3' style={{color:'red'}}><i class="fa-brands fa-instagram"></i></Typography>
          <Typography varient='h3' style={{color:'blue'}}><i class="fa-brands fa-twitter"></i></Typography>
          <Typography varient='h3'><i class="fa-brands fa-medium"></i></Typography>
        </Box>
        <Box><p>Contact: 80-120781414</p></Box>
        <Box><p className="marginZero">Cypro</p></Box>
        <Box><p className="marginZero">JSP INC</p></Box>
        <Box><p className="marginZero">MIAMI FL 33185 3700 USA</p></Box>
      </Box>
      <Box className="footerInsideBox">
        <Box className='textCenter'><h4>Services</h4></Box>
        <Box className='flexBox'><i class="fa-brands fa-uncharted" style={{font_size: '20px'},{margin_left:'10px'}}></i><p className="marginZero"> Custom Build PC</p></Box>
      </Box>
      <Box className="footerInsideBox"></Box>
    </Box>
  );
}
