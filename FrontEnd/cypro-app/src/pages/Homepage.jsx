import { Box } from "@mui/material";
import React from "react";
import AdvertiseBox from "../components/AdvertiseBox";
import ImageSlider from "../components/ImageSlider";
import "./style/Homepage.css";
export default function Homepage() {
  return (
    <>
      <ImageSlider />
      <AdvertiseBox/>
    </>
  );
}
