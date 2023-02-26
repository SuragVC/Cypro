import { Box } from "@mui/material";
import React from "react";
import "./style/advertiseBox.css"

export default function AdvertiseBox(props) {
  return (
    <Box className="advertiseBox">
      <Box>
        <img
          src={props.images.add_1}
          alt="image 1"
        />
      </Box>
      <Box>
        <img
          src={props.images.add_2}
          alt="image 2"
        />
      </Box>
      <Box>
        <img
          src={props.images.add_3}
          alt="image 3"
        />
      </Box>
    </Box>
  );
}
