#include <stdio.h>
#include <unistd.h>

int main() {
    
    int cat1 = 3;
    int cat2 = 4;

    pid_t pid = fork(); // Creazione del processo figlio

    if (pid < 0) {
        
		// Errore nella creazione del processo figlio
        perror("Errore nella creazione del processo figlio");
        return 1;
   
    } else if (pid == 0) {
       
	    // Processo figlio
        printf("Processo figlio: calcolo del perimetro\n");
        int ipotenusa = (int)(cat1 * cat1 + cat2 * cat2); 
        printf("Perimetro del triangolo: %d\n", cat1 + cat2 + ipotenusa);
        
    } else {
      
	    // Processo padre
        printf("Processo padre: calcolo dell'area\n");
        printf("Area del triangolo: %d\n", (cat1 * cat2) / 2);
        
    }

    return 0;
}
