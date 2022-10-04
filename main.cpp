#include <iostream>
#include <cmath>
#include <iomanip>


using namespace std;

int main()
{
    cout << "A program finding the roots of a Quadratic Trinomial." << endl << endl;

    float a, b, c, discriminant, x1, x2, real;

    cout << "Enter your a, b, and c: " ;
    cin >> a >> b >> c ;

    discriminant = b*b - 4*a*c;

    if(discriminant > 0){
        cout << "The roots are real and different." << endl;
        x1 = (-b + sqrt(discriminant))/(2*a);
        cout << "x1 = " << x1 << endl;
        x2 = (-b - sqrt(discriminant))/(2*a);
        cout << "x2 = " << x2;
    }
    else if(discriminant == 0){
        cout << "The roots are the same." << endl;
        x1 = -b/(2*b);
        cout << "x1 = x2 = " << x1;
    }
    else{
        cout << "The roots are complex and are different. " << endl;
        real = -b/(2*a);
        x1 = sqrt(-discriminant)/(2*a);
        cout << "x1 = " << real << " + " << x1 << "i" << endl;
        x2 = sqrt(-discriminant)/(2*a);
        cout << "x2 = " << real << " - " << x2 << "i";
    }

    return 0;
}
