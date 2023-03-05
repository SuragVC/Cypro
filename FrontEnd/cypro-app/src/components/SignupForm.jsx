import React from 'react'
import Box from "@mui/material/Box";
import IconButton from "@mui/material/IconButton";
import OutlinedInput from "@mui/material/OutlinedInput";
import InputLabel from "@mui/material/InputLabel";
import InputAdornment from "@mui/material/InputAdornment";
import FormControl from "@mui/material/FormControl";
import TextField from "@mui/material/TextField";
import Visibility from "@mui/icons-material/Visibility";
import VisibilityOff from "@mui/icons-material/VisibilityOff";
import { Button } from "@mui/material";
export default function SignupForm() {
  const [showPassword, setShowPassword] = React.useState(false);
  const handleClickShowPassword = () => setShowPassword((show) => !show);
  const handleMouseDownPassword = (
    event: React.MouseEvent<HTMLButtonElement>
  ) => {
    event.preventDefault();
  };
  return (
    <form>
        <Box className="centerBox" style={{color:"red"}}><h3>SignUp</h3></Box>
        <Box style={{paddingLeft:20}}>
        <TextField
          sx={{ m: 1, width: "25ch" }}
          helperText="Please enter your name"
          id="demo-helper-text-aligned"
          label="Name"
        />
        <TextField
          sx={{ m: 1, width: "25ch" }}
          helperText="Please enter your email"
          id="demo-helper-text-aligned"
          label="Email"
        />
        <TextField
          sx={{ m: 1, width: "25ch" }}
          helperText="Please enter your phone no"
          id="demo-helper-text-aligned"
          label="Phone"
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
        </Box>
    </form>
  )
}
