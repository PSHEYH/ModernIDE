package com.company;

import javax.sound.sampled.Line;
import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {


        double x= 2.4;
        double a= -2;
        double b= 3;

        // write your code her

        final Function exp4 = Divide.of(
                Pow.of(3,Linear.of(1),a),
                Pow.of(2,Sin.of(Sum.of(Linear.of(1),Const.of(b)),1),1)
        );
        final NumberFormat nf = NumberFormat.getInstance();
        System.out.format("f(x)=%s",exp4.toPrettyString(nf)).println();
        System.out.format("f'(x)=%s",exp4.derivative().toPrettyString(nf)).println();
        System.out.format("f(2.4)=%s",exp4.calculate(x)).println();
        System.out.format("f'(2.4)=%s",exp4.derivative().calculate(x)).println();

        final Function exp5 = Difference.of(
                Exp.of(Pow.of(2,Cos.of(Linear.of(1),1),a),1),
                Abs.of(Pow.of(5,Ln.of(Pow.of(0.5,Linear.of(1.0),1),1),b))
        );

        System.out.format("f(x)=%s",exp5.toPrettyString(nf)).println();
        System.out.format("f'(x)=%s",exp5.derivative().toPrettyString(nf)).println();
        System.out.format("f(2.4)=%s",exp5.calculate(x)).println();
        System.out.format("f'(2.4)=%s",exp5.derivative().calculate(x)).println();


        final Function exp6 = Sum.of(
                Pow.of(2,Sin.of(Linear.of(1),1),1),
                Cos.of(Ln.of(Linear.of(1),1),1)
        );

        System.out.format("f(x)=%s",exp6.toPrettyString(nf)).println();
        System.out.format("f'(x)=%s",exp6.derivative().toPrettyString(nf)).println();
        System.out.format("f(2.4)=%s",exp6.calculate(x)).println();
        System.out.format("f'(2.4)=%s",exp6.derivative().calculate(x)).println();
    }
}
