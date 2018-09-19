package com.metin.finalkeyword.example;

public class TestFinalMethod extends SuperClass {

    public void ThisMethodCannotBeOverriden(){

    }
}

class SuperClass {

    public final void ThisMethodCannotBeOverriden(){

    }
}
