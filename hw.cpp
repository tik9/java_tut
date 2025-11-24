#include <iostream>
using namespace std;

// Deklaration von summe() notwendig, weil summe() unterhalb von main()
int summe(int a,int b);

// main wird benötigt - hier läuft hauptprogramm
int main()
{
    cout << "Hello World";
    
    // aufrufen von funktion "summe()" = äussere hülle
    int sum = summe(3, 5);

    return 0; //programmende
}

// def. von "summe()" = innere "maschine"
//int=integer=zahl=rueckgabedatentyp
//int a, int b= parameter = eingabe
int summe(int a,int b){
    return a + b;
}