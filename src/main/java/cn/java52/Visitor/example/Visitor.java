package cn.java52.Visitor.example;

interface Visitor
{
    void visit(ConcreteElementA element);
    void visit(ConcreteElementB element);
}