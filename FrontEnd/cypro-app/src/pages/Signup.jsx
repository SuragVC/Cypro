import { Box } from "@mui/material";
import SignupForm from "../components/SignupForm";
import VideoBox from "../components/VideoBox";
import panel from "../images/panel.mp4";
export default function Signup() {
  const formBox = {
    width: 500,
    height: 400,
    position: "absolute",
    top:150,
    left: "calc(35% - 50px)",
    padding: "1em",
    backgroundImage: "linear-gradient(to right, rgba(139, 0, 0, 0.8), rgba(139, 0, 0, 0.4))",
    borderRadius:20,
    boxShadow: "rgba(50, 50, 93, 0.25) 0px 50px 100px -20px, rgba(0, 0, 0, 0.3) 0px 30px 60px -30px, rgba(10, 37, 64, 0.35) 0px -2px 6px 0px insert"
  };
  return (
    <Box>
      <Box style={{ webkitFilter: "blur(5px)" }}>
        <VideoBox link={panel} sx={{ height: "650px" }} />
      </Box>
      <Box style={formBox}><SignupForm/></Box>
    </Box>
  );
}
