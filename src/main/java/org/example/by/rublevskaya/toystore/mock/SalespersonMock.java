package org.example.by.rublevskaya.toystore.mock;

import org.example.by.rublevskaya.toystore.worker.extendWorker.Salesperson;

public class SalespersonMock extends Salesperson {
    public SalespersonMock(String name, String position, String task, double salary, int age, String shift, double commissionRate, int toysInStock) {
        super(name, position, task, salary, age, shift, commissionRate, toysInStock);
    }
}
