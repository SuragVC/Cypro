import { Box } from "@mui/material";
import React from "react";
import "./style/advertiseBox.css"

export default function AdvertiseBox(props) {
  return (
    <Box className="advertiseBox">
      <Box>
        <img
          src={props.images.add_1}
          alt="Advertise"
        />
      </Box>
      <Box>
        <img
          src={props.images.add_2}
          alt="Advertise"
        />
      </Box>
      <Box>
        <img
          src={props.images.add_3}
          alt="Advertise"
        />
      </Box>
    </Box>
  );
}
