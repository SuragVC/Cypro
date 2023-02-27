import React from "react";
import ProductBox from "../components/ProductBox";

import { productArr_1,productArr_2 } from "../components/scripts/products";
export default function Products() {
  return (
    <>
    <ProductBox products={Object.values(productArr_1)} />
    <ProductBox products={Object.values(productArr_2)} />
    </>
  );
}
