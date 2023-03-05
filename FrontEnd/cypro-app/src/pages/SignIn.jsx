import React from "react";
import Box from "@mui/material/Box";
import IconButton from "@mui/material/IconButton";
import OutlinedInput from "@mui/material/OutlinedInput";
import InputLabel from "@mui/material/InputLabel";
import InputAdornment from "@mui/material/InputAdornment";
import FormControl from "@mui/material/FormControl";
import TextField from "@mui/material/TextField";
import Visibility from "@mui/icons-material/Visibility";
import VisibilityOff from "@mui/icons-material/VisibilityOff";
import "./style/SignIn.css";
import { Button } from "@mui/material";
import GoogleLogo from '../images/googlelogo.png'
import GithubLogo from '../images/gitlogo.png'
import { useNavigate } from 'react-router-dom';
export default function SignIn() {
  const [showPassword, setShowPassword] = React.useState(false);
  const handleClickShowPassword = () => setShowPassword((show) => !show);
  const handleMouseDownPassword = (
    event: React.MouseEvent<HTMLButtonElement>
  ) => {
    event.preventDefault();
  };
  const Navigate = useNavigate();
  const sigupButton=()=>{
    Navigate("/signup")
  }
  return (
    <Box className="centerBox signinDiv">
      <Box className="signinBox">
      <Box className='centerBox'  style={{color:'blue'}}><h3>Sign In</h3></Box>
        <TextField
          sx={{ m: 1, width: "25ch" }}
          helperText="Please enter your email"
          id="demo-helper-text-aligned"
          label="Email"
        />
        <FormControl sx={{ m: 1, width: "25ch" }} variant="outlined">
          <InputLabel htmlFor="outlined-adornment-password">
            Password
          </InputLabel>
          <OutlinedInput
            id="outlined-adornment-password"
            type={showPassword ? "text" : "password"}
            endAdornment={
              <InputAdornment position="end">
                <IconButton
                  aria-label="toggle password visibility"
                  onClick={handleClickShowPassword}
                  onMouseDown={handleMouseDownPassword}
                  edge="end"
                >
                  {showPassword ? <VisibilityOff /> : <Visibility />}
                </IconButton>
              </InputAdornment>
            }
            label="Password"
          />
        </FormControl>
        <Box className="centerBox">
          <Button variant="contained">Submit</Button>
        </Box>
        <Box className='centerBox signInboxLogos'>
          <img src={GoogleLogo} alt='googleLogo'/>
          <img src={GithubLogo} alt='githubLogo'/>
        </Box>
        <Box style={{color:'black'}}>
          <p style={{fontSize:'12px'}}>New to Cypro ?<span style={{color:'red',fontSize:'13px'}} onClick={sigupButton}>Join Now</span></p></Box>
      </Box>
    </Box>
  );
}
