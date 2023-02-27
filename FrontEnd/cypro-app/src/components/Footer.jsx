import { Box, Typography } from "@mui/material";
import React from "react";
import "./style/footer.css";
import DownloadImage from '../images/10.png'
export default function Footer() {
  return (
    <Box id="footerBox">
      <Box className="footerInsideBox">
        <Box className='footerLogoBox'>
          <img src="https://i.imgur.com/Aeon9mu.png" alt="Logo" />
          <h2>Cypro</h2>
        </Box>
        <Box className='footerIconBox'>
          <Typography varient='h3' style={{color:'blue'}}><i className="fa-brands fa-facebook"></i></Typography>
          <Typography varient='h3' style={{color:'red'}}><i className="fa-brands fa-instagram"></i></Typography>
          <Typography varient='h3' style={{color:'blue'}}><i className="fa-brands fa-twitter"></i></Typography>
          <Typography varient='h3'><i className="fa-brands fa-medium"></i></Typography>
        </Box>
        <Box><p>Contact: 80-120781414</p></Box>
        <Box><p className="marginZero">Cypro</p></Box>
        <Box><p className="marginZero">JSP INC</p></Box>
        <Box><p className="marginZero">MIAMI FL 33185 3700 USA</p></Box>
      </Box>
      <Box className="footerInsideBox" style={{display: 'flex'}}>
        <Box className='serviceBox'>
        <Box style={{marginLeft:30}}><h4>Services</h4></Box>
        <Box className='flexBox'><i className="fa-brands fa-uncharted" style={{fontSize: '20px',marginRight:'10px', color:'red'}}></i><p className="marginZero"> Custom Build PC</p></Box>
        <Box className='flexBox'><i className="fa-brands fa-uncharted" style={{fontSize: '20px',marginRight:'10px', color:'red'}}></i><p className="marginZero"> Gear Shop</p></Box>
        <Box className='flexBox'><i className="fa-brands fa-uncharted" style={{fontSize: '20px',marginRight:'10px', color:'red'}}></i><p className="marginZero"> Services</p></Box>
        <Box className='flexBox'><i className="fa-brands fa-uncharted" style={{fontSize: '20px',marginRight:'10px', color:'red'}}></i><p className="marginZero"> Financing</p></Box>
        <Box className='flexBox'><i className="fa-brands fa-uncharted" style={{fontSize: '20px',marginRight:'10px', color:'red'}}></i><p className="marginZero"> Gaming PC Instabuilder</p></Box>
        <Box className='flexBox'><i className="fa-brands fa-uncharted" style={{fontSize: '20px',marginRight:'10px', color:'red'}}></i><p className="marginZero"> Gaming PCs</p></Box>
        <Box className='flexBox'><i className="fa-brands fa-uncharted" style={{fontSize: '20px',marginRight:'10px', color:'red'}}></i><p className="marginZero"> Desktops</p></Box>
        <Box className='flexBox'><i className="fa-brands fa-uncharted" style={{fontSize: '20px',marginRight:'10px', color:'red'}}></i><p className="marginZero"> Servers</p></Box>
        <Box className='flexBox'><i className="fa-brands fa-uncharted" style={{fontSize: '20px',marginRight:'10px', color:'red'}}></i><p className="marginZero"> Mini PCs</p></Box>
        
        </Box>
        <Box className='serviceBox'>
        <Box style={{marginLeft:30}}><h4>Industry Solutions</h4></Box>
        <Box className='flexBox'><i className="fa-brands fa-uncharted" style={{fontSize: '20px',marginRight:'10px', color:'red'}}></i><p className="marginZero">Creative</p></Box>
        <Box className='flexBox'><i className="fa-brands fa-uncharted" style={{fontSize: '20px',marginRight:'10px', color:'red'}}></i><p className="marginZero">Construction</p></Box>
        <Box className='flexBox'><i className="fa-brands fa-uncharted" style={{fontSize: '20px',marginRight:'10px', color:'red'}}></i><p className="marginZero">Defense </p></Box>
        <Box className='flexBox'><i className="fa-brands fa-uncharted" style={{fontSize: '20px',marginRight:'10px', color:'red'}}></i><p className="marginZero">Educational </p></Box>
        <Box className='flexBox'><i className="fa-brands fa-uncharted" style={{fontSize: '20px',marginRight:'10px', color:'red'}}></i><p className="marginZero">Energy</p></Box>
        <Box className='flexBox'><i className="fa-brands fa-uncharted" style={{fontSize: '20px',marginRight:'10px', color:'red'}}></i><p className="marginZero">Engineering</p></Box>
        <Box className='flexBox'><i className="fa-brands fa-uncharted" style={{fontSize: '20px',marginRight:'10px', color:'red'}}></i><p className="marginZero">Forensics </p></Box>
        
        </Box>
      </Box>
      <Box className="footerInsideBox" style={{display: 'flex'}}>
      <Box className='serviceBox'>
        <Box style={{marginLeft:30}}><h4>Support</h4></Box>
        <Box className='flexBox'><i className="fa-brands fa-uncharted" style={{fontSize: '20px',marginRight:'10px', color:'red'}}></i><p className="marginZero">FAQ</p></Box>
        <Box className='flexBox'><i className="fa-brands fa-uncharted" style={{fontSize: '20px',marginRight:'10px', color:'red'}}></i><p className="marginZero">Sales Assistance</p></Box>
        <Box className='flexBox'><i className="fa-brands fa-uncharted" style={{fontSize: '20px',marginRight:'10px', color:'red'}}></i><p className="marginZero">Customer Service </p></Box>
        <Box className='flexBox'><i className="fa-brands fa-uncharted" style={{fontSize: '20px',marginRight:'10px', color:'red'}}></i><p className="marginZero">Technical Supports</p></Box>
        <Box className='flexBox'><i className="fa-brands fa-uncharted" style={{fontSize: '20px',marginRight:'10px', color:'red'}}></i><p className="marginZero">Refunds & Exchanges </p></Box>     
      </Box>
      <Box className='serviceBox downloadableImages centerBox'>
        <img src={DownloadImage} alt="downloadable"/>
      </Box>
      </Box>
      <Box className='centerBox' style={{width:'100%'}}><i style={{fontSize: '13px'}} className="fa-regular fa-copyright"></i><p>All Rights Reserved to Cypro. Thank You</p><i style={{fontSize: '20px',marginLeft:'10px', color:'yellow'}} className="fa-sharp fa-regular fa-face-smile-beam"></i></Box>
    </Box>
  ); 
  
}


    
    
    
    
    
    
                                                                                                                     
                                                                                                                     
                                                                                                                     
                                                                                                                     
                                                                                                                     
                                                                                                                     
   