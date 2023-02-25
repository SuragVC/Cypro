import 'react-slideshow-image/dist/styles.css'
import React from 'react';
import { Slide } from 'react-slideshow-image';
import 'react-slideshow-image/dist/styles.css';
import { Box } from '@mui/material';

const ImageSlider = () => {
    const images = [
        "https://www.theitdepot.com/images/headerScroll_new/Phanteks_G500A_Index.jpg",
        "https://www.theitdepot.com/assets/images/banners/index_63ecc907a91f8.jpg",
        "https://www.theitdepot.com/images/headerScroll_new/MSI_RX7900_XTX_Index.jpg",
        "https://www.theitdepot.com/images/headerScroll_new/Asus_TUF_B760_Index.jpg"
    ];

    return (
        <Slide>
            <Box className="each-slide-effect">
                <Box style={{ 'backgroundImage': `url(${images[0]})` }}>
                </Box>
            </Box>
            <Box className="each-slide-effect">
                <Box style={{ 'backgroundImage': `url(${images[1]})` }}>
                </Box>
            </Box>
            <Box className="each-slide-effect">
                <Box style={{ 'backgroundImage': `url(${images[2]})` }}>
                </Box>
            </Box>
            <Box className="each-slide-effect">
                <Box style={{ 'backgroundImage': `url(${images[3]})` }}>
                </Box>
            </Box>
        </Slide>
    );
};

export default ImageSlider;