import React, { useState } from "react";
import { Container } from "react-bootstrap";
import Logo from "../Logo.png";
import Header from "./Components/Header";
import TransactionDisplay from "./Components/TransactionDisplay";
const TransactionPage = () => {
    return (
        <div className="parent">
    <Header />
    <div>
        <TransactionDisplay />
    </div>
    </div>
    )
}

export default TransactionPage;