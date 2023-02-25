import { Box } from "@mui/material";
import React from "react";
import "./style/advertiseBox.css"

export default function AdvertiseBox(props) {
  return (
    <Box className="advertiseBox">
      <Box>
        <img
          src="https://www.theitdepot.com/asset/images/fractal_brand_index_box.jpg"
          alt="image 1"
        />
      </Box>
      <Box>
        <img
          src="https://www.theitdepot.com/asset/images/banner-intel-home.jpg"
          alt="image 2"
        />
      </Box>
      <Box>
        <img
          src="https://www.theitdepot.com/asset/images/banner-amd-home.jpg"
          alt="image 3"
        />
      </Box>
    </Box>
  );
}
