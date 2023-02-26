import React from 'react';
import { Box } from '@mui/material';
import './style/productBox.css'
function Product(props) {
  const { image, name, price } = props;
  const handleClick = () => {
    // handle add to cart button click
  };

  return (
    <Box className='singleProductBox'>
      <img className='imageStyle' src={image} alt={name} />
      <h3>{name}</h3>
      <Box className="price_div">
        <Box>
          <h2>${price}</h2>
        </Box>
        <input id='submitButton' type="submit" value="ADD TO CART" onClick={handleClick} />
      </Box>
    </Box>
  );
}

function ProductBox(props) {
  return (
    <Box id="productBox">
      {props.products.map(product => (
        <Product key={product.name} {...product} />
      ))}
    </Box>
  );
}

export default ProductBox;
