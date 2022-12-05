import Reaact, { Component, useEffect, useState } from 'react';
import { TransactionService } from '../Services/TransactionService';
import Transaction from './Transaction';
import { Container } from 'react-bootstrap';

const TransactionDisplay = () => {
    const [transactions, setTransactions] = useState([]);

    useEffect(() => {
        TransactionService.getTransactions().then((res) => {
            setTransactions(res.data);
        });
    }, []);

    return (
        <Container>
            <h2 className="text-center">Transaction List</h2>
            <div className="row">
                <table className="table table-striped table-bordered">
                    <thead>
                        <tr>
                            <th>Transaction Id</th>
                            <th>Origin</th>
                            <th>Destination</th>
                            <th>Value</th>
                            <th>Date</th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            transactions.map(
                                transaction =>
                                    <Transaction key={transaction.id} transaction={transaction} />
                            )
                        }
                    </tbody>
                </table>
            </div>
        </Container>
    )
}
export default TransactionDisplay;