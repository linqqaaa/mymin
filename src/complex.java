public class complex {
    double Re;
    double Im;

    complex () {}

    complex(double a, double b) {
        Re = a;
        Im = b;
    }

    public void mod () {
        double module = Math.sqrt(Re * Re + Im * Im);
        System.out.println(module);
    }

    public void arg () {
        double argument = Math.atan(Im / Re);
        System.out.println(argument);
    }

    public void minus (complex a) {
        double Re_ = this.Re - a.Re;
        double Im_ = this.Im - a.Im;
        System.out.println("Re: " + Re_ + " Im: " + Im_);
    }

    public void plus (complex a) {
        double Re_ = this.Re + a.Re;
        double Im_ = this.Im + a.Im;
        System.out.println("Re: " + Re_ + " Im: " + Im_);
    }
}
