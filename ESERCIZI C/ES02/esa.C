#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

int main() {
    int num1 = 8, num2 = 2;  
    int operazione = 1;      

    if (fork() == 0) {
       
        if (operazione == 1) {
            exit(num1 + num2);
        } else if (operazione == 2) {
            exit(num1 * num2);
        } else {
            exit(1); 
        }
    } else {
       
        sleep(1);  
        printf("ERRORE\n");
    }

    return 0;
}