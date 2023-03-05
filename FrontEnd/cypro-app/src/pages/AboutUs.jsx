import { Box, Typography } from '@mui/material'
import React from 'react'
import VideoBox from '../components/VideoBox'
import './style/AboutUs.css'
import panel from "../images/whyUs.mp4";

export default function AboutUs() {
  return (
    <>
    <VideoBox link={panel}  sx={{height:"500px"}}/>
    <Box className="wordBox">
      <Typography varient="p">
      At Cypro, we are passionate about providing customized computer building solutions that are tailored to your specific needs. Our team is made up of experienced professionals who share a commitment to excellence, innovation, and customer satisfaction. We believe that the right computer can help you achieve your goals, whether that's gaming, graphic design, or professional use.
      </Typography>
      <Typography varient="p">
      What sets us apart from others in our industry is our dedication to quality and craftsmanship. We use only the best components and materials to build each computer, and every system is carefully tested and inspected before it leaves our workshop. We are confident that our computers will exceed your expectations and provide you with the performance you need.
      </Typography>
      <Typography varient="p">
      As a company, we are committed to providing exceptional customer service. We understand that buying a customized computer can be a daunting experience, and we are here to help you every step of the way. Our team of experts is available to answer your questions and provide advice on the best components for your needs.
      </Typography>
      <Typography varient="p">
      Thank you for considering Cypro for your custom computer building needs. We are dedicated to providing you with a computer that is tailored to your specific requirements and will provide you with years of reliable performance. Let us help you build the computer of your dreams.
      </Typography>
    </Box>  
    <Box ><img className="aboutUsAdvertiseImage" src="https://img.freepik.com/free-photo/panoramic-shot-mountain-cadini-di-misurina-italian-alps_181624-7137.jpg?w=1380&t=st=1677421632~exp=1677422232~hmac=0a168f99e07c09a9f853c1ef485d83f9d0e99ef4c460a941ae7fa454c80a3375" alt="Asus Advertise" /></Box>
    </>
  )
}
