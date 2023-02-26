import { Box } from "@mui/material";
import React from "react";

export default function VideoBox(props) {
  const videoBoxStyle={
    overflow: "hidden",
  }
  const videoStyle={
    width:"100%",
    height:500,
    transform: "scaleX(2)"
  }
  return (
    <Box style={videoBoxStyle}>
      <video controls={false} muted autoPlay loop style={videoStyle}>
        <source src={props.link} type="video/mp4" />
        Your browser does not support the video tag.
      </video>
    </Box>
  );
}
