package com.company;

public abstract class MakhlukHidup implements MakhlukHidupInterface {
    public abstract void tegak();

    public void kebutuhan() {
        System.out.println("-> butuh Makan");
        System.out.println("-> butuh Minum");
    }

    public void berkembang() {
        System.out.println("-> dapat berkembang biak");
    }
}
