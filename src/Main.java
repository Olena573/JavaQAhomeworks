// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    // A Homework.
    public static void main(String[] args) {
        byte q = 1;
        byte m = 3;

        short w = 30;
        short g = 45;

        int e = 123;
        int c = 341;

        //Here is an example of how to use "cast":


        long r = 145345;
        long ac = 569;
        // numeric

//Here is an example of how to use "cast":

        int ctd = (int) r + c;
        int ccr = w + c;
        //three values into int and 2 into int, both types of the "cast".


        float ayu = 45.134F;
        float ert = 679.346F;
        double b = 56.1;
        double d = 34.9;
        // numeric with a dot

        boolean tly = true;
        boolean eui = false;
        boolean opf = true;
        boolean vbn = false;
        // boolean

        char Vb = 's';
        char Je = 'g';
        //letteric types

        String ahm = "Something";
        String tuv = "Some word";
        // some String values. Weren't in the homework, but I added them.

        //here'll be some increments:
        long rc = r++;
        long kc = ac--;


        // here I put a println commands for each value
        System.out.println("These values are byte");
        System.out.println(q);
        System.out.println(m);

        //Here I'll use + and - operators with the byte type:

        System.out.println(q + m);
        System.out.println(q - m);

        System.out.println("These values are short");
        System.out.println(w);
        System.out.println(g);
        //Here I'll use * and / and - operators with the short type:

        System.out.println(w * g);
        System.out.println(g / m);

        System.out.println("These values are int");
        System.out.println(e);
        System.out.println(c);

        //Here I'll use % operator with the int type:
        System.out.println(e % c);
        System.out.println(c % e);

        System.out.println("These values are long");
        System.out.println(r);
        System.out.println(ac);
        System.out.println(rc);
        System.out.println(kc);


        System.out.println("These values are float");
        System.out.println(ayu);
        System.out.println(ert);
        System.out.println(ayu + ert);
        System.out.println(ayu - ert);


        System.out.println("These values are double");
        System.out.println(d);
        System.out.println(b);


        System.out.println("These values are boolean");
        System.out.println(tly);
        System.out.println(eui);
        System.out.println(opf);
        System.out.println(vbn);
        // here is some usage of the && operator:

        System.out.println(tly && eui);
        System.out.println(eui && vbn);
        System.out.println(tly && opf);
        System.out.println(tly && vbn);
        // here is some usage of the || operator:

        System.out.println(tly || eui);
        System.out.println(tly || opf);
        System.out.println(tly || vbn);
        System.out.println(eui || vbn);
        // Here is a usage of the ^ operator:
        System.out.println(tly ^ eui);
        System.out.println(tly ^ opf);
        System.out.println(tly ^ vbn);
        System.out.println(eui ^ vbn);


        System.out.println("These values are char");
        System.out.println(Vb);
        System.out.println(Je);

        //Here are some comparisons:

        System.out.println("Here are some comparisons results:");
        System.out.println(c < e);
        System.out.println(q < m);
        System.out.println(g <= m);
        System.out.println(m >= w);
        System.out.println(c == e);
        System.out.println(c != e);
        System.out.println("For the comparisons, I've used short, int and byte types.");

        //Math library was not mentioned in the homework, but I've decided to practice on it:
        System.out.println("Here is a Math.library usage:");

        System.out.println("Here is a maximum out of r and ac: " + Math.max(r, ac));
        System.out.println("Here is a minimum out of r and ac: " + Math.min(r, ac));

        //And an example of how to use "cast", outputed by the println:

        System.out.println("Here we casted 2 values into int and added them: " + ctd);
        System.out.println("Here we casted 2 values into int and added them: " + ccr);

        }
        }









