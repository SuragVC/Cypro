import { Box, Typography } from "@mui/material";
import React from "react";
import AdvertiseBox from "../components/AdvertiseBox.tsx";
import ImageSlider from "../components/ImageSlider";
import "./style/Homepage.css";
import  gearAdvertise  from "../images/6.png"
import  asusAdvertise  from "../images/7.jpg"
import VideoBox from "../components/VideoBox";
import backgroundVideo from '../images/SignUp.mp4'
import ProductBox from "../components/ProductBox";
import { productArr_1,productArr_2 } from "../components/scripts/products";


export default function Homepage() {
  const advertiseImages={
    add_1:"https://www.theitdepot.com/asset/images/fractal_brand_index_box.jpg",
    add_2:"https://www.theitdepot.com/asset/images/banner-intel-home.jpg",
    add_3:"https://www.theitdepot.com/asset/images/banner-amd-home.jpg"
  }
  return (
    <>
      <ImageSlider />
      <Box className="headers"><Typography variant="h2">Gear Store</Typography></Box>
      <Box ><img className="homePageAdvertiseImage" src={gearAdvertise} alt="Gear Advertise" /></Box>
      <ProductBox products={Object.values(productArr_2)} />
      <Box className="headers"><Typography variant="h2">Custom PC Build</Typography></Box>
      <VideoBox link={backgroundVideo} sx={{height:"500px"}}/>
      <AdvertiseBox images={advertiseImages}/>
      <ProductBox products={Object.values(productArr_1)} />
      <Box ><img className="homePageAdvertiseImage" src={asusAdvertise} alt="Asus Advertise" /></Box>
    </>
  );
}
