import { Box } from '@mui/material'
import React from 'react'
import VideoBox from '../components/VideoBox'
import './style/AboutUs.css'
import panel from "../images/whyUs.mp4";
export default function AboutUs() {
  return (
    <>
    <VideoBox link={panel} />
    </>
  )
}
