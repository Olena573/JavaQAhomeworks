public class Main{
// Here is a complex variation of a Homework.
    public static void main (String args[]){

        simpleNumeric();
        someMoreCompexNumeric();
        someBoolean();
        lettericAndWords();
        someCastExample();
        someFunWithMath();

        //here is a list of separate methods in the Main Method, and here are the Methods:

    }
    static void simpleNumeric(){
        //This Method works with simple numeric values
        byte q = 1;
        byte m = 3;
        short w = 30;
        short g = 45;

        byte v = (byte) 50;
        byte j = (byte) 20;

        //Here are the actions with these values:

        byte cd = (byte) (q * m);
        short aq = (short) (w / g);
        // I had to use casting values of one type to another, because without it a compiler showed an error.



        System.out.println("q is "+q);
        System.out.println("m is "+m);
        System.out.println(v);
        System.out.println(j);


        System.out.println("cd = q*m = " +cd);
        System.out.println("w = " + w);
        System.out.println("g = "+ g);
        System.out.println("aq = w/m = " +aq);
        System.out.println("Byte and Short types were used.");

    }
    static void someMoreCompexNumeric(){
        //This Method works with more complex numeric values
        int e = 123;
        int c = 341;

        long r = 145345;
        long ac = 569;

        float ayu = 45.134F;
        float ert = 679.346F;

        double b = 56.1;
        double d = 34.9;

        //Here are the actions with these values:

        System.out.println("Here are some actions with int, long, float and double values.");
        System.out.println("e - c = "+e + " " + "- c = " + (e-c));
        System.out.println("r + ac = "+r + " " + "- ac = " + (r+ac));
        System.out.println("a leftover from the deletion of ert on ayu is: " + ert%ayu);


        System.out.println("Here are increment and decrement.");
        System.out.println(e);
        e++;
        System.out.println(e);
        System.out.println(c);
        c--;
        System.out.println(c);

        System.out.println("b*d=" +b +"*" +d + "=" +b*d);


        System.out.println("Int, long, float, and double types were used.");

        System.out.println("Here are some comparisons results:");
        System.out.println(c < e);
        System.out.println(r < ac);
        System.out.println(ayu <= ert);
        System.out.println(ert >= ayu);
        System.out.println(c == e);
        System.out.println(b != d);

    }

    static void someBoolean(){
        //This Method works with boolean values

        boolean tly = true;
        boolean eui = false;
        boolean opf = true;
        boolean vbn = false;

        // here is some usage of the && operator:
        System.out.println("the && operator usage");
        System.out.println(tly && eui);
        System.out.println(eui && vbn);
        System.out.println(tly && opf);
        System.out.println(tly && vbn);

        // here is some usage of the || operator:
        System.out.println("the || operator usage");
        System.out.println(tly || eui);
        System.out.println(tly || opf);
        System.out.println(tly || vbn);
        System.out.println(eui || vbn);

        // Here is a usage of the ^ operator:
        System.out.println("the ^ operator usage");
        System.out.println(tly ^ eui);
        System.out.println(tly ^ opf);
        System.out.println(tly ^ vbn);
        System.out.println(eui ^ vbn);


        System.out.println("Here are some logical operators used with boolean operators");


    }

    static void lettericAndWords(){
        //This Method works with some letteric  values and with words
        char Vb = 's';
        char Je = 'g';
        String ahm = "Something";
        String tuv = "Some word";
        // Usage:
        System.out.println("char Vb is "+ Vb);
        System.out.println("String and chars: "+ Vb + Je + " + " + ahm + "and " +tuv);


    }
    static void someCastExample(){
        //This Method is created to show an example of the casting one type of values to another
        float r = 245;
        short c = 25;
        int w = 34;

        int ctd = (int) r + c;
        int ccr = w + c;
        //three values into int and 2 into int, both types of the "cast".
        System.out.println(ctd +"ctd =" + r + "+" + c + "=" +ctd);
        System.out.println("ccr = " +ccr + "="+ "w+"+c);
        System.out.println("Here are some cast examples.");

    }
    static void someFunWithMath(){
        //This Method is created to use Math. library
            int ae = 23678;
            int iu = 345;
            int ert = 34578;
            int tyw = 4536;
            int mn = 8697;

        System.out.println("Here is an example of the Math. library usage.");
        int een = (int)Math.floor(ae);
        int hj = (int)Math.cos(iu);
        int mk = (int)Math.min(ert, tyw);
        int pt = (int)Math.decrementExact(mn);

        System.out.println(een);
        System.out.println(hj);
        System.out.println(mk);
        System.out.println(pt);

    }

}