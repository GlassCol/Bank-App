import React from "react";
import { Link } from "react-router-dom";
import '../CSS/home.css';

const Transaction = ({ transaction }) => {
    return (
        <tr key={transaction.id}>
            <td>{transaction.id}</td>
            <td>{transaction.origin}</td>
            <td>{transaction.destination}</td>
            <td>{transaction.value}</td>
            <td>{transaction.date}</td>
        </tr>
    )
}

export default Transaction;