package com.wly.extendExercise;

public class test {
    public static void main(String[] args) {
        Pc pc = new Pc();
        NotePad notePad = new NotePad();
        pc.cpu = "i5";
        pc.memory = "东芝";
        pc.disk = "西部数据";
        pc.brand = "dell";
        notePad.cpu = "i7";
        notePad.memory = "dongzh";
        notePad.disk = "xibushuju ";
        notePad.color = "dell";
        pc.getDetail();
        notePad.getDetail();
    }
}
