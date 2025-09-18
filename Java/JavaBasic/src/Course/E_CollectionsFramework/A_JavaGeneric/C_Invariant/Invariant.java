package Course.E_CollectionsFramework.A_JavaGeneric.C_Invariant;

public class Invariant<T> {

    /*
    * di java, generic type parameternya secara default adalah invariant
    * tidak bisa di turunkan / disubtitusikan dari class Parent(supertype)
    * ke child(subtype) ataupun sebaliknya
    *
    * beda konsep dengan polymorphism (berbeda bentuk), jadi tidak ada
    * hubungannya polimorpisme dengan generic di java
    * */

    private T data;

    Invariant (T data) { this.data = data; }
}
